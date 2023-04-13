import java.io.*;
class number//creation of class
{     int t=1,p=0; int max=0,min;
    int input()throws IOException//input methord
   {  
    BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number");
        int a=Integer.parseInt(b1.readLine());
        p=p+1;
        if(a<0)//variable helpi8ng to teminate when negative
        {
            t=0;
        } return a;
    }
    void main()throws IOException
    {
        while(t==1)
        { int c=input();
            if(p==1)//for taking first value as minimum
             min=c;
            if(max<c&&t==1)
            max=c;
            if(min>c&&t==1)
                min=c;
        }
                System.out.println("maximum "+max);
                System.out.println("minimum "+min);     
    }
}