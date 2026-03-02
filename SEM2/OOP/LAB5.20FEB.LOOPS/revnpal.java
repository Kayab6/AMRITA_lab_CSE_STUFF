// package name will be on top jic

import java.util.Scanner;

public class revnpal {
    public static void main(String[] args) {
        System.out.println("2. Using a while loop, reverse a given integer and check whether it is a palindrome. ");
        int i=1;
        // reversing

        Scanner sc = new Scanner(System.in);       // Step 1: Create Scanner
        System.out.print("Enter a number: ");      // Step 2: Ask user
        int n = sc.nextInt();                       // Step 3: Take input
        //int n=1234;
        int temp=n;
        int reversed=0;
        while(n!=0) {
            int lastdigit=n%10;
            reversed=reversed*10+lastdigit;
            n=n/10;
        }
        i++;

        System.out.println(reversed);
            if (reversed==temp){
            System.out.println("palindrome");
            }
            else{
                System.out.println("nope not palindrome");
            }
    }

}
