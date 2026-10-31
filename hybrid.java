class Employee
{
    void name()
    {
        System.out.println("Employee has there own name");
    }
}

class Developer extends Employee
{
     void code()
     {
        System.out.println("Developer Working on build the system");
     }
}

class tester extends Employee
{
    void test()
    {
        System.out.println("Tester work on test the System");
    }
}

class senior extends Developer
{
    void project()
    {
        System.out.println("The senior Softwer Engineer woking on the Project");
    }
}

public class hybrid 
{
    public static void main(String args[])
    {
       senior s=new senior();
       s.name();
       s.code();
       s.project();

       tester t=new tester();
       t.name();
       t.test();
    }
}
