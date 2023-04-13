import java.util.Scanner;
class Bin{
    void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        byte fin, a=(byte)num;
        int i;
        i=a<<2;
        fin=(byte)(a<<2);
        System.out.println("Number multiplied by 4 using LSO: "+i);}
    }