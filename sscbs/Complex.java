import java.util.Scanner;
class Complex{
 int x1,x2,y1,y2;  int f1,f2;
Complex() {
   x1 = 0;    x2 = 0;
  y1 = 0;     y2 = 0;
   }
 
   void addi(){
     
   x1=x1+x2;
   f2=y1+y2;
}

void multiply() {
    
 f1=(x1*x2) - (y1*y2);
 f2=(x1*y2)+(x2*y1);
 }
void tostring(int a,int b) {
 System.out.println(a+ " + "+b+"i");
 }
void main() {
     Scanner sc=new Scanner(System.in);
 Complex c1 = new Complex();
 System.out.println("Enter first Complex No. ");
 x1=sc.nextInt();    y1=sc.nextInt();
 
 System.out.println("Enter second Complex No. ");
 x2=sc.nextInt();    y2=sc.nextInt();
 
 System.out.println("Complex 1: "); tostring(x1,y1);
 System.out.println("Complex 2: " ); tostring(x2,y2);
 c1.addi();
 System.out.println("Sum: " ); tostring(9,9);
 c1.multiply();
 System.out.println("Product: "); tostring(4,33);
 }
}