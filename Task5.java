import java.util.*;
 class Task5{
public static void main(String[] args){
System.out.println("Enter the radious and height of the cylinder");
Scanner sc = new Scanner(System.in);
double r = sc.nextDouble();
double h = sc.nextDouble();
double volume;
System.out.println("Volume of the cylinder");
volume = 3.14*r*r*h;
System.out.println(volume);

}

}