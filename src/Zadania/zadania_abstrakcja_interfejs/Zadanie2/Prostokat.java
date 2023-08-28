package Zadania.zadania_abstrakcja_interfejs.Zadanie2;

public class Prostokat implements Figury{
   private double x;
    private double y;

    public Prostokat(double x, double y){
        this.x =x;
        this.y =y;
    }

    @Override
    public double obwod() {
        return (x+y)*2;
    }

    @Override
    public double pole() {
        return x*y;
    }
}
