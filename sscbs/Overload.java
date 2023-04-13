//Que 2
import java.util.Scanner;
class Box{
    
double width,height,depth;
Box (Box ob) {
width = ob.width;
height = ob.height;
depth = ob.depth;
}
Box(double w, double h, double d) {
width = w;
height = h;
depth = d;
}

Box() {
width = -1;
height = -1;
depth = -1;
}

Box(double len) {
width = height = depth = len;
}

double volume() {
return width * height * depth;
}}

class Overload{
void main() {
Box mybox1 = new Box(18, 25, 11);
Box mybox2 = new Box();
Box mycube = new Box(9);
Box myclone = new Box(mybox1);

double vol;
vol = mybox1.volume();

System.out.println("Volume of mybox1 is "+vol);
vol = mybox2.volume();
System.out.println("\nVolume of mybox2 is vol");// get volume of cube
vol = mycube.volume();

System.out.println("Volume of cube is " + vol);
System.out.println("Volume of clone is " + vol);
}}
