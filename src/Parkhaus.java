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

    public void einfahrt(Fahrzeug fahrzeug) {
        /*
        guckt ob das Auto exestiert ist
         */
        for (int i = 0; i < anzahlDerEtagen; i++) {
            for (int j = 0; j < anzahlDerPlaetze; j++) {
                if (parkhaus[i][j] == null){
                    continue;
                } else
                    if (parkhaus[i][j].equals(String.valueOf(fahrzeug))){
                        System.out.println("Das Auto ist schon exestiert");
                        return;
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
                    System.out.println("Das Fahrzeug mit dem Kennzeichen " + fahrzeug
                            + " wird auf der Etage " + i + ", Platz Nummer "
                            + (j + 1) + " geparkt.");
                    return;
                }
            }
        }
    }

    public void ausfahrt(Fahrzeug fahrzeug) {
        for (int i = 0; i < anzahlDerEtagen; i++) {
            for (int j = 0; j < anzahlDerPlaetze; j++) {
                if (parkhaus[i][j] == null){
                    continue;
                } else if (parkhaus[i][j].equals(String.valueOf(fahrzeug))) {
                    parkhaus[i][j] = null;
                    System.out.println(Arrays.deepToString(parkhaus));//TEST
                    System.out.println("Das auto mit dem Nummer " + fahrzeug + " ist weg");
                }else {
                    System.out.println("Leider ist Das Auto nicht da, Versuhen Sie bitte noch ein mal");
                    return ;
                }
            }
        }

    }

    public void isFrei(){
        for (int i = 0; i < anzahlDerEtagen; i++) {
            for (int j = 0; j < anzahlDerPlaetze; j++) {
                if (parkhaus[i][j] == null) {
                    System.out.println("Der Platz "+ (j + 1) +" auf der Etage " + i + " ist frei");
                    return;
                }
            }
        }
    }
}