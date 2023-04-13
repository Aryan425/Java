//Que 3
import java.util.Scanner;
class Tst {
  int a;
Tst(int i) {
a = i;
}

Tst incrByTen() { 
    Tst temp = new Tst(a+10);
     return temp;
}}
class Retob {
void main() {
Tst ob1 = new Tst(4);
Tst ob2;
ob2 = ob1.incrByTen();
System.out.println("ob1.a: " + ob1.a);
System.out.println("\nob2.a: "+ob2.a);

ob2 = ob2.incrByTen();

System.out.println("ob2.a after second increase: "+ob2.a);  
}
}
