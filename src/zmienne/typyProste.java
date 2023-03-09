package zmienne;

public class typyProste {
    public static void main(String[] args) {
        // ang. primitive types

        // info: 1bajt = 8 bitów  min = -128 max = 127  zakres = 256

        // liczby całkowite
        byte zmiennaByte = 10;
        System.out.println("Byte " + zmiennaByte);
        System.out.println(Byte.MIN_VALUE +" " + Byte.MAX_VALUE) ;

        // zakres 2 (bajty 16 bitów) do potegi 16
        short zmiennaShort = 200;
        System.out.println("Short " + zmiennaShort);
        System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE);

        // mieści
        int zmiennaInt = 1000000;
        System.out.println("Int " + zmiennaInt);
        System.out.println(Integer.MIN_VALUE +" " + Integer.MAX_VALUE);

        long zmiennaLong = 100000000000L;
        System.out.println("Long " + zmiennaLong);
        System.out.println(Long.MIN_VALUE +" "+ Long.MAX_VALUE);


        // Liczby zmiennoprzecinkowe
        float zmiennaFloat = 12.34123456789F;
        System.out.println("Float " + zmiennaFloat);

        double zmiennaDouble = 12.34123456789;
        System.out.println("Double " + zmiennaDouble);
        System.out.println( " min i max doubla "+ Double.MIN_VALUE + "    " + Double.MAX_VALUE);

        // Pojedyncze znaki
        char zmiennaChar = 'a';
        System.out.println("Char " + zmiennaChar);

        //Wartości logiczne
        boolean zmienneBoolean = true;  // lub false
        System.out.println("Boolean " + zmienneBoolean);

        //Zakładanie zmiennych w 1 lini
        int d, e = 5, f, nazwaDwa = 5;
        System.out.println(e + nazwaDwa);









    }
}
