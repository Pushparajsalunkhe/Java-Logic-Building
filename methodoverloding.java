class demo
{   
    String name;
    int id;
    void info(String name)
    {
        this.name=name;
    }

    void info(int id)
    {
        this.id=id;
    }

    void info(String name , int id)
   {
      this.name=name;
      this.id=id;
   }

   void info(int id,String name)
   {
        this.id=id;
        this.name=name;
   }
}
public class methodoverloding 
{
    public static void main(String args[])
    {
        demo d=new demo();

         d.info("raj");
         System.out.println("Name is: "+d.name);
   
        d.info(101);
        System.out.println("Id is: "+d.id);

        d.info("rohit",102);
        System.out.println("Name is: "+d.name);
        System.out.println("Id is: "+d.id);

        d.info(103,"mohit");
        System.out.println("Id is: "+d.id);
        System.out.println("Name is: "+d.name);


    }
}
