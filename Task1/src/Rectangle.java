
public class Rectangle {
    float length, width;
    
    public Rectangle(float length, float width) {
      this.length = length;
      this.width = width;
    }
  
    public float area() {
      return length * width;
    }
  
    public static void main(String[] args) {
      Rectangle rectangle = new Rectangle(10, 5);
      System.out.println(rectangle.area());
    }
  }
