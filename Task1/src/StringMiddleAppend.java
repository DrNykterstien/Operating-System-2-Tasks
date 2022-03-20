import java.util.Scanner;

class StringMiddleAppend {  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input : ");
    StringBuffer input = new StringBuffer(scanner.nextLine());
    System.out.print("Appended Part : ");
    String appendedPart = scanner.nextLine();
    scanner.close();
    System.out.println(input.insert(Math.round(input.length() / 2),appendedPart));
  }
}