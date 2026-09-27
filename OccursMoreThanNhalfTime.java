// Boyer Moore Voting Algorithm
public class OccursMoreThanNhalfTime 
{
    public static void main(String args[])
    {
        int arr[]={1,2,1,4,1};
        int candidate=0;
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            if(count==0)
            {
                candidate=arr[i];
            }
            if(arr[i]==candidate)
            {
                count++;
            }
            else
            {
                count--;
            }
        }

        count=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==candidate)
            {
                count++;
            }
        }

        if(count>arr.length/2)
        {
            System.out.println(candidate);
        }
        else
        {
            System.out.println("Majority Element of n/2 is not Found");
        }
    }
}
