public class ByteEx {
  public static void main(String[] args) {
    byte var1 = -128;
    byte var2 = 127;
    byte var3 = 0;
    byte var4 = 30;
    byte var5 = -30;

    // byte 타입이 최소 -128 ~ 최대 127까지 저장 가능
    // byte 타입이 저장할 수 있는 최대값을 넘어서 오류가 발생함
//    byte var6 = 128;

    System.out.println(var1);
    System.out.println(var2);
    System.out.println(var3);
    System.out.println(var4);
    System.out.println(var5);
  }
}
