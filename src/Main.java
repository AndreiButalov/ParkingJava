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

        System.out.println(parkhaus.einfahrt(auto));
        System.out.println(parkhaus.einfahrt(auto1));
        System.out.println(parkhaus.einfahrt(auto2));
        System.out.println(parkhaus.einfahrt(auto3));
        System.out.println(parkhaus.einfahrt(auto4));
        System.out.println(parkhaus.einfahrt(auto5));
        ///// über voll
        //System.out.println(parkhaus.einfahrt(auto6));

        System.out.println(parkhaus.ausfahrt(auto));
        System.out.println(parkhaus.ausfahrt(auto3));

        System.out.println(parkhaus.isFrei());


        System.out.println(parkhaus.einfahrt(auto));
        //System.out.println(parkhaus.ausfahrt(auto));
        System.out.println(parkhaus.einfahrt(auto5));
        System.out.println(parkhaus.isFrei());

    }
}