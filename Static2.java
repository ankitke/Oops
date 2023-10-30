class Alpha
{
    static int a;
    static int b;
    
    int m;
    int n;
    
    static
    {
        System.out.println("Static block");
        a=10;
        b=20;
    }
    
    {
        System.out.println("Non Static block");
        m=100;
        n=200;
    }
}
class MyCl
{
    public static void main(String args[])
    {
        Alpha alp=new Alpha();
        Alpha alp2=new Alpha();
        
     
    }
}