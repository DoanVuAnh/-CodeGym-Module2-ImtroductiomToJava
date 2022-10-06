import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which moth yiu want to count day?");
        int month;
         month = scanner.nextInt();
         switch (month){
             case 2:
                 System.out.print("Has 28 or 29 days!");
                 break;
             case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                 System.out.print("Has 31 days");
                 break;
             case 4: case 6: case 9: case 11:
                 System.out.print("Has 30 days");
                 break;
             default:
                 System.out.print("Invalid input!");
         }
    }
}
