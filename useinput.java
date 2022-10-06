import java.util.Scanner;
public class useinput{
    public static void main(String[] args){
     System.out.println("taking input from user");
     Scanner sc= new Scanner(System.in);
     System.out.println("enter the first number");
     float a= sc.nextFloat();
     System.out.println("enter the second number");
     float b= sc.nextFloat();
     float sum = a+b;

     System.out.println("the sum of all this number is");

     System.out.print(sum);
     
    }
}