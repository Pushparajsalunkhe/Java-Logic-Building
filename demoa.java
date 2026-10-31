// class demoa
// {
//     public static void main()
//     {
//         int []arr={1,2,3,2,4,3,5};
//         for(int i=0;i<=arr.length;i++)
//         {
//             for(int j=i+1;j<arr.length;j++)
//             {
//                if(arr[i]==arr[j])
//             {
//                 System.out.println(arr[i]);
//             }
//             }
//         }
//     }
// }

// class demoa
// {
//     public static void main(String args[])
//     {
//         int []arr={1,2,2,3,4,3,5};
//         for(int i=0;i<arr.length;i++)
//         {
//             int duplicat=0;
//             for(int j=0;j<i;j++)
//             {
//                 if(arr[i]==arr[j])
//                 {
//                     duplicat=1;
//                     break;
//                 }
//             }
//             if(duplicat==0)
//             {
//                System.out.println(arr[i]);
//             }

//         }
//     }
// }

// class demos{
//     public static void main(String args[])
//     {   
//         int []arr={1,2,3,5};
//         int total=0,n=arr.length,sum=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             sum=sum+arr[i];
//         }
//         total=n*(n-1)/2;
//         System.out.println(total-sum);
        
//     }
// }

// class demoa
// {
//     public static void main(String args[])
//     {
//          int [] arr={1,2,2,3,1,2,4};
//          for(int i=0;i<arr.length;i++)
//          {
//             int feq=1;
//             boolean flage=false;
//             for(int k=0;k<i;k++)
//             {
//                 if(arr[i]==arr[k])
//                 {
//                     flage=true;
//                     break;
//                 }
//             }

//             if(flage==true)
//             {
//                 continue;
//             }

//             for(int j=i+1;j<arr.length;j++)
//             {
//                 if(arr[i]==arr[j])
//              {
//                 feq++;
//              }
//             }

//             System.out.println(arr[i]+" = "+feq);
//          }
//     }
// }

// class demoa
// {
//     public static void main(String args[])
//     {
//         int []arr={3,10,5,3,4,3,5};
//         int found=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=i+1;j<arr.length;j++)
//             {
//                 if(arr[i]==arr[j])
//                 {
//                     System.out.println(arr[i]);
//                     found=1;
//                     break;
//                 }
//             }
//             if(found==1)
//             break;
//         }

//         if(found==0)
//         {
//            System.out.println("Duplicte Element is not found");
//         }
//     }
// }

// class demoa
// {
//     public static void main(String args[])
//     {
//         int [] arr={4,5,1,2,1,4,5};
//         int found=0;
//         for(int i=0;i<arr.length;i++)
//         {
//               int count=0;
//               for(int j=0;j<arr.length;j++)
//               {
//                    if(arr[i]==arr[j])
//                    {
//                        count++;
//                    }
//               }

//               if(count==1)
//               {
//                 System.out.println(arr[i]);
//                 found=1;
//                 break;
//               }
//         }

//         if(found==0)
//               {
//                 System.out.println("No non-repeating Element");
//               }
//     }
// }

// class demoa
// {
//     public static void main(String args[])
//     {
//         int [] arr={1,2,3,4,5};
//         int [] arr1={3,4,5,6,7};

//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=0;j<arr.length;j++)
//             {
//                 if(arr[i]==arr1[j])
//                 {
//                     System.out.println(arr[i]); 
//                     break;
//                 }
//             }
//         }
//     }
// }

// class demoa
// {
//     public static void main(String args[])
//     {
//         int arr[]={1,2,3};
//         int arr1[]={4,5,6};
       
//         int len=arr.length+arr1.length;
//         int arr2[]=new int[len];

//         for(int i=0;i<arr.length;i++)
//         {
//             arr2[i]=arr[i];
//         }
//         for(int j=0;j<arr1.length;j++)
//         {
//             arr2[arr.length+j]=arr1[j];
//         }

//         for (int k=0;k<len;k++)
//         {
//             System.out.println(arr2[k]);
//         }


//     }
// }


// class demoa
// {
//     public void main(String args[])
//     {
//     int arr[]={1,3,5};
//     int arr1[]={2,4,6};
//     int len=arr.length+arr1.length;
//     int arr3[]=new int[len];
//     int i=0,j=0,k=0;
    
//     while(i<arr.length && j<arr1.length)
//     {
//         if(arr[i]<arr1[j])
//         {
//             arr3[k]=arr[i];
//             i++;
//         }
//         else
//         {
//             arr3[k]=arr1[j];
//             j++;
//         }
//         k++;
//     }  

//     while(i<arr.length)
//     {
//         arr3[k]=arr[i];
//         i++;
//         k++;
//     }

//     while(j<arr1.length)
//     {
//         arr3[k]=arr1[j];
//         j++;
//         k++;
//     }

//     for(int r=0;r<len;r++)
//     {
//         System.out.println(arr3[r]);
//     }
//     }
// }

// class demoa
// {
//     public static void main(String args[])
//     {
//         int arr []={1,0,3,0,5,0,2};
//         int n=arr.length;
//         int index=0;

//         for(int i=0;i<n;i++)
//         {
//             if(arr[i]!=0)
//             {
//                 arr[index]=arr[i];
//                 index++;
//             }
//         }

//         while(index<n)
//         {
//             arr[index]=0;
//             index++;
//         }

//         for(int i=0;i<n;i++)
//         {
//             System.out.println(arr[i]);
//         }
//     }
// }

// class demoa
// {
//     public static void main(String args[])
//     {
//         int arr[]={1,2,3,4,5,6,7,8,9};
        
//         System.out.println("Even Number:");
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]%2==0)
//             {
//                 System.out.println(arr[i]);
//             }
//         }

//         System.out.println("Odd Number:");
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]%2!=0)
//             {
//                System.out.println(arr[i]);
//             }
//         }

//     }
// }
// import java.util.*;
// class demoa
// {
//     public static void main(String args[])
//     {
//         int arr[]={1,2,3,4,5,6,7,8,9};
//         int n=arr.length;
//         int k=4;

//         k=k%n;

//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the choice:");
//         int choice=sc.nextInt();

//        if(choice==1)
//        {
//            for(int r=0;r<k;r++)
//            {
//             int first=arr[0];
//             for(int i=0;i<n-1;i++)
//             {
//                 arr[i]=arr[i+1];
//             }
//             arr[n-1]=first;
//            }
//        }
//        else if(choice==2)
//        {
//            for(int r=0;r<k;r++)
//            {
//             int last=arr[n-1];
//             for(int i=n-1;i>0;i--)
//             {
//                 arr[i]=arr[i-1];
//             }
//             arr[0]=last;
//            }
//        }
//        else
//        {
//            System.out.println("Invalid Choice");
//        }


//        for(int r=0;r<n;r++)
//        {
//         System.out.println(arr[r]);
//        }
//     }
// }

// class demoa
// {
//    public static void main (String args[])
//    {
//     int arr[]={1,2,3,4,6};
//     int arr1[]={2,4,6,8};
//     int i=0,j=0;
//     int n1=arr.length;
//     int n2=arr.length;
//     while(i<n1 && j<n2)
//     {
//          if(arr[i]==arr1[j])
//          {
//             System.out.println(arr[i]);
//             i++;
//             j++;
//          }
//          else if(arr[i]<arr1[j])
//          {
//             i++;
//          }
//          else
//         {
//             j++;
//         }
//     }
//    }
// }

// class demoa
// {
//     public static void main(String args[])
//     {
//         int arr[]={1,2,3,4};
//         int arr1[]={3,4,5,6};
//         int found;
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.println(arr[i]);
//         }

//         for(int i=0;i<arr.length;i++)
//         {
//             found=0;
//             for(int j=0;j<arr.length;j++)
//             {
//                 if(arr1[i]==arr[j])
//                 {
//                     found=1;
//                     break;
//                 }
//             }
//             if(found==0)
//             {
//                 System.out.println(arr1[i]);
//             }
//         }

        
//     }
// }

// class demoa
// {
//     public static void main(String args[])
//     {
//         int arr[]={2,7,11,15};
//         int target=17;

//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=i+1;j<arr.length;j++)
//             {
//                 if(arr[i]+arr[j]==target)
//                 {
//                     System.out.println(arr[i] + " + " + arr[j] + " = " + target);
//                 }
//             }
//         }
//     }
// }

// class demoa
// {
//     public static void main(String args[])
//     {
//         int arr[]={-1,0,1,2,-1,-4};
//         int target=0;

//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=i+1;j<arr.length;j++)
//             {
//                 for(int k=j+1;k<arr.length;k++)
//                 {
//                     if(arr[i]+arr[j]+arr[k]==target)
//                     {
//                         System.out.println(arr[i]+" + "+arr[j]+" + "+arr[k]+" + "+target);
//                     }
//                 }
//             }
//         }
//     }
// }


