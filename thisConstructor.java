
class student
{
    int id;
    String name;
    int age;

    student(int id , String name , int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
    }

    student()
    {   this(101,"Rohit",23);
        System.out.println("Today Date is 26/08/2026");
    }

    void display()
    {
        System.out.println("Teacher Id is:"+id);
        System.out.println("Teacher Name is:"+name);
        System.out.println("Teacher Age is:"+age);
    }

}
public class thisConstructor 
{
    public static void main(String args[])
    {
        student t= new student();
        t.display();
    }
}
