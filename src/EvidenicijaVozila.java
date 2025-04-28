import java.io.*;
import java.util.ArrayList;

public class EvidenicijaVozila {

    private ArrayList<Vozilo> vozila=new ArrayList<>();

    public EvidenicijaVozila() {
         vozila= new ArrayList<>();
    }

    public void dodajVozilo(Vozilo vozilo){
       vozila.add(vozilo);
    }

    public void spremiPodatkeUDatoteku()throws IOException {
    try(BufferedWriter writer= new BufferedWriter(new FileWriter("C:/Users/PC/Downloads/listaVozila.txt"))){
        for(Vozilo vozilo: vozila){
            writer.write(vozilo.voziloToString());
        }
    }catch (IOException e){
       System.out.println("Greška pri pisanju:" + e.getMessage());
    }

    }
    public void ucitajPodatkeUDatoteku(File fajl) {
        try (BufferedReader br = new BufferedReader(new FileReader(fajl))) {
            String linija;
            while ((linija = br.readLine()) != null) {
                if (linija.startsWith("Vozilo{")) {

                    int registracijaIndex = linija.indexOf("Registarska");
                    int markaIndex = linija.indexOf("Marka");
                    int godinaProizvodnjeIndex = linija.indexOf("Godina");
                    int brojVrataIndex = linija.indexOf("Broj");
                    int tipMotoraIndex = linija.indexOf("Tip");

                    if (registracijaIndex != -1 && markaIndex != -1 && godinaProizvodnjeIndex != -1) {
                        String regData = linija.substring(registracijaIndex + 27, markaIndex).trim();
                        String markaData = linija.substring(markaIndex + 14, godinaProizvodnjeIndex).trim();

                        int krajPodatka;
                        if (brojVrataIndex != -1) {
                            krajPodatka = brojVrataIndex;
                        } else {
                            krajPodatka = tipMotoraIndex;
                        }
                        int godinaProizvodnje = Integer.parseInt(
                                linija.substring(godinaProizvodnjeIndex + 20, krajPodatka).trim()
                        );

                        if (brojVrataIndex != -1) {

                            String vrataData = linija.substring(brojVrataIndex + 12, linija.indexOf("}")).trim();
                            int brojVrata = Integer.parseInt(vrataData);

                            Automobil auto = new Automobil(brojVrata);
                            auto.ucitajPodatke(regData, markaData, godinaProizvodnje);
                            vozila.add(auto);
                            System.out.println("Učitano vozilo: (Automobil)");
                            auto.prikaziPodatke();
                        } else if (tipMotoraIndex != -1) {

                            String tipMotoraData = linija.substring(tipMotoraIndex + 12, linija.indexOf("}")).trim();

                            Motocikl moto = new Motocikl(tipMotoraData);
                            moto.ucitajPodatke(regData, markaData, godinaProizvodnje);
                            vozila.add(moto);
                            System.out.println("Učitano vozilo: (Motocikl)");
                            moto.prikaziPodatke();
                        } else {
                            System.out.println("Greška: Nepoznat tip vozila!");
                        }
                    } else {
                        System.out.println("Greška pri parsiranju linije: " + linija);
                    }
                }
            }
        } catch (IOException | NeispravniPodatciException e) {
            System.out.println("Greška pri čitanju: " + e.getMessage());
        }
    }

}
