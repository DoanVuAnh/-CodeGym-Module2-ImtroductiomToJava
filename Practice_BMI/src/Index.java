import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Your weight (kilogram):");
        weight = scanner.nextDouble();

        System.out.print("Your height (meter):");
        height = scanner.nextDouble();

        bmi=weight / Math.pow(height, 2);

        if (bmi < 18.5){
            System.out.print("Underweight");
        }else if (bmi < 25) {
            System.out.print("Normal");
        }else if (bmi < 30) {
            System.out.print("Overweight");
        }else{
            System.out.print("Obese");
        }
    }
}
