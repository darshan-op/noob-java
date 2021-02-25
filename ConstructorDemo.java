public class ConstructorDemo {
  int val;

  ConstructorDemo() {
    System.out.println("Constructor invoked");
    val = 5;
  }

  ConstructorDemo(int val) {
    System.out.println("Parameterized constructor invoked");
    this.val = val;
  }

  void showVal() {
    System.out.println("Value from constructor " + val);
  }

  public static void main(String[] args) {
    ConstructorDemo demo = new ConstructorDemo();

    demo.showVal();

    ConstructorDemo demo2 = new ConstructorDemo(7);
    demo2.showVal();

    ConstructorDemo demo3 = new ConstructorDemo();
    demo3.showVal();
  }

}