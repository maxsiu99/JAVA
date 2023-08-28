package Zadania;

public class Klasy {
    public static void main(String[] args){


   /* 1. Utwórz klasę o nazwie "Programista", a w niej:

    a) pola: imie, nazwisko, jezyk, zarobki

    b) metody: pobierzImie(), pobierzNazwisko(), pobierzJezyk(), pobierzWynagrodzenie(), które będą zwracać dane z odpowiednich pól

    c) konstruktor, przyjmujący i ustawiający wartości dla wszystkich pól klasy z argumentami: podajImie, podajNazwisko, podajJezyk, podajZarobki

    d) pola będą prywatne a metody i konstruktor publiczne

    e) przetestuj wszystko w main: utwórz obiekt z uzupełnionymi danymi i wywołaj metody, wypisując dane na ekran

    */

        System.out.println("zad 1");

        Programista programista = new Programista("Michal", "Wolny", "Java", 2.50);
        System.out.println("Imie " + programista.pobierzImie());
        System.out.println("Nazwisko "+ programista.pobierzNazwisko());
        System.out.println("Język "+ programista.pobierzJezyk());
        System.out.println("Zarobki "+ programista.pobierzZarobki());



    /*
    2. Napisz klasę, która w konstruktorze będzie przyjmować tablicę
       oraz będzie posiadać cztery metody:
          - zliczającą sumę wszystkich elementów z tablicy
          - liczącą średnią
          - znajdującą wartość najmniejszą
          - znajdującą wartość największą

Każda z metod powinna zwracać wynik jako int.
Utwórz pole przechowujące tablicę.
Załóż, że w tablicy będą tylko liczby całkowite.
Pola będą prywatne a metody i konstruktor publiczne.
Klasę, pole i metody nazwij według własnego uznania.
Przetestuj całość w main.

     */

    int [] tab ={2,3,5,776,553,57,545,2,1};
    KlasyTablica KlasyTablica = new KlasyTablica(tab);
        System.out.println();
        System.out.println("zad 2");


        System.out.println("suma "+ KlasyTablica.suma());
        System.out.println("średnia "+ KlasyTablica.srednia());
        System.out.println("min "+ KlasyTablica.min());
        System.out.println("max "+ KlasyTablica.max());

    /*
    3. Stwórz własną klasę o nazwie “Matma”. Dodaj w niej metody liczące:
- obwód i pole koła (jako argument do metody przyjmuje promień koła)
- obwód i pole prostokąta (jako argumenty do metody przyjmuje długość boku a i b)

Metody niech będą statyczne i zwracają wynik odpowiedniego typu.
Dodatkowo utwórz w klasie statyczne, stałe pole,
które będzie przechowywać wartość PI = 3.14.
Do obliczeń koła wykorzystaj Twoje PI.
Pola i metody będą publiczne.
Jeżeli chcesz, możesz rozszerzyć swoją klasę Matma o metody z zadania 2.
Musisz jednak pamiętać, aby delikatnie je przerobić, żeby mogły być
metodami statycznymi.
     */

        // dzieki temu że motody są static nie muszę tworzyć obiektu
        System.out.println();
        System.out.println("zad 3");


        System.out.println("obwód koła "+ KlasyMatma.obwodKola(5.6));
        System.out.println("pole koła "+ KlasyMatma.poleKola(5.6));
        System.out.println("obwód prostokąta " + KlasyMatma.obwodProst(5,5));
        System.out.println("pole prostokąta " + KlasyMatma.poleProst(5,5));
}
}
