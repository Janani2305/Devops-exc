
/*public class hello
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String Name1 = new String("Janani");
        String Name2 = new String("Jaan");
        if(Name1.equals(Name2))
        {
            System.out.println("equals"); 
        }
        else{
            System.out.println("not equal");
        }
       // System.out.println("My age is "+ Age);
       
       int a= scan.nextInt();
        for(int i=0;i<10;i--)
        {
            System.out.println(i);
        }
       }
}



 int a = scan.nextInt();
 switch(a)
    {
        case 1:
        System.out.println("Monday");
        break;
        case 2:
        System.out.println("tuesday");
        break;
        case 3:
        System.out.println("wednesday");  
        break;    
      default:
      {
        System.out.println("enter valid number");
       }
   }
  }
}

public class hello
{
public static void main(String[ ] args)
  {
    Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
for(int i=0;i<n;i++)
   {
    System.out.println("Janani");
   }
  }
}

 
public class hello
{
    public static void main(String[] args) 
    {
        int i=1;
        do
        {
           System.out.println("janani");
        }while(i<2);
    }
}


/* 
//1D array

public class hello
{
public static void main(String[] args)
    {
        //int[] arr = {1,2,3,4,5};
        //char[] ch = {'a','b','c','d'};
        //for(int i=0;i<ch.length;i++)
        //{
          //  System.out.println(ch[1]);
        //}
          
         

    }
}



//passing arrays->methods
public class hello
{
   public static void main(String[] args) 
   {
       int[] num = {0,1};
       change(num);
       PrintArray(num);
   }

   public static void change(int[] num)
   {
         num[0]=1;
         num[1]=0;
   }
   public static void PrintArray( int[] num)
   {
       for(int i=0;i<num.length;i++)
       {
        System.out.println(num[i]+"");
       }
   }
}


//binary search
public class hello
{
    public static void main(String[] args) 
    {
        int[] a = {1,6,3,9,2,4,8,5};
        Arrays.sort(a);

        System.out.println(Arrays.binarySearch(a,5));
    }
}


import java.util.Scanner;
public class hello{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row:");
        int m=sc.nextInt();
        System.out.println("enter col:");
        int n=sc.nextInt();
         int[][] num=new int[m][n];
         System.out.println("enter elements:");
         for(int i=0;i<m;i++)
         {
            for(int j=0;j<n;j++)
            {
                num[i][j]=sc.nextInt();
            }
         }
         System.out.println("elements of array are:");
         for(int i=0;i<m;i++)
         {
            for(int j=0;j<n;j++)
            {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
         }
        
    }
}

/* 
public class hello{
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=4;i++)
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


public class hello{
    public static void main(String[] args) 
    {
        for(int i=5;i>0;i--)
        {
            for(int j=0;j<5-i;j++)
            {
                System.out.print("  ");
            }
            for(int k=0;k<i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class hello{
    public static void main(String[] args) 
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=5;i>0;i--)
        {
            for(int j=0;j<5-i;j++)
            {
                System.out.print("  ");
            }
            for(int k=0;k<i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class hello{
    public static void main(String[] args) 
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
public class hello{
    public static void main(String[] args) 
    {
        int num=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=4;j>=i;j--)
            { 
               System.out.print(num);
            }
            System.out.println();
        }
    }
}


public class hello{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}


public class hello
{
    public static void main(String[] args) {
        int n = 4, num= 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}


//x
public class hello{
    public static void main(String[] args) 
    {
        int n=10;
       for( int i=1;i<=n;i++)
       {
        for(int j=1;j<=n;j++)
        {
            if(i==j||i+j==11)
            {
               System.out.print("X");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
       }
    }
}


//number pattern
public class hello{
    public static void main(String[] args) 
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" "+i);
            }
            System.out.println();
        }
    }
}


/*
public class hello{
    public static void main(String[] args) 
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}

 //number add
    public class hello{
        public static void main(String[] args) 
        {
            int num=1;
            for(int i=1;i<=5;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(" "+num);
                    num++;
                }
                System.out.println();
            }
        }
    }
 
/*
        public class hello{
            public static void main(String[] args) 
            {
                int num=1;
                for(int i=1;i<=5;i++)
                {
                    for(int j=5;j>=i;j--)
                    {
                        System.out.print(" ");
                    }
                    for(int k=1;k<=i;k++,num++)
                    {
                          System.out.print(num+" ");
                    }
                    System.out.println();
                }
            }
        }
          


        

    

        public class hello{
            public static void main(String[] args) {
                char ch='A';
                for(int i=1;i<=5;i++)
                {
                    ch='A';
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(ch+" ");
                        ch++;
                    }
                    System.out.println();
                       
                }
            }
        }

        
        

///string
//reverse the letters in string
import java.util.Scanner;
public class hello{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        //String str="Welcome To Home";
        String [] strArray= str.split(" ");
       int count=0;
        for(String temp:strArray)
        {
            //System.out.println(temp);
            count++;
        }
        for(int i=0;i<count;i++)
        {
            char[] s1= strArray[i].toCharArray();
            for(int j=s1.length-1;j>=0;j--)
            {
                System.out.print(s1[j]);
            }
            System.out.print(" ");
        }
    }
}




import java.util.Scanner;
public class hello{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String uprcase=" ";
        Scanner strscan=new Scanner(str);
        while(strscan.hasNext())
        {
            String word=strscan.next();
            uprcase += Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
        }
        //System.out.println(str);
        System.out.println(uprcase.trim());
    }
}

//leetcode longest common prefix
import java.util.Arrays;
class hello{
    public static String longestCommonPrefix(String[] strs) 
    {
        if (strs == null || strs.length == 0)
        {
            return " ";
        }
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length -1];
        int i = 0;
        while (i < first.length() && i<last.length() && first.charAt(i)==last.charAt(i)) 
        {
            i++;   
        }
        first=first.substring(0,i);
        return first;
    }   
    public static void main(String[] args) 
    {
        String[] strs={"float","flower","flow"};
        System.out.println(longestCommonPrefix(strs));
    }
}


class hello{
    public int strStr(String haystack, String needle){
        if(needle.isEmpty())
        {
            return 0;
        }
        return haystack.indexOf(needle);
        /* 
        int hay=haystack.length();
        int need=needle.length();
        for(int i=0;i<=hay-need;i++){
            if(haystack.needle(i,i + need).equals(needle)){
                return i;
            }
        }return -1;
        
    }
}

class hello{
    public int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[128];
        for (int i = 0; i < 128; i++) {
            lastIndex[i] = -1;
        }

        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            if (lastIndex[currentChar] >= start) {
                start = lastIndex[currentChar] + 1;
            }

            lastIndex[currentChar] = end; 
            maxLength = Math.max(maxLength, end - start + 1); 
        }
        return maxLength;
    }
}



public class hello{
    public static void main(String[] args) 
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}



public class hello{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
         }
     }
}


public class hello{
public static void main(String[] args)
 {
    int num=1;
    for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
   

    public class hello{
        public static void main(String[] args) {
            char ch='A';
            for(int i=1;i<=5;i++)
            {
                ch='A';
                for(int j=1;j<=i;j++)
                {
                    System.out.print(ch+" ");
                    ch++;
                }
                System.out.println();
                   
            }
        }
    }

 */
//pyramid continuous abcdedcba pattern

 import java.util.*;
 public class hello{
     public static void main(String[] args) 
     {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         for(int i=1;i<=n;i++)
         {
             for(int j=i;j<n;j++)
             {
                 System.out.print("  ");
             }
         char ch='A';
         for(int k=1;k<i;k++)
         {
             System.out.print(ch);
             ch++;
         }
        System.out.print(ch);
        for(int k=i-1;k>0;k--)
        {
         ch--;
         System.out.print(ch);
        }
         System.out.println();
       }
    }
 }
 
 