package Tablice;

public class tabJednowymiarowe {
    public static void main(String[] args) {
        int[] tablica;
        tablica = new int[10];
        //tablica [indeks]
        tablica [0] = 5;
        tablica[1] = 10;
        tablica [2] = 15;
        tablica [3] = 155;
        System.out.println(tablica[9]);

        double[] tabDoubli = new double[5];
        tabDoubli [0] = 5.45;
        tabDoubli[1] = 10.86;
        tabDoubli [2] = 15.478;
        tabDoubli [3] = 155.5874582;
        System.out.println("tabliaaaaa "+ tabDoubli[4]);

        int[] tabINT = new int[] {10, 55,  74, 45, 478, 554, 2, 47,};
        System.out.println(tabINT[5]);

        System.out.println("tab rozmiar "+ tabINT.length);
        System.out.println(tablica.length);
        System.out.println(tabDoubli.length);
    }
}
