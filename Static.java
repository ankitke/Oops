class Static
{
    static int a;
    static int b;
    
    int m;
    int n;
    
    static
    {
        System.out.println("Control in static block");
        a=10;
        b=20;
    }
    
    {
        System.out.println("Control in non static block");
        m=10;
        n=20;
    }
    
    static void disp()
    {
        System.out.println("Value of a is = "+a);
        System.out.println("Value of b is = "+b);
    }
    
    void disp2()
    {
        System.out.println("Value of m is = "+m);
        System.out.println("Value of n is = "+n);
    }
}
class MyCl
{
    public static void main(String args[])
    {
        Static s=new Static();
        s.disp2();
        Static.disp();
        
        
    }
}