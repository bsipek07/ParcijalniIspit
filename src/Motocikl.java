public class Motocikl extends Vozilo {

    private String tipMotora;

    public Motocikl(String tipMotora) {
        this.tipMotora = tipMotora;
    }

    public String getTipMotora() {
        return tipMotora;
    }

    public void setTipMotora(String tipMotora) {
        this.tipMotora = tipMotora;
    }

    @Override
    public void prikaziPodatke() {
        System.out.println("Registarska oznaka vozila: "+getRegistarskaOznaka()+
                "\nMarka vozila: "+getMarkaVozila()+"\nGodina proizvodnje: "+getGodinaProizvodnje()+
                "\nTip motora: "+tipMotora);
    }

    @Override
    public String voziloToString() {
        return "\nVozilo{"+"\nRegistarska oznaka vozila: "+getRegistarskaOznaka()+
                "\nMarka vozila: "+getMarkaVozila()+"\nGodina proizvodnje: "+getGodinaProizvodnje()+
                "\nTip motora: "+tipMotora+" }";
    }
}
