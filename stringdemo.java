// public class stringdemo
// {
//     public static void main(String args[])
//     {
//         String str="pushparaj";
//         for(int i=str.length()-1;i>=0;i--)
//         {
//             System.out.print(str.charAt(i));
//         }
//     }
// }

// class stringdemo
// {
//     public static void main(String args[])
//     {
//         String str="pushparaj";
//         String str1="";
//         char ch;

//         for(int i=str.length()-1;i>=0;i--)
//         {
//             ch=str.charAt(i);
//             str1=str1+ch;
//         }

//         if(str.equals(str1))
//         {
//             System.out.println("String is palidrome");
//         }
//         else
//         {
//             System.out.println("String is not palindrome");
//         }

//     }
// }

// class stringdemo
// {
//     public static void main(String args[])
//     {
//         String str="pushparaj";
//         int count_vowel=0,count_cons=0;
//         {
//            for(int i=0;i<str.length();i++)
//            {
//             if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='e' || str.charAt(i)=='o' || str.charAt(i)=='u')
//             {
//                 count_vowel++;
//             }
//             else
//             {
//                 count_cons++;
//             }
//            }

//            System.out.println("Vowel count is:"+count_vowel);
//            System.out.println("Consonants count is:"+count_cons);
//         }
//     }
// }

// class stringdemo
// {
//     public static void main(String args[])
//     {
//         String str="    ";
//         int count=0;
//         for(int i=0;i<str.length();i++)
//         {
//             if(str.charAt(i)==' ')
//             {
//                 count++;
//             }
//         }

//         System.out.println(count);
//     }
// }

// class stringdemo
// {
//     public static void main(String args[])
//     {
//         String str="pushparaj";
//         char arr[]=str.toCharArray();

//         for(int i=0;i<arr.length;i++)
//         {
//             int count=1;
//             boolean flage=false;
//             for(int j=0;j<i;j++)
//             {
//                 if(arr[i]==arr[j])
//                 {
//                    flage=true;
//                 }
//             }

//             if(flage==true)
//             {
//                 continue;
//             }

//             for(int k=i+1;k<arr.length;k++)
//             {
//                if(arr[i]==arr[k])
//                {
//                    count++;
//                }
                
//             }

//             System.out.println(arr[i]+" = "+count);

//         }
//     }
//}

// class stringdemo
// {
//     public static void main(String args[])
//     {
//         String str="pushparaj";
//         char arr[]=str.toCharArray();
//         int found=0;

//         for(int i=0;i<arr.length;i++)
//         {
//             int count=0;
//             for(int j=0;j<arr.length;j++)
//             {
//                 if(arr[i]==arr[j])
//                 {
//                     count++;
//                 }
//             }
//             if(count==1)
//             {
//                 System.out.println(arr[i]);
//                 found=1;
//                 break;
//             }

//         }
//     }
// }

// class stringdemo
// {
//     public static void main(String args[])
//     {
//         String str="pushparaj";
//         char arr[]=str.toCharArray();
//         for(int i=0;i<arr.length;i++)
//         {   int found=0;
//             boolean flag=false;
//             for(int j=i+1;j<arr.length;j++)
//             {
//                 if(arr[i]==arr[j])
//                 {
//                     flag=true;
//                 }
//             }
//             if(flag==true)
//             {
//                 continue;
//             }
//             System.out.println(arr[i]);
//         }
//     }
// }

// class stringdemo
// {
//     public static void main(String args[])
//     {
//         String str="pushparaj";
//         char arr[]=str.toCharArray();
//         int found=0;
//         for(int i=0;i<arr.length;i++)
//         {
//               for(int j=i+1;j<arr.length;j++)
//               {
//                 if(arr[i]==arr[j])
//                 {
//                     System.out.println(arr[i]);
//                     found=1;
//                     break;
//                 }
//               }
//               if(found==1)
//               {
//                 break;
//               }
//         }
//     }
// }

// class stringdemo
// {
//     public void main(String args[])
//     {
//         String str="raj rahul";
//         char arr[]=str.toCharArray();

//         for(int i=0;i<arr.length;i++)
//         {
            
//             if(arr[i]!=' ')
//             {
//                 System.out.print(arr[i]);
//             }
//         }
//     }
// }

class stringdemo
{
    public static void main(String args[])
    {
        String str="listen";
        String str1="silent";
        boolean flag=false;
        for(int i=0;i<str.length();i++)
        {   
            for(int j=i+1;j<str1.length();j++)
            {
                  if(str.charAt(i)==str1.charAt(j))
                  {
                      flag=true;
                  }
            }
            
        }
        if(flag==true)
        {
            System.out.println("String is Anagram");
        }
        else
        {
            System.out.println("String is not Anagram");
        }
        
    }
}