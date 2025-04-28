import java.util.ArrayList;

public class EvidenicijaVozila {

    private ArrayList<Vozilo> vozila=new ArrayList<>();

    public EvidenicijaVozila() {
        ArrayList<Vozilo> vozila= new ArrayList<>();
    }

    public void dodajVozilo(Vozilo vozilo){
       vozila.add(vozilo);
    }


}
