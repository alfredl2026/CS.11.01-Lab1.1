import java.util.Scanner;
public class Pages {

    public static void main(String[] args) {
        Scanner ageScanner2 = new Scanner(System.in);
        System.out.println("Enter your age:");
        int intAge2 = ageScanner2.nextInt();
        System.out.println(intAge2 + "-year olds should read at least " + (100 - intAge2) + " pages before giving up on a book.");
    }
}
