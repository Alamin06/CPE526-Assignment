import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int number;
        int prime, composite;
        int factors;

        System.out.println("Please give a number");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        factors = number / 2;

        for (int i = 0; i >= 1; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " is composite number and factors are"+ factors);
            } else {
                System.out.println(i + " is a prime number");
            }


        }
    }
}
