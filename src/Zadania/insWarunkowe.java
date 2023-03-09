package Zadania;

public class insWarunkowe {
    public static void main(String[] args) {


        //1  parzysta nieparzysta
        int zmienna1 = 540000;
        int x = zmienna1 % 2;
        if(x ==1){
            System.out.println("podana liczba jest nieparzysta ");
        } else if (x == 0) {
            System.out.println("podana liczba jest parzysta ");

        }

        //2 obliczenia podatku dochodowego
        int zmiennaPomocnicza;
        int dochod = 855280;
        int d9proc;
        if (dochod <= 85528){
            dochod = dochod * 17 /100;
            System.out.println("podetek dochodowy do zapłaty to : "+ dochod);
        }

        else if(dochod > 85528 && dochod <=120000){
            zmiennaPomocnicza = 85528 * 17 /100;
            dochod = ((dochod - 85528) * 32 / 100) + zmiennaPomocnicza ;
            System.out.println("podetek dochodowy do zapłaty to : " + dochod);

        }

        //2*
        // jezleli dochód jest wiekszy niż 120tys.
        // 9% z całego dochodu jest odliczone na sklładke zdrowotną
        // od całego dochodu oliczamy 30000 kwoty wolnej od podatku


        if (dochod > 120000){
            d9proc= dochod * 9 / 100;
            dochod = (dochod - 30000)   ;
            dochod = dochod * 32 / 100  + d9proc;
            System.out.println("podatek do zapłaty gdy dochód jest wiekszy niz 120tyś. : " + dochod
                    );
        }


        // prosty kalkulator

        int a = 5;
        int b = 2;
        char znak = '-';

        switch (znak){
            case '+':
                a = a + b ;
                System.out.println("wynik to: " + a);
                break;
            case '-':
                a = a - b;
                System.out.println("wynik to: " + a);
                break;
            case '*':
                a = a * b;
                System.out.println("wynik to: " + a);
                break;
            case '/':
                a = a / b;
                System.out.println("wynik to: " + a);
                break;

        }
    }
}
