import java.util.*;
class countVowelConstents
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String:");
        String str=sc.nextLine();

        int vowel_count=0,constents_count=0;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' ||str.charAt(i)=='u')
            {
                vowel_count++;
            }
            else
            {
                constents_count++;
            }
        }

        System.out.println("Vowel Count is:"+vowel_count);
        System.out.println("Constents Count is:"+constents_count);
    }
}