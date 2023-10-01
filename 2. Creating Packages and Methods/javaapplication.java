/*
2.Creating Packages and Methods
1. Create a Java package structure with the following levels: pack1, pack2, and pack3.
2. In pack1, create a class named MathOperations with the following methods:
     add(int a, int b) - This method should return the sum of two integers.
     subtract(int a, int b) - This method should return the result of subtracting b from a.
3. In pack2, create a class named StringOperations with the following methods:
     concatenate(String str1, String str2) - This method should concatenate two strings and return the result.
     reverse(String str) - This method should reverse a given string and return the reversed string.
4. In pack3, create a class named Calculator with the following methods:
     multiply(int a, int b) - This method should return the product of two integers.
     divide(int a, int b) - This method should return the result of dividing a by b. Make sure to handle division by zero by returning an appropriate message.
5. Create a Java application outside the packages to test these methods. In this application:
     Create instances of the classes from pack1, pack2, and pack3.
     Use these instances to demonstrate the functionality of the methods you created.
     Print the results to the console.
6. Compile and run your Java application to see the output.

 */
package javaex5;

import java.util.*;

import pack1.MathOperations;
import pack2.StringOperations;
import pack3.Calculator;

public class javaapplication 
{
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) 
    {
        MathOperations p1=new MathOperations();
        StringOperations p2=new StringOperations();
        Calculator p3=new Calculator();
        
        Scanner obj=new Scanner(System.in);
        int choice=0,num1,num2;
        String s1,s2;
        
        while(choice!=7)
        {
            System.out.println("1.Addition \n2.Subraction \n3.String concatenate \n4.String reverse \n5.Multiply \n6.Divide \n7.Exit");
            System.out.print("\nEnter your Choice: ");
            choice=obj.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("\nEnter the first number: ");
                    num1=obj.nextInt();
                    System.out.print("Enter the Second number: ");
                    num2=obj.nextInt();
                    System.out.println("\nThe sum of "+num1+" and "+num2+" is "+p1.add(num1, num2)+"\n");
                    break;
                case 2:
                    System.out.print("\nEnter the first number: ");
                    num1=obj.nextInt();
                    System.out.print("Enter the Second number: ");
                    num2=obj.nextInt();
                    System.out.println("\nThe Difference of "+num1+" and "+num2+" is "+p1.subtract(num1, num2)+"\n");
                    break;
                case 3:
                    System.out.print("\nEnter the first String: ");
                    s1=obj.next();
                    System.out.print("Enter the Second String: ");
                    s2=obj.next();
                    System.out.println("\nThe concatenation of "+s1+" and "+s2+" is "+p2.concatenate(s1,s2)+"\n");
                    break;
                case 4:
                    System.out.print("\nEnter the string to reverse: ");
                    s1=obj.next();
                    System.out.println("\nThe reverse of "+s1+" is "+p2.reverse(s1)+"\n");
                    break;
                case 5:
                    System.out.print("\nEnter the first number: ");
                    num1=obj.nextInt();
                    System.out.print("Enter the Second number: ");
                    num2=obj.nextInt();
                    System.out.println("\nThe multiplication of "+num1+" and "+num2+" is "+p3.multiply(num1, num2)+"\n");
                    break;
                case 6:       
                    System.out.print("\nEnter the first number: ");
                    num1=obj.nextInt();
                    System.out.print("Enter the Second number: ");
                    num2=obj.nextInt();
                    System.out.println("\nThe Division of "+num1+" and "+num2+" is "+p3.divide(num1, num2)+"\n");
                    break;
                case 7:
                    System.out.println("\n\n *****Exiting the Application.*****");
                    break;
                default:
                    System.out.println("\nEnter proper input.");
            }
        }        
    }    
}
