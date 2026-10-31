public class arrayvowel 
{
    public static void main(String args[])
    {
        char [] letter={'l','r','t','y','g'};
        boolean check=false;

        for(int i=0;i<letter.length;i++)
        {
            if(letter[i]=='a'||letter[i]=='e'||letter[i]=='i'||letter[i]=='o'||letter[i]=='u')
            {
                check=true;
            }      
        }

        if(check==true)
        {
            System.out.println("Vowel is Present in Array");
        }
        else{
            System.out.println("Vowel is not Present in Array");
        }
    }
}
