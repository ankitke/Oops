class Static
{
    static int age;
    
    static
    {
        System.out.println("Static block");
        age=17;
    }
    
    static void disp()
    {
        System.out.println("Disp is static method");
        System.out.println(age);
    }
    
    public static void main(String args[])
    {
        System.out.println("Main method");
        disp();
    }
    
}