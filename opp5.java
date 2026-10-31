// Copy Constructor

class teacher
{
   int id;
   String name;
   int age;

   teacher(int a,String b,int c)
   {
      id=a;
      name=b;
      age=c;
   }

   teacher(teacher tea)
   {
      id=tea.id;
      name=tea.name;
      age=tea.age;
   }
}
public class opp5 
{
    public static void main(String args[])
    {
       teacher t=new teacher(101, "Mahesh", 22);

       teacher t1=new teacher(t);

        System.out.println("Teacher Id is:"+t.id);
        System.out.println("Teacher Name is:"+t.name);
        System.out.println("Teacher Age is:"+t.age);

        System.out.println("Teacher Id is:"+t1.id);
        System.out.println("Teacher Name is:"+t1.name);
        System.out.println("Teacher Age is:"+t1.age);
    }
}
