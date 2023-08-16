package Zadania;

import java.io.*;
import java.util.Scanner;

/*
Zapisz plik, który znajduje się w załączonych materiałach, przenieś do projektu, a następnie:

a) wypisz jego zawartość na ekran

b) zlicz i wypisz ilość znaków występujących w pliku

c) wczytaj dowolny tekst z klawiatury i sprawdź czy znajduje się dana fraza pliku

d) w pliku może znajdować się wiele takich fraz. Znajdź wszystkie i wypisz nr linii wraz z całą linią tam gdzie znajduje się szukany tekst w postaci:
<nr linii>: <cała linia z szukanym tekstem>
// Zakomentuj wypisywanie z podpunktu a), aby wynik był czytelniejszy

e) przekopiuj całą zwartość do nowego pliku o nazwie "fragment-kopia.txt". Otwórz plik i sprawdź czy kopia została poprawnie utworzona. Dopisz na końcu pliku "Kopia pliku utworzona przez <imię nazwisko>"
 */

public class IO_File {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj szukaną frazę ");
        String zawiera = scanner.nextLine();
        try {

            String line;
            boolean czyZawieraFraze = false;
            int liczbaZnakow = 0;
            int wers = 0;

            //String path = "D:\\aprogramy\\fragment .txt";
            File file = new File("D:\\aprogramy\\fragment .txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String siezka = "fragment-kopoia.txt";
            FileWriter fileWriter = new FileWriter(siezka);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            while ((line = bufferedReader.readLine()) != null) {

                wers ++;
               // System.out.println(line);
                liczbaZnakow = line.length()+ liczbaZnakow;

                if(line.toLowerCase().contains(zawiera)){
                    czyZawieraFraze = true;
                }

                if(line.toLowerCase().contains(zawiera)){
                    System.out.println(wers + " : " + line);

                }
                bufferedWriter.write(line + "\n");


            }

            System.out.println();
            System.out.println("Liczba znaków w pliku to : " + liczbaZnakow);
            System.out.println("czy zawiera frazę : " + czyZawieraFraze);

            bufferedWriter.write("\n" + "Kopia pliku utworzona przez Michała Wolnego");
            bufferedWriter.close();
            bufferedReader.close();
            scanner.close();


        } catch(FileNotFoundException e){
            System.out.println("Nie znaleźiono pliku ");
        } catch(IOException e){
            System.out.println("Problem z wczytaniem pliku ");
        }



    }
}
