import java.util.*;
public class name
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your Name:");
String name=sc.nextLine();  // next->read one word //nextLine-> read all content int line include space
System.out.println("How many time you want to print your name");
int count=sc.nextInt();
for(int i=1;i<=count;i++)
{
    System.out.println(i+name);
}
}
}