import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String Name;
        Name = scanner.nextLine();

        System.out.print("Hello: " + Name);
    }
}
