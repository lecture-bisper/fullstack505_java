public class CheckValueEx {
  public static void main(String[] args) {
//    자바에서는 기본 데이터 타입에 대해서 더 많은 기능을 사용할 수 있도록 wapper 클래스 타입이 존재함
//    byte -> Byte, int -> Integer, double -> Double 이런 식의 클래스가 있음
//    해당 wrapper 클래스를 사용하면 추가적인 기능을 제공하는 메소드를 사용할 수 있음

    int i = 128;

    if ((i < Byte.MIN_VALUE) || (i > Byte.MAX_VALUE)) {
      System.out.println("byte 타입으로 변환할 수 없습니다.");
      System.out.println("값을 다시 확인해 주세요");
    }
    else {
      byte b = (byte) i;
      System.out.println(b);
    }

    byte b1 = 127;
    byte b2 = -128;

    System.out.println("b1 : " + b1);
    System.out.println("b2 : " + b2);

    b1++;
    b2--;

    System.out.println("b1++ 후 : " + b1);
    System.out.println("b2-- 후 : " + b2);
  }
}
