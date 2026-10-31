class demo
{
   public void show()
   {
    System.out.println("This is demo class");
   }
}
class demo1 extends demo
{
   public void show()
   {
    System.out.println("This is demo1 class");
   }
}
public class methodoverridong 
{
    public static void main(String args[])
    {
          demo1 d1=new demo1();
          d1.show();
    }
}
