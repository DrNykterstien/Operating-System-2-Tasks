import java.util.Scanner;

class RemoveVowels {  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input : ");
    String input = scanner.nextLine();
    scanner.close();
    System.out.println("Output : " + input.replaceAll("[aeiou]", ""));
  }
}