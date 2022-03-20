import java.util.Scanner;

class MarioPyramid {  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number of lines : ");
    int linesNum = scanner.nextInt();
    scanner.close();
    marioPyramid(linesNum);
  }

  static void marioPyramid(int linesNum) {
    for (int i = 1; i <= linesNum; i++) {
      System.out.println(" ".repeat(linesNum - i) + "*".repeat(i));
    }
  }
}
