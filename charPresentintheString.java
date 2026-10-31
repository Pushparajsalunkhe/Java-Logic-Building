class charPresentinthestring
{
    public static void main(String args[])
    {
        
        String str="pushparaj";
        char arr[]=str.toCharArray();
        int index=2;
        char ch=arr[0];

        for(int i=0;i<=index;i++)
        {
            ch=arr[i];
        }

        System.out.println("The Character at "+index+" index is "+ch);
    }
}