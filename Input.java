import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        float age = sc.nextFloat();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        
        
    }
}
