/*
 3. Show how protected properties from the subclass can be accessed but not default properties.
 */
package protecteddefault.package2;

/**
 *
 * @author VISHWA
 */
public class Protected 
{
     public static void main(String[] args) 
     {
        childclass child = new childclass();
        child.accessProperties();
    }
}
