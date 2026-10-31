import java.util.*;

public class queue {
     int [] arr;
        int size;
        int front=0 , rear=-1;

        queue(int size){
            this.size=size;
            arr=new int[size];
        }
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter The Queue Size:");
          int size =sc.nextInt();

          queue s=new queue(size);

          do{

            System.out.println("!!----- Queue Manu -----!!");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.peek");
            System.out.println("4.Display");
            System.out.println("5.Search");
            System.out.println("6.Exit");

            System.out.println("Entre Your Choich:");
            int choich=sc.nextInt();

            switch(choich)
            {
                case 1:
                    s.enque();
                    break;

                case 2:
                    s.deque();
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
                    System.out.println("Exit...");
                    System.exit(6);

                default:
                    System.out.println("Invalid Choich");
            }
          }while(true);
    }

    void enque()
    {
        if (rear==size-1)
        {
            System.out.println("Queue is Overflow");
        }
        else{
            Scanner sc=new Scanner (System.in);
            System.out.println("Enter The Element");
            int value=sc.nextInt();
            rear++;
            arr[rear]=value;
            System.out.println("Element is inserted in the Queue");
        }
    }

    void deque()
    {
         if(rear==-1 || front>rear)
         {
            System.out.println("Queue is Underflow");
         }
         else
         {
            int ele=arr[front];
            System.out.println("Element is Deleted form the Queue:"+ele);
            front++;
         }
    }

    void peek()
    {
       if(rear==-1 || front>rear)
       {
           System.out.println("Queue is Underflow");
       }
       else
       {   
          System.out.println("Top Element:"+arr[rear]);
       }
    }

    void display()
    {
        if(rear==-1 || front>rear)
        {
            System.out.println("Queue is Underflow");
        }
        else
        {   
            System.out.println("Queue Element:");
            for(int i=front;i<=rear;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }

    void search()
    {
        if(rear==-1 || front>rear)
        {
            System.out.println("Queue is Underflow");
        }
        else
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enetr The Search Element:");
            int ele=sc.nextInt();
            boolean flag=false;
            for(int i=front;i<=rear;i++)
            {
                if(arr[i]==ele)
                {
                    flag=true;
                }
            }

            if(flag==true)
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
