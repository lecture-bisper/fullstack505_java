public class CalculatorEx {
  public static void main(String[] args) {
    Calculator myCalcu = new Calculator();

    double result1 = myCalcu.areaRectangle(10);

    double result2 = myCalcu.areaRectangle(10, 20);

    System.out.println("정사각형의 넓이 : " + result1);
    System.out.println("직사각형의 넓이 : " + result2);

    System.out.println("\n================오버로딩 미사용================\n");

    Calculator2 cal2 = new Calculator2();
    cal2.sumInt(10, 3);
    cal2.sumIntDouble(10, 3.14);
    cal2.sumDoubleInt(10.5, 3);
    cal2.sumDouble(10.5, 3.14);

    System.out.println("\n================오버로딩 사용================\n");

    Calculator3 cal3 = new Calculator3();
    cal3.sum(10, 3);
    cal3.sum(10, 3.14);
    cal3.sum(10.5, 3);
    cal3.sum(10.5, 3.14);
  }
}
