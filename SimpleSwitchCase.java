
package conditional;
import java.util.Scanner;
public class SimpleSwitchCase {

    public static void main(String[] args) {
        int number;
        Scanner input=new Scanner(System.in);
        System.out.println("Input a number 1 to 3");
        number=input.nextInt();
        
        String msg;
        switch(number)
        {
            case 1:msg="one";
            break;
            case 2:msg="Two";
            break;
            case 3:msg="Three";
            break;
            default:msg="not in range";     
        }
        System.out.println("Your input number is "+msg);
    }   
}
