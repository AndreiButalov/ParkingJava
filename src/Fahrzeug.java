public class Fahrzeug {
    private String kennzeichen;

    public Fahrzeug(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

   @Override
    public String toString() {
        return "" + kennzeichen ;
    }
}
