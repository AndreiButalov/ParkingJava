import java.util.Arrays;
public class Parkhaus {
    private int anzahlDerEtagen;
    private int anzahlDerPlaetze;
    private String[][] parkhaus;

    public Parkhaus(int anzahlDerEtagen, int anzahlDerPlaetze) {
        this.anzahlDerEtagen = anzahlDerEtagen;
        this.anzahlDerPlaetze = anzahlDerPlaetze;
        this.parkhaus = new String[anzahlDerEtagen][anzahlDerPlaetze];
    }

    public int getAnzahlDerEtagen() {
        return anzahlDerEtagen;
    }

    public void setAnzahlDerEtagen(int anzahlDerEtagen) {
        this.anzahlDerEtagen = anzahlDerEtagen;
    }

    public int getAnzahlDerPlaetze() {
        return anzahlDerPlaetze;
    }

    public void setAnzahlDerPlaetze(int anzahlDerPlaetze) {
        this.anzahlDerPlaetze = anzahlDerPlaetze;
    }

    public String einfahrt(Fahrzeug fahrzeug) {
        /*
        guckt ob das Auto exestiert ist
         */
        for (int i = 0; i < anzahlDerEtagen; i++) {
            for (int j = 0; j < anzahlDerPlaetze; j++) {
                if (parkhaus[i][j] == null){
                    continue;
                } else
                    if (parkhaus[i][j].equals(String.valueOf(fahrzeug))){
                        return "Das Auto ist schon exestiert";
                    }
            }
        }
        /*
        einfahrt des Autos
         */
        for (int i = 0; i < anzahlDerEtagen; i++){
            for (int j = 0; j < anzahlDerPlaetze; j++){
                if (parkhaus[i][j] != null) {
                    continue;
                } else {
                    parkhaus[i][j] = String.valueOf(fahrzeug);
                    System.out.println(Arrays.deepToString(parkhaus));// TEST
                    return "Das Fahrzeug mit dem Kennzeichen " + fahrzeug
                             + " wird auf der Etage " + i + ", Platz Nummer "
                             + (j + 1) + " geparkt.";
                }
            }
        }
        return "Leider gibt es keine Plaetze mehr!";
    }

    public String ausfahrt(Fahrzeug fahrzeug) {
        for (int i = 0; i < anzahlDerEtagen; i++) {
            for (int j = 0; j < anzahlDerPlaetze; j++) {
                if (parkhaus[i][j] == null){
                    continue;
                } else if (parkhaus[i][j].equals(String.valueOf(fahrzeug))) {
                    parkhaus[i][j] = null;
                    System.out.println(Arrays.deepToString(parkhaus));//TEST
                    return "Das auto mit dem Nummer " + fahrzeug + " ist weg";
                }
            }
        }
        return "Leider ist Das Auto nicht da, Versuhen Sie bitte noch ein mal";
    }

    public String isFrei(){
        for (int i = 0; i < anzahlDerEtagen; i++) {
            for (int j = 0; j < anzahlDerPlaetze; j++) {
                if (parkhaus[i][j] == null) {
                    System.out.println("Der Platz "+ (j + 1) +" auf der Etage " + i + " ist frei");
                }
            }
        }
        return "";
    }
}