import java.util.Scanner;
public class D6{
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    
    // variables
    int dice = 0;
    int i = 0;
    int rollnum = 0;
    // dice roll
    for(i=0; i<10; i++){
    dice = (int) (Math.random()*6) + 1;
    rollnum = rollnum+1;
    System.out.println("Roll #" + rollnum + ": "+ dice);
    
}
    
}
}