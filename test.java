
import java.util.Scanner;
import java.io.*;
public class test {
    public static void main(String[] args) {

        final double nModulo = 3 / 4.5;
        System.out.println("Bitte Vornamen eingeben: ");
        Scanner eingabe = new Scanner(System.in);
        String vName = eingabe.next();

        System.out.println("Hallo Welt "+vName);
        System.out.println("Modulo " + nModulo);

    }

}
