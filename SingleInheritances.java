class animal
{
    void run()
    {
        System.out.println("Animal is Running....");
    }
}
class dog extends animal
{
    void eating()
    {
        System.out.println("Dog is Eating");
    }
}
public class SingleInheritances {

    public static void main(String args[])
    {
          dog d=new dog();
          d.run();
          d.eating();
    }
    
}
