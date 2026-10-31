class test
{
    void set()
    {
        this.get();
        System.out.println("Good Morning Student");
    }

    void get()
    {
        System.out.println("Good Morning Sir");
    }
}
public class thisMethod 
{
    public static void main(String args[])
    {
        test t=new test();

        t.set();
    }
}
