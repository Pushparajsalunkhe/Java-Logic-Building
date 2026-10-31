// Parameterized Constructor

class teacher
{
      int id;
      String name;

      teacher(int a,String b)
      {
        id=a;
        name=b;
      }
}

public class opp4 
{
    public static void main(String args[])
    {

        teacher t=new teacher(122 , "Manthon");
        System.out.println("Teacher Id is:"+t.id);
        System.out.println("Teacher Name is:"+t.name);
    
    }
}
