package Zadania.Scanner;

import java.util.Scanner;

public class ScanerMain {
    public static void main(String[] args) {

/*
Zadanie 1
Wykorzystując Scanner wczytaj wpisane z klawiatury imię, nazwisko oraz wzrost. Następnie wypisz na ekran zdanie:
“Jestem <imię> <nazwisko> i mam <wzrost> cm wzrostu”
 */

       Scanner scanner = new Scanner(System.in);
 /*        System.out.println("Podaj imię nazwisko i wzrost");
        String imie = scanner.nextLine();
        String nazwisko = scanner.nextLine();
        String wzrost  = scanner.nextLine();

        System.out.println("imie - " + imie +" nazwisko - " + nazwisko + " wzrost - "+ wzrost);
*/


/*
Zadanie 2
Wczytuj z klawiatury dane do momentu napotkania małego ‘x’ bądź dużego ‘X’. Wypisuj na ekran teksty, które są oddzielane średnikiem ';'
 */

/*
        String dox;
        while (!(dox = scanner.next()).equals("X")){

            System.out.println("napisane - " + dox + " ; ");
        }
        System.out.println("zakończyłem zadanie ");
 */


/*
 Zadanie 3
Wczytaj całą linię tekstu z klawiatury. Następnie pobierz liczbę. Wypisz na ekran wczytaną linię tyle razy ile wynosi podana liczba
 */
/*
        int cyfra;

        String tekst3;
        tekst3 = scanner.nextLine();
        System.out.println(tekst3);
        cyfra = tekst3.length();
        System.out.println(cyfra);

        for(int i = 0; i <cyfra; i++){
            if(tekst3.equals(" ")){

            }
            System.out.println(tekst3);
        }

*/




/*
Zadanie 4
Wczytuj liczby i licz ich sumę. Zakończ działanie w momencie napotkania liczby ujemnej
 */

        int suma =0 ;
        int zad4 =0;

        while (zad4>=0){
            zad4= scanner.nextInt();
            suma += zad4;
            System.out.println(suma);


        }





    }
}