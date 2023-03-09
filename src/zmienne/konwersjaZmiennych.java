package zmienne;

public class konwersjaZmiennych {
    public static void main(String[] args) {

        int zmiennaint = 1234;
        byte x= 10;

        x = (byte) zmiennaint;


        System.out.println(x);

        int obliczenia = 6;
        double doubleObliczenia = 2.2;

        int wynik = obliczenia / (int) doubleObliczenia;
        System.out.println("wynik " + wynik );

        double d1 = 1.2;
        double d2 = 12.4;
        double wynikd = d2 / d1 ;
        System.out.println("wynik z drugiego doubla "+ wynikd);

        int wynikInt = (int)( d2 /  d1);
        System.out.println(wynikInt);






    }
}
