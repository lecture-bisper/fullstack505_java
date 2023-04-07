public class CalculatorEx {
  public static void main(String[] args) {
    Calculator cal = new Calculator();
    cal.sum();
    cal.sub();

    Calculator cal2 = new Calculator(100, 3);
    cal2.sum();
    cal2.sub();

    cal.sum();
    cal2.sum();
  }
}
