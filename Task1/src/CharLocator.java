import java.util.Scanner;
import java.util.ArrayList;

class CharLocator {  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Char : ");
    char character = scanner.nextLine().charAt(0);
    System.out.print("Word : ");
    String word = scanner.nextLine();
    scanner.close();
    findIndexes(character, word);
  }

  static void findIndexes(char character, String word) {
    ArrayList<Integer> indexes = new ArrayList<>();
    for (int index = word.indexOf(character);
     index >= 0;
     index = word.indexOf(character, index + 1))
    {
      indexes.add(index);
    }
    System.out.println(indexes);
  }
}