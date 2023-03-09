package Pętle;

public class PFOR {
    public static void main(String[] args) {
        int liczenie;
        for (liczenie=1; liczenie<=15; liczenie++){

            System.out.println("tekst " + liczenie);
        }
        System.out.println("poza pętla "+ liczenie);

        System.out.println("spontan ");

        int wiek = 1;
        int dana;
        for (dana = wiek ; wiek<100; wiek++ ){
            System.out.println("do setki brakuje Ci tyle lat" + wiek);
            System.out.println(dana);
        }
        System.out.println("do setki brakuje :" + (wiek - dana));

    }
}
