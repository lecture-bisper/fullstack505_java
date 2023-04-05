public class PromotionEx {
  public static void main(String[] args) {
//    자동타입변환 사용
    byte byteValue = 10;
    int intValue = byteValue;
    System.out.println(intValue);

    char charValue = '가';
    intValue = charValue;
    System.out.println("'가'의 유니코드 : " + intValue);

    intValue = 500;
    long longValue = intValue;
    System.out.println(longValue);

    intValue = 200;
    double doubleValue = intValue;
    System.out.println(doubleValue);
  }
}
