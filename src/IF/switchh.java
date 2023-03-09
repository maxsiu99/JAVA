package IF;

public class switchh {
    public static void main(String[] args) {

        char znak = 'a';
        switch (znak){
            case 'a' :
                System.out.println("podałeś małe a ");
                break;
            case 'A':
                System.out.println("podałeś duże A ");
                break;
            default:
                System.out.println("podałeś inna litere od a");
        }

    }
}
