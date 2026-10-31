interface father
{
    void info(String name);
       
}
interface mother
{
     void info(String name);
}

class child implements father,mother
{
       
        public void info(String name)
        {
            System.out.println("My Name is:"+name);
        }
}

public class multiple {
    public static void main(String args[])
        {
             father f=new child();
             f.info("Raj");

             mother m=new child();
             m.info("Diksha");

    }
}
