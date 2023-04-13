import java.io.*;
class kavita
{
    void main()throws IOException
    {
        int n;
        BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number");
        n=Integer.parseInt(b1.readLine());
        System.out.println("Enter iterations");
        int num=Integer.parseInt(b1.readLine());
        int alpha=num/5;
        System.out.println("Required number = "+(num-alpha));
       
 
    }
}