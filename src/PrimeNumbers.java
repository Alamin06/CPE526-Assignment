import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int number;
        int prime, composite;

        System.out.println("Please give a number");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int count=1;
        int itNum=0;
        int index=2;

        double b=Math.sqrt(number);
        int x=number;


        for(int i=2; i<number; i++){
            if(number%i==0){
                count++;
            }
            itNum++;
        }


            while (x>1 && index<=b ){
                while (x/index>0){

                    x = x/index;
                    b = Math.sqrt(x);
                }
                index++;
            }


        if(count==1){
            System.out.println( number+ " is a prime number and factors are => ");
            System.out.println("With first method, number of iterations are: " + itNum);
            System.out.println("With second method, number of iterations are: " + index);



        }
        if(count>1){
            System.out.print(number + " is composite number and factors are => ");

            for(int i = 2; i < number; i++){
                if(number%i==0){
                    System.out.print(i+",");
                }
            }
            System.out.println("\n" +"Our first method number of iteration is: " + itNum);
            System.out.println("With second method, number of iterations are: " + index);


            }


        }




}


