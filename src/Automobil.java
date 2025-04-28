public class Automobil extends Vozilo{

    private int brojVrata;

    public Automobil(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    @Override
    public void prikaziPodatke() {
        System.out.println("Registarska oznaka vozila: "+getRegistarskaOznaka()+
                "\nMarka vozila: "+getMarkaVozila()+"\nGodina proizvodnje: "+getGodinaProizvodnje()+
                "\nBroj vrata: "+brojVrata);
    }
}
