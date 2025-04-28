public class Vozilo {

    private String registarskaOznaka;
    private String markaVozila;
    private int godinaProizvodnje;

    public Vozilo() {
    }

    public void ucitajPodatke(String registarskaOznaka, String markaVozila, int godinaProizvodnje)throws NeispravniPodatciException{
        this.registarskaOznaka=registarskaOznaka;
        this.markaVozila=markaVozila;
        if(godinaProizvodnje<=0){
            throw new NeispravniPodatciException("Godina proizvodnje ne moze biti negativna");
        }
        this.godinaProizvodnje=godinaProizvodnje;
    }

    public void prikaziPodatke(){
        System.out.println("Registarska oznaka vozila: "+registarskaOznaka+
        "\nMarka vozila: "+markaVozila+"\nGodina proizvodnje: "+godinaProizvodnje);
    }

    public String getRegistarskaOznaka() {
        return registarskaOznaka;
    }

    public void setRegistarskaOznaka(String registarskaOznaka) {
        this.registarskaOznaka = registarskaOznaka;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje)throws NeispravniPodatciException {
        if (godinaProizvodnje <= 0) {
            throw new NeispravniPodatciException("Godina proizvodnje ne moze biti negativna");
        }
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public String getMarkaVozila() {
        return markaVozila;
    }

    public void setMarkaVozila(String markaVozila) {
        this.markaVozila = markaVozila;
    }
}
