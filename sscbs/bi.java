import java.util.Scanner;
class bi{
    void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        String bin="";
      while(num> 0){    
         String t=String.valueOf(num%2);
       bin=bin+t;  
       num = num/2;    
     }
             System.out.println(" Binary Number  "+bin);
             int one=0,zero;   bin.trim();
             for(int j=0;j<bin.length();j++){
                 if(bin.charAt(j)=='1')
                 one++;
             }  zero=bin.length()-one;
               System.out.println(" No. of 1's in binary eq. = "+one); 
               System.out.println(" No. of 0's in binary eq. = "+zero);
    }
}