import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your height: ");
    double height = scanner.nextDouble(); 

    System.out.print("Enter your weight: ");
    double weight = scanner.nextDouble();
    scanner.close();

    double userBmi = weight/(height*height); 
    
    System.out.println("Your BMI is " + userBmi);
  }
}
