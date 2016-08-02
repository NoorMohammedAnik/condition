/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional;
import java.util.Scanner;
public class LetterGrade {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double marks;
        System.out.println("Enter your marks : ");
        marks=input.nextDouble();
        if(marks >= 80)
        {
            System.out.println("You got grade A+");
        }
        else if(marks >=70 && marks <=79)
        {
            System.out.println("You got grade A ");
        }
        else if(marks >=60 && marks <=69)
        {
            System.out.println("You got grade A-");
        }
        else if(marks >=50 && marks <=59)
        {
            System.out.println("You got grade B");
        }
        else if(marks >=40 && marks <=49)
        {
            System.out.println("You got grade C");
        }
        else if(marks >=33 && marks <=39)
        {
            System.out.println("You got grade D");
        }
        else
        {
            System.out.println("Fail !!");
        }
    }
    
}
