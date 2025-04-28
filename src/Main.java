import java.io.IOException;

public class Main {

    public static void main(String[] args) throws NeispravniPodatciException, IOException {

        Automobil a1 = new Automobil(5);
        Automobil a2 = new Automobil(3);
        a1.ucitajPodatke("ZG6828JD","Audi",2010);
        a2.ucitajPodatke("ZG1905NP","Volkswagen",2013);

        Motocikl m1= new Motocikl("benzinski");
        Motocikl m2= new Motocikl("benzinski");
        m1.ucitajPodatke("KR145ME","Suzuki",2022);
        m2.ucitajPodatke("ZG765IJ","BMW",2015);

        EvidenicijaVozila listaVozila = new EvidenicijaVozila();

        listaVozila.dodajVozilo(a1);
        listaVozila.dodajVozilo(a2);
        listaVozila.dodajVozilo(m1);
        listaVozila.dodajVozilo(m2);

        listaVozila.spremiPodatkeUDatoteku();

    }
}
