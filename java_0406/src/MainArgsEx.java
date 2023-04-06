public class MainArgsEx {
  public static void main(String[] args) {
//    메인 메소드의 매개변수인 args를 사용하면 프로그램 실행 시 추가적인 기능이나 데이터를 사용할 수 있음
//    사용법 :
//    java 파일명 args데이터1 args데이터2

    if (args.length != 2) {
      System.out.println("use program ");
      System.out.println("java MainArgsEx num1 num2");
      System.exit(0);
    }

    String strNum1 = args[0];
    String strNum2 = args[1];

    int num1 = Integer.parseInt(strNum1);
    int num2 = Integer.parseInt(strNum2);

    int result = num1 + num2;
    System.out.println(num1 + " + " + num2 + " = " + result);
  }
}
