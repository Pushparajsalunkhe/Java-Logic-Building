class InvalidAgeException extends RuntimeException
{
    public InvalidAgeException(String msg)
    {
         super(msg);
    }
}


public class throwkeyword 
{
    public static void main(String args[])
    {
        int age=15;
        if(age>=18)
        {
            System.out.println("You Are Eligible for Voting");
        }
        else
        {
            throw new InvalidAgeException("You Are Not Eligible for Voting");
        }
        System.out.println("Please Come and vote! Thank You");
    }
}
