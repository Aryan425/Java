import java.io.*;
class alpha//creation of class
{   
    void main()throws IOException
{  
    BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String");
       String str=b1.readLine();//In order to input String
   
    for(char a='A';a<='z';a++)//For looping from ASCII value of A=65 to z=122
    {   int f=0; //for counting frequency
        for(int j=0;j<(str.length());j++)
        {char p=str.charAt(j);
            if(a==p)
            {f=f+1;}
        }
        if(f!=0)
        {System.out.println("Character "+a+" occured "+f+" time");
        }
    }
}
}
