
public class star
{
    public static void main(String[] args) {

        for (int row=0;row<5;row++)
        {
            for(int s=0;s<2*(5-row)-1;s++)
                System.out.print(" ");
            {
                for(int col=0;col<2*row+1;col++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    
}
}