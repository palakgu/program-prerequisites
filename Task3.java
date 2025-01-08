import java.util.Scanner;
class Task3{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter  Celsius value you want to change in fahereneit scale");
float Celsius=sc.nextFloat();
float Fahrenheit;
Fahrenheit = (Celsius * 9/5) + 32;
System.out.println("Fahrenheit value:"+Fahrenheit);
}
}