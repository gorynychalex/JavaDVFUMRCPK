package ru.dvfu.mrcpk.tests;

public class test03 {
    public static void main(String[] args) {
        boolean a = false, b = false;
        new test03().foo(a,b);
    }

    public void foo( boolean a, boolean b)
    {
        if( a )
        {
            System.out.println("A"); /* Line 5 */
        }
        else if(a && b) /* Line 7 */
        {
            System.out.println( "A && B");
        }
        else /* Line 11 */
        {
            if ( !b )
            {
                System.out.println( "notB") ;
            }
            else
            {
                System.out.println( "ELSE" ) ;
            }
        }
    }
}
