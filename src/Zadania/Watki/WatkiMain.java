package Zadania.Watki;

public class WatkiMain {
    public static void main(String[] args) {

/*
Zadanie 1
Przećwicz tworzenie wątku poprzez klasę anonimową:
- niech metoda “run” wypisze na ekran “Ta informacja została wypisana
z klasy anonimowej i z mojego wątku”
- wystartuj wątek pamiętając o odpowiednich czynnościach
- dopisz, aby informacja została wyświetlona z 3 sekundowym opóźnieniem

 */

    Runnable zad1 = new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
            System.out.println("Ta informacja została wypisana\n" +
                    "z klasy anonimowej i z mojego wątku");
        }
    };
    //zad1.run();
        Thread zad1zanonimowej = new Thread(zad1);
        zad1zanonimowej.start();

/*
Zadanie 2
Stwórz nową klasę o nazwie “Czasoodmierzacz” implementująca interfejs Runnable.
Stwórz tzw. “timer”, który będzie co 1 sekundę wypisywał na ekran informację
o tym jak długo (ile sekund) działa program od momentu jego uruchomienia.
Przetestuj wątek w main.
 */

Thread zad2 = new Thread(new CzasoOdmierzacz());
zad2.start();



/*
Zadanie 3
Stwórz dwa wątki, które będą się ścigać. Każdy z wątków niech wypisze na ekran 1000 razy:
“Będę pierwszy - to ja <tutaj_nazwa_wątku>”.
Po wykonaniu tej czynności ma zawiadomić o skończonej pracy wypisując:
“ZAKOŃCZYŁEM! Melduje się <tutaj_nazwa_wątku>".
Uruchom kilka razy program i zobacz czy wynik za każdym razem jest taki sam.
 */

        Wyscig1 zawodnik1 = new Wyscig1("Zawodnik1");
        Wyscig1 zawodnik2 = new Wyscig1("Zawodnik2");
        Thread Zawodnik1Thread = new Thread(zawodnik1);
        Thread Zawodnik2Thread = new Thread(zawodnik2);
        Zawodnik2Thread.start();
        Zawodnik1Thread.start();


    }

}
