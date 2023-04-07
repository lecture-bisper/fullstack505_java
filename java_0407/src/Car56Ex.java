public class Car56Ex {

  public static void main(String[] args) {
    Car5 c51 = new Car5();
    System.out.println("차종 : " + c51.model);
    System.out.println("색상 : " + c51.color);
    System.out.println("가격 : " + c51.price);

    System.out.println();

    Car5 c52 = new Car5("코란도");
    System.out.println("차종 : " + c52.model);
    System.out.println("색상 : " + c52.color);
    System.out.println("가격 : " + c52.price);

    System.out.println();

    Car5 c53 = new Car5("티볼리", "검정");
    System.out.println("차종 : " + c53.model);
    System.out.println("색상 : " + c53.color);
    System.out.println("가격 : " + c53.price);

    System.out.println();

    Car5 c54 = new Car5("엑티언", "흰색", "4000");
    System.out.println("차종 : " + c54.model);
    System.out.println("색상 : " + c54.color);
    System.out.println("가격 : " + c54.price);

    System.out.println("\n ----- this() 사용 ----- \n");

    Car6 c61 = new Car6();
    System.out.println("차종 : " + c61.model);
    System.out.println("색상 : " + c61.color);
    System.out.println("가격 : " + c61.price);

    System.out.println();

    Car6 c62 = new Car6("코란도");
    System.out.println("차종 : " + c62.model);
    System.out.println("색상 : " + c62.color);
    System.out.println("가격 : " + c62.price);

    System.out.println();

    Car6 c63 = new Car6("티볼리", "검정");
    System.out.println("차종 : " + c63.model);
    System.out.println("색상 : " + c63.color);
    System.out.println("가격 : " + c63.price);

    System.out.println();

    Car6 c64 = new Car6("엑티언", "흰색", "4000");
    System.out.println("차종 : " + c64.model);
    System.out.println("색상 : " + c64.color);
    System.out.println("가격 : " + c64.price);
  }
}










