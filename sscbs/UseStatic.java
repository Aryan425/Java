//Que-4 Use of Static
import java.util.Scanner;
class UseStatic {
static int a = 3,b;

static void meth(int x) {

System.out.println("\nx = "+x);
System.out.println("a = "+ a);
System.out.println("b = "+(11 + b));

}
static {
System.out.println("Static block initialized.");
b = a * 4;
}

void main() {
meth(42);
}}