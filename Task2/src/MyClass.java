interface A {
    public void meth1();
    public void meth2();
}
  
class MyClass implements A{
    public void meth1() {
      System.out.println("Inside meth1");
    }
  
    public void meth2() {
      System.out.println("Inside meth2");
    }
}
