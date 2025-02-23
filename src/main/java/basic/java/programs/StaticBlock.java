package basic.java.programs;

//this is a demo to show initialisation of static variables
public class StaticBlock {
 static int a = 4;
 static int b;

 // will only run once, when the first obj is create i.e. when the class is loaded for the first time
 static {
     System.out.println("I am in static block");
     b = a * 5;
 }

 public static void main(String[] args) {
     StaticBlock obj = new StaticBlock();
     //System.out.println(obj.a + " " + obj.b); //StaticBlock.a is a static field, it should be accessed in a static way, 
     //meaning you should access it directly through the class name, not through an instance of the class
     System.out.println(StaticBlock.a + " " + StaticBlock.b);

     StaticBlock.b += 3;

     System.out.println(StaticBlock.a + " " + StaticBlock.b);

     StaticBlock obj2 = new StaticBlock();
     System.out.println(StaticBlock.a + " " + StaticBlock.b);
 }

}
