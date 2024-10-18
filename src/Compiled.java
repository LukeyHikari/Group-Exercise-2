import java.util.Scanner;

public class Compiled {
    int x, y;
    Scanner sc = new Scanner(System.in);
    public Compiled() {
        this.x = 0;
        this.y = 0;
    }

    //1.4
    public void bitwise(){
        try {
            //Parse 2 integers
            System.out.print("Enter the first number(x): ");
            x = sc.nextInt();
            System.out.print("Enter the second number(y): ");
            y = sc.nextInt();

            //Perform and print the bitwise operations
            System.out.println("\nPERFORMING BITWISE OPERATIONS\n");
            System.out.println("x&y = " + (x & y));
            System.out.println("x|y = " + (x | y));
            System.out.println("x^y = " + (x ^ y));
            System.out.println("~x = " + ~x);
            System.out.println("~y = " + ~y);
            System.out.println("x<<2 = " + (x << 2));
            System.out.println("y<<2 = " + (y << 2));
            System.out.println("x>>2 = " + (x >> 2));
            System.out.println("y>>2 = " + (y >> 2));
            System.out.println("x>>>2 = " + (x >>> 2));
            System.out.println("y>>>2 = " + (y >>> 2));
        }catch (Exception e) {
            //Print error
            System.out.println(e + ". Could not perform bitwise operations. Please try again.");
        }
    }

    //1.8
    public void ternary(){
        try {
            //Parse 2 integers
            System.out.print("Enter the first number(x): ");
            x = sc.nextInt();
            System.out.print("Enter the second number(y): ");
            y = sc.nextInt();

            //Perform the ternary operation
            String result = (x > y) ? "The larger number is x: " + x : "The larger number is y: " + y;

            //Print the result
            System.out.println(result);
        }catch (Exception e) {
            //Print error
            System.out.println(e + ". Could not perform the operation. Please try again.");
        }
    }

    //2.9
    public void sumEvenAndOdd(){
        try {
            //Initialize the even and odd sum variables
            int evenSum = 0, oddSum = 0;
            //Request the 2 inputs
            System.out.print("Enter the lower bound: ");
            x = sc.nextInt();
            System.out.print("Enter the upper bound: ");
            y = sc.nextInt();

            //Loop through the range
            for (int i = x; i <= y; i++) {
                //Check for odd and even with modulo then add to respective sum variable
                if (i % 2 == 0) evenSum += i;
                else oddSum += i;
            }

            //Print the result
            System.out.println("The sum of the even numbers is: " + evenSum);
            System.out.println("The sum of the odd numbers is: " + oddSum);
        } catch (Exception e){
            //Print error
            System.out.println(e + ". Could not perform the operation. Please try again.");
        }
    }
}
