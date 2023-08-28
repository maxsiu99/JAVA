package Zadania.Wtjatki;

/*
Zadanie 1
        W metodzie main napisz kawałek kodu, który będzie dzielił liczby a/b (typu int) i wypisywał wynik na ekran.
        Zobacz co się stanie, jeżeli pod b podasz liczbę 0. Spróbuj obsłużyć błąd try/catchem,
        aby w przypadku dzielenia przez zero wyskoczył użytkownikowi komunikat:

        “Nie wolno dzielić przez 0!”

        (podpowiedź: należy obsłużyć wyjątek ArithmeticException)


Zadanie 2
        Analogicznie do zadania 1, zaimplementuj metodę publiczną, statyczną (w tej samej klasie co metoda main) o nazwie “podziel”,
         która będzie przyjmować parametry a oraz b i zwracać wynik z dzielenia a/b.
         Utwórz własny wyjątek typu check, który będzie wyrzucany w przypadku podania liczby 0 w miejsce parametru b.
         Spróbuj wymyślić nazwę i pamiętaj o odpowiednim dziedziczeniu. Sprawdź działanie metody wywołując ją w main.

Zadanie 3
        Wróć do zadania 3 z działu o klasach (Matma), w którym były liczone m. in. obwody i pola.
         Stwórz wyjątek typu uncheck o nazwie "LiczbaUjemnaException".
         Uzupełnij metodę "obwodKola" - jeżeli promień będzie ujemny wyrzuć wyjątek "LiczbaUjemnaException".
         Przetestuj w main podając za promień liczbę ujemną.
*/



public class WyjatkiZadania {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
              System.out.println( "wynik dielenia to " + a/b);}
        catch(ArithmeticException ByZero){
            System.out.println("Nie wolno dzielić przez zero!");
        }



  //2
        System.out.println("zad.2");

        try {
            System.out.println("Wynik dzielenia z metody " + podziel(5,0));
        } catch (WyjatkiDzielenieException e) {
            System.out.println(e.getMessage());
        }




    //3
        System.out.println("zad.3");

        KlasyMatma.poleKola(-6);



    }

    //2
    public static int podziel (int a, int b ) throws WyjatkiDzielenieException {
        if(b == 0){
            throw new WyjatkiDzielenieException();
        }
        return a/b;
    }

    


}
