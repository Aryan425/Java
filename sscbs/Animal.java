import java.util.Scanner;
class Animals
{
   void sound(){
        System.out.println(" I'm animal ");
    }
    
    }
class Dog extends Animals{
void sound(){
        System.out.println(" Bhou Bhou");
    }
}
class Cat extends Animals{
    void sound(){
        System.out.println(" Meau ");
    }
}
class Horse extends Animals{
    void sound(){
        System.out.println(" Hine Hine");
    }
}
class Sparrow extends Animals{
    
    void beaklen(){
        System.out.println("I am Sparrow");

    }
    void sound(){
        System.out.println(" chirp chirp ");
    }
    String p=" hello ";
}
class Animal
{
    public static void main(String args[]){
        Animals a=new Animals();
        Dog b=new Dog();
        Cat c=new Cat();
        Horse d=new Horse();
        Sparrow e=new Sparrow();
        Animals reff;
        reff=a;
        reff.sound();
        reff=b;
        reff.sound();
        reff=c;
        reff.sound();
        reff=d;
        reff.sound();
        reff=e;
        reff.beaklen();
        reff=a;
        reff.beaklen();
}}