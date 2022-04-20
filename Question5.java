import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner scanner = new Scanner(System.in);
    int numberofEntries = scanner.nextInt();

    int[] numbersEntered = new int[numberofEntries];

    for (int i = 0; i < numberofEntries; i++){
      int randomNumber = scanner.nextInt();
      numbersEntered[i] = randomNumber;
    }

    int maxCount = 0;
    int maxValue = 0;

    for (int j= 0; j < numberofEntries; ++j){
      int count = 0;
      for (int x = 0; x < numberofEntries; ++x){
        if (numbersEntered[j] == numbersEntered[x]){
          ++count;
        }
      }
      if (count > maxCount){
        maxCount = count;
        maxValue = numbersEntered[j];
      }
    }
    
    scanner.close();

    System.out.println(maxValue);
  }
}
