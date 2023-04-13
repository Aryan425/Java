import java.io.*;
class Num
{    
    void main()throws IOException
    {   int m,n; 
        BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("enter size of 2 D array: ");   
         m=Integer.parseInt(b1.readLine()); 
         n=Integer.parseInt(b1.readLine()); 
         int arr[][]=new int[m][n];
         System.out.println("enter elements of array: "); 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
            arr[i][j]=Integer.parseInt(b1.readLine());}}
            int sum=0;
                for(int i=0;i<m;i++){//for printing
            for(int j=0;j<n;j++){
              System.out.print(arr[i][j]+" , ");}
            System.out.println();}
            
        first:   for(int i[]:arr)
            {for(int j:i)
                {
                    if(j<0)
                    break first;
                    sum=sum+j;
                }}
                System.out.println("Sum is : "+sum);
            }
    }