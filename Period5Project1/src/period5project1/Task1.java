
package period5project1;
import java.util.Scanner;


public class Task1 {

    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        System.out.println("Enter a number: ");
        // square root
        double number=b.nextDouble();   
        System.out.printf("%-15s \n%-10.2f\n", "Square Root:", Math.sqrt(number));
        // absolute value
        System.out.printf("%-15s %10.2f\n", "Absolute Value:", Math.abs(number));
        // even or odd
        System.out.printf("%-15s %10s\n", "Even/Odd?", number %2==0? "Even": "Odd");
        // squared
        System.out.printf("%-15s %10.2f\n", "Squared:", number * number);


    }
    
}
