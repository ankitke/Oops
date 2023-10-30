class Demo
{
    int a,b;
    public Demo()
    {
        System.out.println("Hello");
    }
    public Demo(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    void display()
    {
        System.out.println(a);
        System.out.println(b);
    }
    
}
class MyCl
{
    public static void main(String args[])
    {
        Demo d=new Demo();
        d.display();
        
        Demo d2=new Demo(34,56);
        d2.display();
        
    }
}