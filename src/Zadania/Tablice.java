package Zadania;

public class Tablice {
    public static void main(String[] args) {
        //1
        int[] tab = new int[] {1,2,3,4,5};
        int x;
        x = tab[0] + tab[1] + tab[2] + tab[3] + tab[4];
        System.out.println("suma wszystkich elementów tablicy : " + x);

        //2
        double[][] tab2 = new double[][]
        {
            {1,2.25,3.25},
            {2.2,2.2,2},
            {3,3.3,3},
            {4,4.4,4},
            {5.5,5.5,5.5}
        };

        double y1;
        double y2;
        double y3;
        double y4;
        double y5;

        y1 = tab2[0][0] + tab2[0][1] + tab2[0][2];
        y2 = tab2[1][0] + tab2[1][1] + tab2[1][2];
        y3 = tab2[2][0] + tab2[2][1] + tab2[2][2];
        y4 = tab2[3][0] + tab2[3][1] + tab2[3][2];
        y5 = tab2[4][0] + tab2[4][1] + tab2[4][2];

        System.out.println("suma liczb z tabicy wielowymiarowej z 1 wiersza : " + y1);
        System.out.println("suma liczb z tabicy wielowymiarowej z 2 wiersza : " + y2);
        System.out.println("suma liczb z tabicy wielowymiarowej z 3 wiersza : " + y3);
        System.out.println("suma liczb z tabicy wielowymiarowej z 4 wiersza : " + y4);
        System.out.println("suma liczb z tabicy wielowymiarowej z 5 wiersza : " + y5);

    }
}
