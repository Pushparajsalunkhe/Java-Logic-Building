class Teacher
{
    int id;
    String name;
    int age;

    Teacher(int id , String name , int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
    }

    void display()
    {
        System.out.println("Teacher Id is:"+id);
        System.out.println("Teacher Name is:"+name);
        System.out.println("Teacher Age is:"+age);
    }
}
public class thisVariable 
{
    public static void main(String args[])
    {
        Teacher t=new Teacher(101,"pushparaj",22);
        t.display();
    }
}
