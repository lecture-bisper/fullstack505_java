public class StringEqualsEx {
  public static void main(String[] args) {
    String str1 = new String("자바");
    String str2 = new String("자바");

    int iVal1 = 100;
    int iVal2 = 100;

    if (iVal1 == iVal2) {
      System.out.println("두 변수는 같다.");
    }
    else {
      System.out.println("두 변수는 다르다.");
    }

    System.out.println("\n ----- 문자열 타입의 비교연산 ----- \n");

    System.out.println("원본 문자열 변수 str1 : " + str1);
    System.out.println("원본 문자열 변수 str2 : " + str2);

    if (str1 == str2) {
      System.out.println("두 변수는 같다.");
    }
    else {
      System.out.println("두 변수는 다르다.");
    }

    System.out.println("\n\n");

//    자바의 String 클래스 타입의 경우 동일한 문자열을 사용한 String 타입의 변수를 기본 데이터 타입처럼 선언할 경우 메모리상에 문자열을 1개만 생성하고 각각의 변수에 1개 생성한 메모리 주소를 저장함
//    자바의 String 클래스 타입의 변수를 선언 시 new 키워드를 사용하면 동일한 문자열로 생성해도 메모리에 객체를 여러개 생성함
    String str3 = "자바";
    String str4;
    str4 = "자바";

    System.out.println("원본 문자열 str3 : " + str3);
    System.out.println("원본 문자열 str4 : " + str4);
    
    if (str3 == str4) {
      System.out.println("두 변수는 같다.");
    }
    else {
      System.out.println("두 변수는 다르다.");
    }

    if (str1 == str3) {
      System.out.println("str1, str3 두 변수는 같다.");
    }
    else {
      System.out.println("str1, str3 두 변수는 다르다.");
    }

//    String 클래스의 equals() 메소드를 사용하면 해당 문자열이 같은지 다른지 확인할 수 있음
    if (str1.equals(str3)) {
      System.out.println("str1, str3의 문자열은 같다");
    }
    else {
      System.out.println("str1, str3의 문자열은 다르다.");
    }

    System.out.println("\n\n");

    str1 = null;
//    iVal1 = null; // null은 참조 타입의 변수에만 사용할 수 있음

    str1.toString();

  }
}










