class Student
{
    private int age;
    private String name;
    
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName(String name)
    {
        return name;
    }
    public void show()
    {
        System.out.println(age+" "+name);
    }
}
class Demo
{
    public static void main(String args[])
    {
        Student s=new Student();
        Student s2=new Student();
        s.setAge(20);
        s2.setAge(18);
        s.setName("Ankit");
        s2.setName("Rahul");
        s.show();
        s2.show();
    }
}