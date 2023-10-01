/*
 In pack2, create a class named StringOperations with the following methods:
     concatenate(String str1, String str2) - This method should concatenate two strings and return the result.
     reverse(String str) - This method should reverse a given string and return the reversed string.
 */
package pack2;

public class StringOperations 
{
    public String concatenate(String str1,String str2)
    {
        return str1+str2;
    }
    public String reverse(String str)
    {
        String rev="";
        int n=str.length();
        for(int i=n-1;i>=0;i--)
        {
            char c=str.charAt(i);
            rev=rev+c;
        }
        return rev;
    }
}
