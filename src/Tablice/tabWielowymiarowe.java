package Tablice;

public class tabWielowymiarowe {
    public static void main(String[] args) {
        int [][] tabDwuwymiarowa = new int[10][10];
        tabDwuwymiarowa[0][1] = 123;
        tabDwuwymiarowa[4][8] = 222;
        System.out.println(tabDwuwymiarowa[0][1]);

        //                 pierwszy wiersz//  drugi wiersz
        int[][] dwawymiary = {{1,2,3} , {4,5,6} };
       /* mamy 2 wiersze 3 kolumny
        int[][] dwawymiary =
        {
            {1,2,3},
            {4,5,6}
         };
         */
        System.out.println(dwawymiary[0][2]);
        System.out.println(dwawymiary[1][2]);

        //rozmiar tablicy
        System.out.println(dwawymiary.length);
        System.out.println(dwawymiary[0].length);

        int [][][] tabTrojwymiarowa = new int[5][5][5];


    }
}
