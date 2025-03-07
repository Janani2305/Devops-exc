//digri competetive programming
//1
/* 
import java.util.*;
public class one{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int[] arr=new int[n];
        int[] ar=new int[a];
        for (int i=0;i<n;i++)
        {
              arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
               ar[i]=sc.nextInt();
        }
        int res[]=new int[n+a];
        /* 
        System.arraycopy(arr,0, res, 0, n);
        System.arraycopy(ar, 0, res, n,a);
        System.out.println(Arrays.toString(res));
        
        for(int i=0;i<n;i++)
        {
            res[i]=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            res[i+n]=ar[i];
        }
        String fina=Arrays.toString(res);
    }
}


//2
import java.util.Scanner;
public class one{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] ans=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            ans[i]=arr[arr[i]];
            System.out.print(ans[i]+" ");
        }
     }
}

//3->wrong
import java.util.Scanner;

public class one{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int add=0;
        int multiply=1;
        for(int i=0;i<m;i++)
        {
            switch(i) 
            {
                case 1:
                    int a=sc.nextInt();
                    add=m+a;
                    break;
                case 2:
                    int b=sc.nextInt();
                    multiply=add*n;
                    break;
            }
        }
        System.out.println(multiply);
    }
}


/* 
//
import java.util.Scanner;
public class one{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(a+" ");
                int temp=a+b;
                a=b;
                b=temp;
            }
            System.out.println();
        }
    }
}



//monk code 

import java.util.Scanner;

class one{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) 
        {
            arr[i] = sc.next();  
        }
        for (int i = 0; i < N; i++) 
        {
            int count= 0;
            for (int j = 0; j < i; j++) 
            {
                if (arr[j].compareTo(arr[i]) < 0)
                {  
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}

//leet code 984
import java.util.*;
public class one{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        char a='a';
        char b='b';
        int temp;
        String res="";
        if(A<B)
        {
            temp=A;
            A=B;
            B=temp;
            a='b';
            b='a';
        }
        while(A>0){
            if(A>0)
            {
                res+='a';
                A--;
            }
            if(A>0||A>B)
            {
                res+='a';
                A--;
            }
            if(B>0)
            {
                res+='b';
                B--;
            }
            if(B>0 || B>A)
            {
                res+='b';
                B--;
            }
        }
        System.out.println(res);
    }
}
 */

 import java.util.*;
 public class one{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String start=sc.nextLine();
        String end=sc.nextLine();
        //int res=Solution(String start,String end);
    }
 }

 