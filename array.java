import java.util.*;

public class array 
{
    /* 
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Values:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        } 
    System.out.println("Total sum: "+sum);
  }
}


// linear search
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Numbers: ");
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.print("Target element: ");
    int target=sc.nextInt();
    System.out.print("Position ");
    int pos=sc.nextInt();
    for (int i=0;i<n;i++) 
    {
        if(arr[i]==target)
        {
            pos=i;
            break;
        }
    }
    if(pos!=-1)
    {
        System.out.println("Position is: "+pos);
    }
    else
    {
        System.out.println("Not available");
    }
  }
}


//binary search
public static void main(String[] args) 
 {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++) 
    {
        arr[i]=sc.nextInt();
    }
    int target=sc.nextInt();
    int min=0;
    int max=arr.length-1;
    int res=-1;
    while(min<=max)
    {
        int mid=(min+max)/2;
        if(arr[mid]==target)
        {
                res=mid;
                break;
        }
          if(arr[mid]>target)
           {
               max=mid-1;
           }
          else
           {
            min=mid+1;
           }
        }
        if(res!=-1)
        {
            System.out.println("AVAILABLE:"+res);
        }
        else
        {
            System.out.println("Not available");
        }
    }
}



//merging two arrrayss
public static void main(String[] args) 
 {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr1=new int[n];
    int[] arr2=new int[n];
    int a1=arr1.length;
    int b1=arr2.length;
    int c=a1+b1;
    int c1[]=new int[c];
    for(int i=0;i<n;i++)
    {
        arr1[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        arr2[i]=sc.nextInt();
    }
    System.arraycopy(arr1,0,c1,0,a1);
    System.arraycopy(arr2, 0, c1,a1,b1);

    System.out.print("" + Arrays.toString(c1));
 }
}


public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr1=new int[n];
    int[] arr2=new int[n];
    int[] arr3=new int[n];
    int a1=arr1.length;
    int a2=arr2.length;
    for(int i=0;i<n;i++)
    {
        arr1[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
         arr2[i]=sc.nextInt();
    }
    int k=0;
    for(int i=0;i<arr1.length;i++)
    {
        arr3[i]=arr1[k];
        k++;
    }
    for(int i=arr1.length;i<arr3.length;i++)
    {
        arr3[i]=arr2[k];
        k++;
    }
    for(int i=0;i<arr1.length;i++)
    {
        System.out.println(arr3[i]);
    }
 }
}



//bubble sort
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr1=new int[n];
    for(int i=0;i<n;i++)  
    {
        arr1[i]=sc.nextInt();
    }
    int temp=0;
    for(int i=0;i<n;i++)  
    {
        for(int j=i+1;j<n;j++)
        {
            if(arr1[i]>arr1[j])
            {
                temp=arr1[i];
                arr1[i]=arr1[j];
                arr1[j]=temp;
            }
        }
    }
    System.out.println(Arrays.toString(arr1));
 }
}

*/
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr1=new int[n];
    for(int i=0;i<n;i++)  
    {
        arr1[i]=sc.nextInt();
    }
    int temp=0;
    for(int i=0;i<n;i++)  
    {
        for(int j=0;j<n-1-i;j++)
        {
            if(arr1[i]>arr1[j])
            {
                temp=arr1[i];
                arr1[i]=arr1[j];
                arr1[j]=temp;
            }
        }
    }
    System.out.println(Arrays.toString(arr1));
    System.out.println();
 }
}
