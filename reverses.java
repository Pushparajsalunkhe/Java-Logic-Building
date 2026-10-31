import java.util.*;
public class reverses
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter The start Digit");
int start=sc.nextInt();
System.out.println("Enter The End Digit:");
int end=sc.nextInt();

do{

    System.out.println(end);
    end--;


}while(end>=start);
}
}