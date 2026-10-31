public class multidarray 
{
    public static void main(String args[])
    {
        int num[][][]={{{1,2,3},{4,5,6},{7,8,9}},{{10,11,12},{13,14,15},{16,17,18}},{{19,20,21},{22,23,24},{25,26,27}}};

        for (int m=0;m<num.length;m++)
        {
            for(int row=0;row<num.length;row++)
            {
                for(int col=0;col<num.length;col++)
                {
                    System.out.print(num[m][row][col] +" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
