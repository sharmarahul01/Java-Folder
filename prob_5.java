import java.util.Scanner;
public class prob_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buttom = sc.nextInt();
        switch(buttom) {
            case 1 : System.out.println("Hey");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Jaldi Waha Se Hatao");
            break;
            default : System.out.println("Invalid Buttom");
        }
    }
}