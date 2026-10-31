// method

class teacher
{
    int id;
    String name;

    void set(int a,String b)
    {
        id=a;
        name=b;
    }

    void display()
    {
        System.out.println("Teacher Id is:"+id);
        System.out.println("Teacher Name is:"+name);
    }
}
class oop
{
    public static void main(String args[])
    {
         teacher t=new teacher();
         t.set(101,"raj");
         t.display();
    }
}