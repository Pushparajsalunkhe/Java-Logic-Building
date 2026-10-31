public class printduplicateele {
    public static void main(String args[])
        {
            int arr[]={20,46,73,85,46,73,46};
            
            for(int i=0;i<arr.length;i++)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        System.out.print("\n Duplicate Element:"+arr[i]);
                    }
                }
            }
        }
    
}

