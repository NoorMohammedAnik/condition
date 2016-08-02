/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional;
import java.util.Scanner;

public class CircleRadius {

    public static void main(String[] args) {
       double radius,area;
       double PI=3.1416;
       
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter radius : ");
        radius=input.nextDouble();
        
        if(radius > 0)
        {
            area=PI*radius*radius;
            
            System.out.println("Radius of circle : "+area);
        }
        
        else
        {
            System.out.println("Radius can not negative !!!! Input Correctly.");
        }
            
    }
    
}
