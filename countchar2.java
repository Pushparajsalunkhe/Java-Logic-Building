public class countchar2 
{
    public static void main(String args[])
    {
        String str="aaabbcc";
        String newstr="";
        int count =1;


        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                count++;
            }
            else
            {
                newstr=newstr+str.charAt(i)+count;
                count=1;
            }
            
        }

        newstr=newstr+str.charAt(str.length()-1)+count;
        System.out.println("The Input String is:"+str);
        System.out.println("The output String is: "+newstr);
    }
}
