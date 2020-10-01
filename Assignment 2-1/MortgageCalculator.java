import java.util.Scanner;
public class MortgageCalculator{
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    
    // variables
    double p = 0;
    double r = 0;
    double n = 0;
    double A = 0;
    
    // input
    System.out.println("Enter the principle ");
    p = input.nextDouble();
    System.out.println("Enter the rate ");
    r = input.nextDouble();
    System.out.println("Enter the years ");
    n = input.nextDouble();
    
    // calculations
    A = p*Math.pow((1+r),n);
    System.out.println("The amount is " + A);
   
    
 
    
    
    
    
    
}
}