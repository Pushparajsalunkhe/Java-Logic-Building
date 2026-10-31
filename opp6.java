// Overloading Constructor

class student
{
    int id;
    String name;
    int age;
    
    student()  
    {
        id=101;
        name="raj";
        age=23;
    }

    student(int a)
    {
       id=a;
    }

    student(int a , String b , int c)
    {
        id=a;
        name=b;
        age=c;
    }

    void display()
    {
        System.out.println("Teacher Id is:"+id);
        System.out.println("Teacher Name is:"+name);
        System.out.println("Teacher Age is:"+age);
    }

}
public class opp6 
{
    public static void main(String args[])
    {
       student s=new student();
       s.display();

       student s1=new student(12);
       s1.display();

       student s2=new student(1,"Parimal",24);
       s2.display();
    }
}
