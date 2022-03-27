import java.util.ArrayList;

class First extends Thread { 
  public int sum = 0;
  public int mul = 1;
  public int sub = 100;
  
  public static void main(String[] args) {
    ArrayList<Thread> threads = new ArrayList<Thread>();
    for(int i = 1; i <= 3; i++) {
      First thread = new First();
      threads.add(thread);
      thread.start();
    }
  }

  public void sum() {
    for(int x = 0; x < 10; x++) {
      sum += x;
      System.out.println(String.format("%s - Iteration %d - Value : %d", this.getName(), x+1, sum));
    }
    System.out.println(String.format("%s - Sum : %d", this.getName(), sum));
  }

  public void sub() {
    for(int x = 0; x < 10; x++) {
      sub -= x;
      System.out.println(String.format("%s - Iteration %d - Value : %d", this.getName(), x+1, sub));
    }
    System.out.println(String.format("%s - Sub : %d", this.getName(), sub));
  }

  public void mul() {
    for(int x = 1; x < 10; x++) {
      mul *= x;
      System.out.println(String.format("%s - Iteration %d - Value : %d", this.getName(), x+1, mul));
    }
    System.out.println(String.format("%s - Mul : %d", this.getName(), mul));
  }

  public void run() {
    if (this.getName().contains("0")) {
      sum();
    } else if (this.getName().contains("1")) {
      sub();
    } else {
      mul();
    }
  }
}