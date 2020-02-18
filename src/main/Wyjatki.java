package main;

import wyjatek.MojWyjatekException;

import java.io.FileWriter;
import java.util.Scanner;

public class Wyjatki {
    public static void main(String[] args) throws MojWyjatekException {

        Wyjatki w = new Wyjatki();
        w.wczytajZnaki();

    }

    public void wczytajZnaki() throws MojWyjatekException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Wprowadź liczbę: ");
        String znaki = sc.nextLine();

        if (znaki.length()==0) {
            System.out.println(new MojWyjatekException("Pusty ciąg znaków!"));
            wczytajZnaki();
        }

        int x = 0;

        try {
            x = Integer.parseInt(znaki);

            System.out.println("Liczba to: " + x);
        } catch (Exception ex){
            System.out.println(new MojWyjatekException("To nie jest liczba"));
            ex.printStackTrace();
            wczytajZnaki();
        }
    }
}
