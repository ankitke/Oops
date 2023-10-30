class Student
{
    private String name;
    private int age;
    
    public Student()
    {
        
        System.out.println("No parameter constructor  called");
        name="Ankit";
        age=20;
    }
    
    public Student(String name)
    {
        this("Anshu", 22);
        this.name=name;
        age=21;
    }
    
    public Student(String name, int age)
    {
        this();
        this.name=name;
        this.age=age;
    }
    
    void display()
    {
        System.out.println(name);
        System.out.println(age);
    }
}
class MyCl
{
    public static void main(String args[])
    {
        Student s=new Student();
        s.display();
        
        Student s2=new Student("Rahul");
        s2.display();
        
        Student s3=new Student("Komal", 18);
        s3.display();
    }
}