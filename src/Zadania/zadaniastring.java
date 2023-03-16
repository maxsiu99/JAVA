package Zadania;

public class zadaniastring {
    public static void main(String[] args) {

        /*
1. Utwórz trzy zmienne typu String. Do pierwszej przypisz swoje imię, do drugiej nazwisko oraz do
 trzeciej imię i nazwisko oddzielone spacją. Następnie wykonaj polecenia używając odpowiednich
 metod z String (nie robić nic ręcznie! :) ) i wypisując informacje na ekran:

a) wypisz ile znaków zawiera zmienna przechowująca imię, ile nazwisko a ile imię i nazwisko

b) sprawdź czy Twoje imię jest równe "Alicja" lub "Jan"

c) wypisz nazwisko z WIELKICH LITER

d) zamień w nazwisku litery 'a' na 'e' i zobacz czy coś się zmieniło

         */
        String imie = "Michal";
        String nazwisko = "Wolny";
        String imieNazwisko = "Michal Wolny";

        System.out.println("zmienna imie zawiera " + imie.length() + " znakow");
        System.out.println("zmienna nazwiso zawiera " + nazwisko.length() + " znakow");
        System.out.println("zmienna imieNazwisko zawiera " + imieNazwisko.length() + " znakow");

        boolean wynik = imie.equals("Jan");
        boolean wynik2 = imie.equals("Alicja");
        System.out.println("czy imie to Alicja : "+ wynik + " lub Jan : " + wynik2);

        System.out.println("nazwisko drukowanymi literami : " + nazwisko.toUpperCase());

        System.out.println("zamiana liter w nazwisku l na d : " + nazwisko.replace("l", "d" ));


/*

2. Dla zdania "Potrafię coraz więcej z programowania." wypisz każdy znak w osobnej linii, czyli:

P
o
t
r
a
f
i
ę

c
o
r
a
z
... itd. ;)
 */

        String tekst = "potrafie coraz wiecej z programowania";
        char[] ciag = tekst.toCharArray();
        for( int i=0  ; i< ciag.length ; i++){
            System.out.println(ciag[i]);
        }
        System.out.println("zadanie 3 ");
/*

3. Tym razem powyższe zdanie „Potrafię coraz więcej z programowania.
” napisz od tyłu „.ainawomargorp z jecęiw zaroc ęifartoP”
 */

        for( int i= ciag.length -1; i>=0 ; i--){
            System.out.println(ciag[i]);
        }
    }
}
