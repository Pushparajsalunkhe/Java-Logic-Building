public class countChar1 
{
    public static void main(String args[])
    {
        char arr[]={'a','a','b','c','d','b','a'};
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            boolean flag=false;
            for(int k=0;k<i;k++)
            {
                if(arr[i]==arr[k])
                {
                    flag=true;
                }
            }

            if(flag==true)
            {
                continue;
            }
            
            for(int j=i+1;j<arr.length;j++)
            {
                 if(arr[i]==arr[j])
                 {
                    count++;
                 }
            }
            System.out.println("The Character is "+ arr[i]+" and the count is "+count);
        }
    }
}
