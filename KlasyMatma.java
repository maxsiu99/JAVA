package Zadania;

public class KlasyMatma {

    public static final double pi = 3.14;    //final bez możliwości zmiany

    public static double obwodKola (double r){         //metoda publiczna, statyczna
      //  double wynik = 0;
     //   wynik = 2* pi * r;
     //   return wynik;
        return 2* pi * r;   // szybszy zapis
    }

    public static double poleKola (double r){

        return (pi * (r *r));
    }

    public static double obwodProst (double a, double b){
        return 2 * (a+b);
    }

    public static double poleProst (double a, double b ){
        return a * b ;

    }

}
