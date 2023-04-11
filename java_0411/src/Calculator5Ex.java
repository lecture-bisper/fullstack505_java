public class Calculator5Ex {
  public static void main(String[] args) {
    Calculator5 c1 = new Calculator5();
    Calculator5 c2 = new Calculator5();

    c1.sum();
    c2.sum();

    c1.setNumber(100, 200);
    c2.setNumber(1000, 2000);

    c1.sum();
    c2.sum();

    System.out.println("-----");

    c1.staticSum();
    c2.staticSum();

    c1.setStaticNumber(100, 200);
    c2.setStaticNumber(1000, 2000);

    c1.staticSum();
    c2.staticSum();

    System.out.println("----------인스턴스 멤버-----------");

    System.out.println("c1의 num1 : " + c1.num1);
    System.out.println("c1의 num2 : " + c1.num2);
    System.out.println("c2의 num1 : " + c2.num1);
    System.out.println("c2의 num2 : " + c2.num2);

    c1.num1 = 10;
    c1.num2 = 20;
    c2.num1 = 10000;
    c2.num2 = 20000;

    System.out.println("c1의 num1 : " + c1.num1);
    System.out.println("c1의 num2 : " + c1.num2);
    System.out.println("c2의 num1 : " + c2.num1);
    System.out.println("c2의 num2 : " + c2.num2);

    System.out.println("----------정적 멤버-----------");

    System.out.println("c1의 staticNum1 : " + c1.staticNum1);
    System.out.println("c1의 staticNum2 : " + c1.staticNum2);
    System.out.println("c2의 staticNum1 : " + c2.staticNum1);
    System.out.println("c2의 staticNum2 : " + c2.staticNum2);

    c1.staticNum1 = 10;
    c1.staticNum2 = 20;
    c2.staticNum1 = 10000;
    c2.staticNum2 = 20000;

    System.out.println("c1의 staticNum1 : " + c1.staticNum1);
    System.out.println("c1의 staticNum2 : " + c1.staticNum2);
    System.out.println("c2의 staticNum1 : " + c2.staticNum1);
    System.out.println("c2의 staticNum2 : " + c2.staticNum2);

    Calculator5.staticNum1 = 100;
    Calculator5.staticNum2 = 200;

    System.out.println("c1의 staticNum1 : " + c1.staticNum1);
    System.out.println("c1의 staticNum2 : " + c1.staticNum2);
    System.out.println("c2의 staticNum1 : " + c2.staticNum1);
    System.out.println("c2의 staticNum2 : " + c2.staticNum2);


  }
}
