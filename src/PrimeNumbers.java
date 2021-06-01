import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int number;
        int prime, composite;
        int factors;
        
        System.out.println("Please give a number");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int count=1;
        int itNum=0;

        for(int i=2; i<number; i++){
            if(number%i==0){
                count++;
            }
            itNum++;
        }

        if(count==1){
            System.out.println( number + " is a prime number and factors are => ");
            System.out.println("With first method, number of iterations are: " + itNum);

        }
        if(count>1){
            System.out.print(number + " is composite number and factors are => ");

            for(int i = 2; i < number; i++){
                if(number%i==0){
                    System.out.print(i+",");
                }
            }
            System.out.println("\n" +"Our first method number of iteration is: " + itNum);
        }




    }
}

