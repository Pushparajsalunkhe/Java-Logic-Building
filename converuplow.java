class converuplow
{
    public static void main(String args[])
    {
            String str="WelCOME String to THE JaVa";
            String result="";
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(Character.isUpperCase(ch))
                {
                    result=result+Character.toLowerCase(ch);
                }
                else
                {
                    result=result+Character.toUpperCase(ch);
                }
            }
        System.out.println(result);
    }
}