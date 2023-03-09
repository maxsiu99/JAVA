package IF;

public class InstrukcjeWarunkowe {
    public static void main(String[] args) {

        int wiek = 22;
        boolean przyszedlTata = false;

        if(wiek>= 18) {
            System.out.println("warunek został spełniony");

        } else if (przyszedlTata) {
            System.out.println("jest z tata");
            
        } else {
            System.out.println("nie spełniony ");
        }
    }
}

