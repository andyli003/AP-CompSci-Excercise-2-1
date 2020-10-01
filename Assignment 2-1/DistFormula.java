import java.util.Scanner;
public class DistFormula{
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    
    // variables
    double x1 = 0, x2 = 0, y1 = 0, y2 = 0;
    double distx = 0;
    double disty = 0;
    double distfinal = 0;
    
    // input
    System.out.println("Enter the X coordinate of point 1 ");
    x1 = input.nextDouble();
    System.out.println("Enter the Y coordinate of point 1 ");
    y1 = input.nextDouble();
    System.out.println("Enter the X coordinate of point 2 ");
    x2 = input.nextDouble();
    System.out.println("Enter the Y coordinate of point 2 ");
    y2 = input.nextDouble();
    
    // calculations
    distx = x2 - x1;
    disty = y2 - y1;
    distfinal = Math.sqrt(distx*distx + disty*disty);
    System.out.println("The distance between the points is  " + distfinal);
}
    
    
    
    
    
    
    
}