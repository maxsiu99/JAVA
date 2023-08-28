package Zadania.Podsumowanie;

import Zadania.Podsumowanie.Samsung.UE43RU172;

import java.util.Scanner;

public class PodsumowanieMain {
    public static void main(String[] args) {
        obslugaTV();
    }

    private static void obslugaTV() {
        Scanner scaner = new Scanner(System.in);
        Telewizor tv = new UE43RU172("unikalneid");

        int opcja = 0;
        System.out.println("1. Włącz; 2. Wyłącz; 3. Zmień program; 4. Zakończ program; ");
        while (opcja != 4) {
            opcja = scaner.nextInt();

            switch (opcja) {
                case 1:
                    tv.wlacz();
                    break;
                case 2:
                    tv.wylacz();
                    break;
                case 3:
                    System.out.println("podaj kanał ");
                    int kanal = scaner.nextInt();
                    tv.przelaczProgram(kanal);
                    break;
                case 4:
                    System.out.println("zamykam program");


            }


        }


    }
}
