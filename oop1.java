// Constructor

class teacher
{
    int id;
    String name;

    teacher()
    {
        id=101;
        name="pushparaj";
    }
    
    void display()
    {
        System.out.println("Teacher Id is:"+id);
        System.out.println("Teacher Name is:"+name);
    }

}

public class oop1 
{
    public static void main(String args[])
    {
         teacher t=new teacher();
         t.display();
    }
}
