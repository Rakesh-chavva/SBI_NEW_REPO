```java
import java.util.Scanner;

public class FrontEndDeveloperDemo {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  System.out.print("Enter your name: ");
  String name = scanner.nextLine();

  String greeting = "Hello, " + name + "!";
  System.out.println(greeting);

  String[] colors = {"Red", "Green", "Blue", "Yellow", "Orange"};
  System.out.println("My favorite colors are:");
  for (String color : colors) {
   System.out.println("- " + color);
  }

  System.out.print("Enter your age: ");
  int age = scanner.nextInt();
  if (age >= 18) {
   System.out.println("You are an adult.");
  } else {
   System.out.println("You are a minor.");
  }
 }
}
