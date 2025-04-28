public class NeispravniPodatciException extends Exception{

    private String poruka;

    public NeispravniPodatciException(String poruka) {
        super(poruka);
    }
}
