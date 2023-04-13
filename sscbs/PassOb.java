//Que 1
import java.util.Scanner;
class Tst {
int a, b;

Tst(int i, int j) {
a=i;
b = j;
}
boolean equals(Tst o) {

if(o.a == a && o.b==b) 
return true; 
else 
return false;
}}
class PassOb {
void main() {
Tst ob1 = new Tst(100, 22);
Tst ob2 = new Tst(100, 22);
Tst ob3 = new Tst(-1, -1);

System.out.println("ob1 ob2: = "+ob1.equals(ob2));

System.out.println("\nob1 == ob3: "+ob1.equals(ob3));
}}