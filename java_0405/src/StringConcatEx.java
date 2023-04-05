public class StringConcatEx {
  public static void main(String[] args) {
//    문자열과 다른 데이터 타입의 연산 시 모두 문자열로 변환되어 연산됨
    String str1 = "JDK" + 17.0;
    String str2 = str1 + " 특징";
    System.out.println(str2);

    String str3 = "JDK" + 10.0 + 7;
    String str4 = 10.0 + 7 + "JDK";
    System.out.println(str3);
    System.out.println(str4);
  }
}
