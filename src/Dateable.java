import java.util.Scanner;
public class Dateable {
    public static void main(String[] args) {
        Scanner ageScanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int intAge = ageScanner.nextInt();
        System.out.println(intAge + "-year olds should date somebody who is at least " + (7 + (intAge / 2)) + " years old.");
    }
}