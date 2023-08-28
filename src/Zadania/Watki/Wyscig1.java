package Zadania.Watki;

public class Wyscig1 implements Runnable {
    private String nazwa;

    public Wyscig1(String nazwa) {
        this.nazwa = nazwa;
    }
    @Override
    public void run() {
        for (int i = 0; i <=1000 ; i++){
            System.out.println("Będę pierwszy - to ja "+ nazwa);
        }
        System.out.println("ZAKOŃCZYŁEM! Melduje się " + nazwa);
    }
}
