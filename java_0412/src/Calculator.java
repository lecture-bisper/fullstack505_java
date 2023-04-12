public class Calculator {
  double areaCircle(double r) {
    System.out.println("Calculator 객체의 areaCircle() 실행");
    return 3.14159 * r * r;
  }

  public int sum(int x, int y) {
    System.out.println("Calculator 클래스의 sum() 메소드");
    int result = x + y;
    return result;
  }
}
