class animal{

    void run()
    {
        System.out.println("Animal is Running");
    }
}

class dog extends animal
{
     void eating()
     {
        System.out.println("Dog is Eating");
     }
}

class cat extends animal
{
      void meow()
      {
        System.out.println("cat is Meow");
      }
}

public class Hierarchical 
{
    public static void main()
    {
            dog d=new dog();
            d.run();
            d.eating();

            cat c=new cat();
            c.run();
            c.meow();
    }
}
