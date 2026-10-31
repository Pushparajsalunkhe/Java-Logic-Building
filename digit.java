import java.util.*;
public class digit
{
public static void main(String args[])
{
int num=123,count=0;
while(num!=0)
{
count++;
num=num/10;
}
System.out.println("Count of Digit is:"+count);
}
}