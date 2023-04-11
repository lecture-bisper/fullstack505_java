public class Calculator5 {
  public int num1 = 10;
  public int num2 = 20;
  public int result = 0;
  public static int staticNum1 = 10;
  public static int staticNum2 = 20;
  public static int staticResult = 0;

  public void sum() {
    result = num1 + num2;
    System.out.println("두 수의 덧셈은 " + result + "입니다.");
  }

  public void setNumber(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
    this.result = 0;
  }
  public static void staticSum() {
    staticResult = staticNum1 + staticNum2;
    System.out.println("두 수의 덧셈은 " + staticResult + "입니다.");
  }

  public static void setStaticNumber(int staticNum1, int staticNum2) {
    Calculator5.staticNum1 = staticNum1;
    Calculator5.staticNum2 = staticNum2;
    Calculator5.staticResult = 0;
  }
}
