import java.util.*;
public class swap 
{
    public static void main(String args[])
        {
            Scanner sc=new Scanner (System.in);
            System.out.println("Entre First Number:");
            int num1=sc.nextInt();
            System.out.println("Enter Second Number:");
            int num2=sc.nextInt();
            
            System.out.println("Swap Before Two Number:" + num1 + " " + num2);
            
            // num1=num1^num2;
            // num2=num1^num2;
            // num1=num1^num2;

            // num1=num1+num2;
            // num2=num1-num2;
            // num1=num1-num2;

            int temp;
            temp=num1;
            num1=num2;
            num2=temp;

            System.out.println("Swap After Two Number:" + num1 + " " + num2);

        }
    
}
