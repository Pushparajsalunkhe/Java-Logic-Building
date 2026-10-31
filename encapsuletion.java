class demo
{
     private String sname;

     public void setter(String x)
     {
        sname=x;
     }

     public String getter()
     {
        return sname;
     }


}

public class encapsuletion {

    public static void main(String args[])
    {
         demo d=new demo();

         d.setter("pushparaj");

        String s= d.getter();

        System.out.println("Name is:"+s);
    }
    
}
