import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Scanner console = new Scanner(System.in);
        System.out.println("Geben Sie bitte anzahl der Etagen ein: ");
        int anzahlDerEtagen = console.nextInt();
        System.out.println("Geben Sie bitte anzahl der Parkplaetze ein: ");
        int anzahlDerParkplaetze = console.nextInt();
        System.out.println("Das Parkhaus wird gebaut.");
        */
        int anzahlDerEtagen = 2;
        int anzahlDerParkplaetze = 3;

        Parkhaus parkhaus = new Parkhaus(anzahlDerEtagen,anzahlDerParkplaetze);

        Motorrad motorrad = new Motorrad("k234");

        Auto auto = new Auto("k123");
        Auto auto1 = new Auto("k236");
        Auto auto2 = new Auto("k336");
        Auto auto3 = new Auto("k436");
        Auto auto4 = new Auto("k536");
        Auto auto5 = new Auto("k636");
        Auto auto6 = new Auto("k666");

        parkhaus.einfahrt(auto);
        parkhaus.einfahrt(auto1);
        parkhaus.einfahrt(auto2);
        parkhaus.einfahrt(auto3);
        parkhaus.einfahrt(auto4);
        parkhaus.einfahrt(auto5);
        //parkhaus.einfahrt(auto6);

        ///// über voll
        //parkhaus.einfahrt(auto6);

        parkhaus.ausfahrt(auto);
        parkhaus.ausfahrt(auto3);

        parkhaus.isFrei();


        parkhaus.einfahrt(auto);
        //Sparkhaus.ausfahrt(auto);
        parkhaus.einfahrt(auto5);
        parkhaus.isFrei();

    }
}