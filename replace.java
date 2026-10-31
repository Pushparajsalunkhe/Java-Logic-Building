public class replace 
{
    public static void main(String args[])
    {
        String str="daddy";
        String replaceString=str.replace("d","f");

        System.out.println("Original String: "+str);
        System.out.println("Replace String: "+replaceString);

        String surname="shinde123";
        String surname_new=surname.replaceAll("[0-9]","") ;
        System.out.println("New Surname is:"+surname_new);
    }
}
