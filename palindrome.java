import java.util.*;
public class palindrome
{
public static void main (String args[])
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter The Number");
int num=sc.nextInt();
int re=0,rem,temp=num;

while(num!=0)
{
    rem=num%10;
    re=re*10+rem;
    num=num/10;
}

System.out.println("Orignal Number is:"+temp);
System.out.println("Revers Number is:"+re);

if(temp==re)
{
System.out.println("Number is Palindrome");
}
else
{
System.out.println("Number is Not Palindrome");
}

}
}    