interface person
{
    void show(); 
}
class student implements person
{
     public void show()
     {
        System.out.println("I am the Student class");
     }
}
class devloper implements person
{
    public void show()
    {
        System.out.println("I am the Devloper class");
    }

}

public class interfaceCode
{
    public static void main(String args[])
    {
         person p=new student();
         p.show();

         person p1=new devloper();
         p1.show();
    }
    
}
