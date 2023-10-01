package protecteddefault.package2;

import protecteddefault.package1.parentclass;

/**
 *
 * @author VISHWA
 */
public class childclass extends parentclass
{
    public void accessProperties() 
    {
        System.out.println(protectedProperty);
        //System.out.println(defaultProperty); // This will cause a compile error
    }     
}
