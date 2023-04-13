import java.io.*;
class Hello
{
    void main()throws IOException
    { BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("enter size  ");   
        int n=Integer.parseInt(b1.readLine());
               for(int i=0; i<n;i++)
               {
                   for (int j=n-i;j>1;j--){
                       System.out.print(" ");
                   }
                   for(int j=0;j<=i;j++){
                       System.out.print("* ");
                   }
                    System.out.println();
               }
            }
       

    }
