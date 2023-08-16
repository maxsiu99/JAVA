package Zadania;

public class zmienneOperatory {

    public static void main(String[] args) {
        //1
        byte wiek = 24;
        double wzrost = 1.8;
        int waga = 74;

        System.out.println("wiek: " + wiek);
        System.out.println("wzrost: "+ wzrost);
        System.out.println("waga: "+ waga);

        //2
        double x = wzrost* wzrost;
        double bmi = waga/x;
        System.out.println(bmi);
        float BMI = (float)bmi;
        System.out.println(BMI);

        //3
        int wynikBmi = (int)bmi;
        System.out.println("wynik BMI w zaokrągleniu to " + wynikBmi);

        //4
        int liczba = 246;
        int e = 2;
        int f = 3;
        int g = 11;

        double dzielenie1 = liczba/e;
        double dzielenie2 = liczba/f;
        double dzielenie3 = liczba/g;
        System.out.println(dzielenie1+" "+dzielenie2+" "+dzielenie3);

        double modulo1 = liczba%e;
        double modulo2 = liczba%f;
        double modulo3 = liczba%g;
        System.out.println(modulo1+" "+modulo2+" "+modulo3);

        //5
        // a = true b = true

        //6
        int wielkaLiczba = 1000000000;
        int pozaInt = wielkaLiczba* wielkaLiczba;
        System.out.println(pozaInt);








    }
}
