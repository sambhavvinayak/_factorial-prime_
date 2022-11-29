import java.util.Scanner;
/*
 * find whether the factorial of a number is prime or not?
 */

public class project3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input the number of factorial 
        System.out.println("Check whether the factorial of number is prime or not it is ");
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        int factorial = 1;
        // loop for factorial 
        for (int i = 1; i <=n; i++) {
            factorial *= i;
        }
        
        // find the prime number of that factorial 
        int count  = 0;
        for (int i = 1; i <= factorial; i++) {
            if ((factorial%i)==0) {
                count++;
            }
        }
        System.out.println("Fatorial of "+n+" is "+factorial);
        if (count==2) {
            System.out.println("Factorial of "+ n +" is a prime number ");
        }else{
            System.out.println("Factorial of "+n+" is not a prime number ");
        }
        // end of program ...
        

    }
}
