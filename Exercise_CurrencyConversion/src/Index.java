import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("USD: ");
        int numberMoney;
        numberMoney = scanner.nextInt();
        int rate = 23000;
        int vietnamdong = numberMoney * rate;
        System.out.print("Vietnamdong: " + vietnamdong);

    }
}
