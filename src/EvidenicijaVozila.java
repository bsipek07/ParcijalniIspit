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


}
