package Pętle;

public class petlaWPetli {
    public static void main(String[] args) {
        int [][] tablica = new int[5][10];
        int licznik =10;

        for(int i = 0 ; i<5; i++){
            for (int j = 0; j <10; j++ ){
                licznik++;
                tablica[i][j] = licznik;
                System.out.println("petla w petli " + j);
            }
            System.out.println("petla " + i );
        }


        for (int i = 0; i< 5; i++){
            for( int j = 0; j<10; j++){
                System.out.print(tablica[i][j] +" ");
            }
            System.out.println();
        }

    }
}
