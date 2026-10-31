import java.util.*;
public class stack 
{
    int [] arr;
    int size;
    int top=-1;
    stack(int size){
        this.size=size;
        arr=new int [size];
    }
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Stack Size:");
        int size=sc.nextInt();

        stack s=new stack(size);
        do
        {
            System.out.println("!!----- STACK MANU -----!!");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("5.Search");
            System.out.println("6.Exit");

            System.out.println("Enter Your Choich:");
            int choich=sc.nextInt();

            switch(choich)
            {
                case 1:
                    s.push();
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.peek();
                    break;

                case 4:
                    s.display();
                    break;
                
                case 5:
                    s.search();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(5);

                default:
                    System.out.println("Valid Choich.");
                
            }

        } while(true);

    }


    void push()
    {
        if(top==size-1)
         {
            System.out.println("Stack is Overflow");
         }
        else
         {
            top++;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter The Element:");
            int value=sc.nextInt();
            arr[top]=value;
            System.out.println("Element Push on the Stack");
         }
    }

    void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is Underflow");
        }
        else{
            
            int ele=arr[top];
            System.out.println("Element is Deleted no the Stack:"+ele);
            top--;
        }
    }

    void peek()
    {
        if(top==-1)
        {
            System.out.println("Stack is underflow");
        }
        else{
            System.out.println("Top Element:"+arr[top]);
        }
    }

    void display()
    {
        if(top==-1)
        {
            System.out.println("Stack is Underflow");
        }
        else{
            System.out.println("Element is:");   
            for(int i=top;i>=0;i--)
                {
                    System.out.println(arr[i]);
                    
                }
        }
    }
    void search()
    {
        if(top==-1)
        {
            System.out.println("Stack is Underflow");
        }
        else{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter The Search Element:");
            int ele=sc.nextInt();
            Boolean count=false;
            for(int i=top;i>=0;i--)
            {
                if(arr[i]==ele)
                {
                    count=true;
                }
            }

            if(count==true)
            {
                System.out.println("Element is Found");
            }
            else
            {
                System.out.println("Element is Not Found");
            }

        }
    }
}
