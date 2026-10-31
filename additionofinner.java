public class additionofinner {
    public static void main(String args[])
    {
        int [][]arr={{1,2,3,4},{5,6,7,8},{9,0,1,2,},{4,5,6,7}};
        //print the 2d Array
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr.length;col++)
            {
                System.out.print(" "+arr[row][col]);
            }
            System.out.println("");
        }

        //Addition of inner element in 2d array
        int sum=0;
        for(int row=1;row<arr.length-1;row++)
        {
            for(int col=1;col<arr.length-1;col++)
            {
                sum=sum+arr[row][col];
            }
        }

        System.out.println("Addition of inner Element is:"+sum);


    }
}
