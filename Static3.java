class Static
{
    static void disp1()
    {
        System.out.println("This is a static method");
    }
    
    void disp2()
    {
        System.out.println("This is a non static method");
    }
}
class MyCl
{
    public static void main(String args[])
    {
        Static s=new Static();
        Static.disp1();
        
        s.disp2();
        s.disp1();
        
        
    }
}