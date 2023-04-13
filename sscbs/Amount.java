import java.io.*;
class Amount//creation of class
{     int quan; double pri,dis,tax,total,net;
    void input()throws IOException//input methord
   {  
    BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter quantity and price");
        quan=Integer.parseInt(b1.readLine());
        pri=Double.parseDouble(b1.readLine());
        System.out.println("Enter discount and tax");
      dis=Double.parseDouble(b1.readLine());
       tax=Double.parseDouble(b1.readLine());  net=((quan*pri)*((100+tax)/100)); total=net*((100-dis)/100);
    }
  void main()throws IOException
  { Amount b=new Amount();
      b.input();
       System.out.println("Enter quantity of item sold : "+quan);
        System.out.println("Enter Price of item : "+pri);
         System.out.println("Enter Discount : "+dis);
          System.out.println("Enter tax : "+tax);
           System.out.println("****************BILL***************");
            System.out.println("Quantity sold : "+quan);
             System.out.println("Price per item : "+pri);
              System.out.println("Amount : "+(quan*pri));
               System.out.println("Discount : "+dis);
                System.out.println("Discount Amount :"+(net-total));
              System.out.println("tax : "+net);
              System.out.println("Amount to be paid : "+total);
            }
        }
              
              
         
      
