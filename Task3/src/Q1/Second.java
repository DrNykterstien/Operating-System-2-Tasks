
class Second { 
    public int sum = 0;
    public int mul = 1;
    public int sub = 100;
    
    public static void main(String[] args) {
      Second obj = new Second();
      Thread sumThread = new Thread(() -> {
        obj.sum();
      });
      Thread subThread = new Thread(() -> {
        obj.sub();
      });
      Thread mulThread = new Thread(() -> {
        obj.mul();
      });
      
      sumThread.start();
      subThread.start();
      mulThread.start();
    }
  
    public void sum() {
      for(int x = 0; x < 10; x++) {
        sum += x;
        System.out.println(String.format("%s - Iteration %d - Value : %d", Thread.currentThread().getName(), x+1, sum));
      }
      System.out.println(String.format("%s - Sum : %d", Thread.currentThread().getName(), sum));
    }
  
    public void sub() {
      for(int x = 0; x < 10; x++) {
        sub -= x;
        System.out.println(String.format("%s - Iteration %d - Value : %d", Thread.currentThread().getName(), x+1, sub));
      }
      System.out.println(String.format("%s - Sub : %d", Thread.currentThread().getName(), sub));
    }
  
    public void mul() {
      for(int x = 1; x < 10; x++) {
        mul *= x;
        System.out.println(String.format("%s - Iteration %d - Value : %d", Thread.currentThread().getName(), x+1, mul));
      }
      System.out.println(String.format("%s - Mul : %d", Thread.currentThread().getName(), mul));
    }
  }