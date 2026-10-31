import java.util.*;
class demo
{

public static void main (String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("Are You Registered");
Boolean isregist=sc.nextBoolean();

if(isregist==true)
{
   System.out.println("Registered Successfull! Now you are eligible for login");
   System.out.println("Enter Username");
   String username=sc.next() ;
   System.out.println("Enter Password");
   String password=sc.next();

   if(username.equals("Admin") && password.equals("admin123"))
     {
         System.out.println("Successfull login");
     }
   else
     {
        System.out.println("login is Failed");
     }


}
else
{
  System.out.println("Registered is Failed");
}

}
}