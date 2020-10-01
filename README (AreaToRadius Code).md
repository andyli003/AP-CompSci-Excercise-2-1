# AP-CompSci-Excercise-2-1

Hi Mr.Pelletier, 
my code for AreaToRadius somehow just won't show up in the Assignment 2-1 file, so I decided to create this readme file and copy paste my code down here. Thanks!! 
- Andy Li


Code:
import java.util.Scanner;
public class AreaToRadius{
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        // variables 
        double r;
        double a;
        
        // inputs
        System.out.println("Enter the radius of the circle: ");
        r = input.nextDouble();
        
        // calculation
        a = Math.PI * r * r;
        System.out.println("The area of the circle is " + a);
     
    }
}
