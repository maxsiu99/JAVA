package Zadania.zadania_abstrakcja_interfejs;

import Zadania.zadania_abstrakcja_interfejs.Zadanie1.GwiazdaSmierci;
import Zadania.zadania_abstrakcja_interfejs.Zadanie2.Kolo;
import Zadania.zadania_abstrakcja_interfejs.Zadanie2.Prostokat;

public class Main {
    public static void main(String[] args) {


//ZAD-1

/*
- stwórz klasę abstrakcyjną o nazwie “StacjaKosmiczna”
- dodaj metodę abstrakcyjną o nazwie “atakujLaserem”
- stwórz nową klasę o nazwie “GwiazdaSmierci”, która będzie dziedziczyć po klasie “StacjaKosmiczna”. Zaimplementuj metodę “atakujLaserem”, która wyświetli na ekranie “piu piu"
- przetestuj w main
 */
        System.out.println("ZADANIE 1");


        GwiazdaSmierci gwiazdaSmierci = new GwiazdaSmierci();

        gwiazdaSmierci.atakujLaserem();

//ZAD-2
        System.out.println();
        System.out.println("ZADANIE 2");
/*
- stwórz interfejs o nazwie "Figury", który będzie posiadał metody “obwod”, “pole”. Obydwie metody będą zwracały liczbę zmiennoprzecinkową
- stwórz dwie klasy “Kolo”, “Prostokat”, które będą implementowały ten interfejs
- dodaj konstruktor, w którym w klasie “Kolo” będzie przekazywany promień koła, a w klasie “Prostokat” długości dwóch boków prostokąta a i b
- zaimplementuj metody w obydwóch klasach, aby dokonywały poprawnych obliczeń
- pola będą prywatne a konstruktor i metody publiczne
- przetestuj w main
 */

        Kolo kolo = new Kolo(5);
        System.out.println("pole koła = "+ kolo.pole());
        System.out.println("obwód koła = " + kolo.obwod());

        Prostokat prostokat = new Prostokat(5,5);
        System.out.println("obw prostokąta " + prostokat.obwod());
        System.out.println("pole prostokąta " + prostokat.pole());

//ZAD-3
        System.out.println();
        System.out.println("ZADANIE 3");

/*
Stwórz interfejs wewnętrzny o nazwie "Info" z metodą “wyswietlInfo”
w klasie, w której masz metodę main.
Przećwiczyć tworzenie klasy anonimowej tworząc ją w metodzie main
i przesłoń metodę tak, aby wypisywała tekst “informacja wypisana z klasy anonimowej”.
Następnie wywołaj tę metodę “wyswietlInfo” i sprawdź
czy prawidłowo została stworzona klasa anonimowa.
 */

        Info info =new Info() {
            @Override
            public void wyswietlInfo() {
                System.out.println("info z klasy anonimowej");
            }
        };


        info.wyswietlInfo();
    }
}

    interface Info{
        public void wyswietlInfo();
    }

