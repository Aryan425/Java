import java.util.Scanner;

  class Sum{
    
    void total(int A){
        System.out.println("Single Integer can not be added.");
    }

   void total(int A, int B)
    {
        System.out.println("Sum is : " + (A+B));
    }

    void total(int A, int B , int C){
        System.out.println("Sum is : " + (A+B+C));
    }

   void total(int A, int B , int C , int D){
        System.out.println("Sum is : " + (A+B+C+D));
    }
}
class SUMN{
  void main() {

    Sum ob1=new Sum();

      ob1.total(5);
      ob1.total(5,6);
      ob1.total(5,6,7);
      ob1.total(5,6,7,8);
      
  }}