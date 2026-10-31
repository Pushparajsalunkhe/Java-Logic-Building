import java.util.*;
public class stringmethod 
{
   public static void main(String args[])
   {
       String name="P o o j a";
       String new_name=name.replaceAll(" ","");
       System.out.println("New Name is:"+new_name);

       String surname="shinde123";
       String surname_new=surname.replaceAll("[0-9]","") ;
       System.out.println("New Surname is:"+surname_new);

       String email="Fortune cloud technologies";
       String email_new=email.replaceAll("o","p");
       System.out.println("New Email is:"+email_new);
       

       String city="pune";
       System.out.println("\n1.Using char at method:Reverse String is:");

       for(int i=city.length()-1;i>=0;i--)
       {
            System.out.print(city.charAt(i));
       }
       
       System.out.println("\n2.Using tocharArray Method:");

       char [] alpha=city.toCharArray();
       for(int i=alpha.length-1;i>=0;i--)
       {
          System.out.print(alpha[i]);
       }

       //reverse string using another variable

       System.out.println("Enter The String:");
       Scanner sc=new Scanner (System.in);

       String clg=sc.next();

       System.out.println("Enter The Character");
       char ch=sc.next().charAt(0);

       System.out.println("index of "+ch+" is"+clg.indexOf(ch));
       

       String address="pushparaj Ramkrushna Salunke";
       System.out.println("Before Split String Words are:"+address);

       String [] words=address.split(" ");

       System.out.println("After Split String Words are:");

       for(int i=0;i<words.length;i++)
        {
             System.out.println(words[i]);
        }
   } 
}
