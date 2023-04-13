//Que-5 Use of Static
import java.util.Scanner;
class StaticDemo {
static int a = 42,b = 99 ;

static void callme() {
System.out.println("a = " + a);
}
}

class StaticByName {

public static void main(String args[]) {
StaticDemo.callme();
System.out.println("\nb = "+StaticDemo.b);

}
}