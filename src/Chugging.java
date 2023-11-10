import java.util.Scanner;

public class Chugging{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int beerBottles = s.nextInt();
        int Alice_SecondsToFinish = s.nextInt(), Alice_ExtraSeconds = s.nextInt();
        int Bob_SecondsToFinish = s.nextInt(), Bob_ExtraSeconds = s.nextInt();

        //Alice value
        int Alice_value = 0;
        for (int i = 0; i < beerBottles; i++) {
            Alice_value += Alice_SecondsToFinish + Alice_ExtraSeconds*i;
        }

        //Bob value
        int Bob_value = 0;
        for (int i = 1; i <= beerBottles; i++) {
            Bob_value += Bob_SecondsToFinish + Bob_ExtraSeconds*(i-1);
        }
        
        if (Bob_value<Alice_value) {
            System.out.println("Bob");
        }else if (Bob_value>Alice_value) {
            System.out.println("Alice");
        }else{
            System.out.println("=");
        }
    }
}
