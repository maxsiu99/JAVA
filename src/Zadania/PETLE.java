package Zadania;

public class PETLE {
    public static void main(String[] args) {
        //1 Wypisz na ekran liczby od 0 do 30, a nastepnie od 30 do 0.
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for ( int j = 30; j>= 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println();

        //2 Napisz program który wypisze tylko liczby parzyste z zakresu
        // od 0 do 30.
        for(int i =0; i<=30; i = i+2 ){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();


        //3 Podaj dwie dowolne liczby a i b, gdzie a jest mniejsze od b
        // (a < b). Wypisz na ekran zakres liczb od a do b.
        int a = 10;
        int b = 25;
        for(a = a; a<=b ; a++ ){
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println();

        //4 Utwórz tablicę rozmiaru 10 elementów i uzupełnij liczbami.
        // Wypisz wszystkie liczby z tej tablicy na ekran.
        // Następnie wypisz wszystkie liczby od tyłu.

        int[] tab = new int [10];
        for(int i =0; i< tab.length; i++){
            tab[i] = i+i+3;
        }for(int i = tab.length - 1; i>=0; i--){
            System.out.println(tab[i]);
        }

        //5 Wykorzystując tablicę z poprzedniego zadania,
        // oblicz sumę wszystkich jej elementów.
        int x =0;
        for (int k = 0; k<tab.length; k++){
            x = x + tab[k];
            System.out.println(x);
        }
        System.out.println();
        System.out.println();

        /*6
        Napisz program, który będzie obliczał silnię z nieujemnej liczby
        tj. jeżeli podamy liczbę 5, to zostanie obliczona 5!
        (wykrzyknik to znak silni). Obliczamy to w następujący sposób:
        5! = 5 * 4 * 3 * 2 * 1 = 120.
        Uważaj, bo silnia kolejnych liczb bardzo szybko rośnie
        i łatwo wyjść poza rozmiar typu int.
        */
        int liczba = 5;
        int silnia= 1 ;

        for (int i = liczba; i>0; i--){
            silnia = silnia *i;
            System.out.println(silnia);
        }

        System.out.println();
        System.out.println();

        //7  Napisz program, w którym po podaniu liczby n narysujesz za pomocą
        // * (gwiazdki) trójkąt prostokątny o przyprostokątnych składających
        // się z n-razy * (gwiazdki) ;)
        //np. podając n = 5 powinniśmy otrzymać taki trójkąt:

        int n = 5;
        int liczbaGwiazdek =1;

        for(int  i =1; i<=n; i++){
            for(int j =1; j<= liczbaGwiazdek; j++){
                System.out.print("* ");

            }
            System.out.println();
            liczbaGwiazdek++;

        }
        // optymalna wersja

        int m = 5;
        for(int  i =1; i<=m; i++){
            for(int j =1; j<= i; j++){
                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        //8 . Narysuj odbicie lustrzane trójkąta z poprzedniego zadania
        // tj. dla n = 5 powinniśmy ujrzeć:


/*
        int g = 5;
        for(int  i =1; i<=g; i++){
            for(int j = 5; j>= i; j--){
                System.out.print(" ");
                for(int k =j; k<=i; k++){
                    System.out.print("* ");

                }

            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
*/
        int W = 5;
        int liczbaGwiazdekLustrzanych =1;
        int liczbaSpcjiLustrzanych = W -1;

        for(int i = 1; i<=W; i++ ){
            for(int j =1; j<=liczbaSpcjiLustrzanych ; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<= liczbaGwiazdekLustrzanych; j++){
                System.out.print("*");

            }
            liczbaGwiazdekLustrzanych++;
            liczbaSpcjiLustrzanych--;
            System.out.println();

        }

        //9 Napisz program, w którym po podaniu liczby n narysujesz
        // za pomocą * (gwiazdki) drzewko choinkowe o wysokości n
        //np. podając n = 5 powinniśmy otrzymać takie drzewko:



    }
}










