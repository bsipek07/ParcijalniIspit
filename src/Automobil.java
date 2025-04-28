public class Automobil extends Vozilo{

    private int brojVrata;

    public Automobil(int brojVrata) throws NeispravniPodatciException{

        if(brojVrata<0){
            throw new NeispravniPodatciException("Broj vrata ne moze biti negativan");
        }
        this.brojVrata = brojVrata;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata)throws NeispravniPodatciException {
        if(brojVrata<0){
            throw new NeispravniPodatciException("Broj vrata ne moze biti negativan");
        }
        this.brojVrata = brojVrata;
    }

    @Override
    public void prikaziPodatke() {
        System.out.println("Registarska oznaka vozila: "+getRegistarskaOznaka()+
                "\nMarka vozila: "+getMarkaVozila()+"\nGodina proizvodnje: "+getGodinaProizvodnje()+
                "\nBroj vrata: "+brojVrata);
    }

    @Override
    public String voziloToString() {
        return "\nVozilo{"+"\nRegistarska oznaka vozila: "+getRegistarskaOznaka()+
                "\nMarka vozila: "+getMarkaVozila()+"\nGodina proizvodnje: "+getGodinaProizvodnje()+
                "\nBroj vrata: "+brojVrata+" }";
    }


}
