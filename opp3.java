// 0 Arg Constructor

class teacher
{
    int id;
    String name;

    teacher()
    {
        id=101;
        name="Rohit";
    }

    
}
public class opp3 
{   
    public static void main(String args[])
    {
        teacher t=new teacher();

    System.out.println("Teacher Id is:"+t.id);
    System.out.println("Teacher Name is:"+t.name);
    }
    
}
