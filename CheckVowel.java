/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional;
import java.util.Scanner;
public class CheckVowel {
    public static void main(String[] args) {
       
        Scanner input=new Scanner(System.in);
        char vowel;
        
        System.out.println("Enter Character :");
        vowel=input.next().charAt(0);  //check char at position 0
        switch(vowel)
        {
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
                System.out.println("vowel");
                break;
            default:
                System.out.println("Not vowel");              
        }    
    }  
}
