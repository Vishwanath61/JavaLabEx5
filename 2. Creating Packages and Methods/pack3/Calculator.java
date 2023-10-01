/*
 In pack3, create a class named Calculator with the following methods:
     multiply(int a, int b) - This method should return the product of two integers.
     divide(int a, int b) - This method should return the result of dividing a by b.
        Make sure to handle division by zero by returning an appropriate message.
 */
package pack3;

public class Calculator 
{
    public int multiply(int a,int b)
    {
        return a*b;
    }
    public int divide(int a,int b)
    {
        int div=0;
        try
        {
            div=a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        return div;
    }
}
