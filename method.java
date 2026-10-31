public class method 
{
    public static void main(String args[])
    {
         add(); // call Static Method
         // 1.Create Object of class
         method ob=new method();  // new method() object create it is the object 
        // 2.call no Static method
        ob.multiplication(); // call No Static Method

        // parameterized method
        ob.div(10, 2);  // no static 

        sub(10, 5);    // static 
        // return type method 
        System.out.println(ob.even_odd(20)); // no static

        System.out.println(name());  // static
    }

    static void add()  // Static Method
    {
        int a=10;
        int b=20;
        int c=a+b;

        System.out.println("Addtion is:"+c);
    }

    void multiplication() // No Static Method
    {
        System.out.println("Multipication is:"+(10*2));
    }

    // parameterized method can be static and on static 

    // 1.on static
    void div(int a,int b)
    {
        int c=a/b;
        System.out.println("Division is:"+c);
    }

    //2.static

    static void sub(int a,int b)
    {
      System.out.println("Subtaction is:"+(a-b));
    }


    // return type method can be static and on static
    // on static 
    String even_odd(int num)
    {
        if(num%2==0)
        {
            return "Even";
            
        }
        else
        {
            return "odd";
        }
    }
    
    // static

    static String name()
    {
        return "pushparaj"; 
    }

}
