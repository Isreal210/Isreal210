import java.util.Scanner;
/**
 *
 * @author amir
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.print("Please enter a value for factorial: ");
        // creating a scanner object to take input from keyborad
        Scanner input = new Scanner(System.in);
        // set the scanner object to n
        int n = input.nextInt();
        int i = 1;
        int factorial = 1;
        while (i<=n)
    {
        factorial= factorial*i;
        i++;
        }
        System.out.printf("You have entered %d, and the factorial of %d is %d", n, n, factorial);
    }
}
