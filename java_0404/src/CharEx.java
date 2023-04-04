public class CharEx {
  public static void main(String[] args) {
//    JS에서는 문자 타입과 문자열 타입을 구분하지 않음
//    JS에서는 '' 이나 "" 를 동일하게 문자열을 표현하는데 사용함
//    JAVA에서는 문자 타입과 문자열 타입을 구분함
//    JAVA에서 문자 타입은 기본 데이터 타입이며, 정수 타입이고, 문자열 타입은 참조 타입이며 String 클래스 타입임
//    JAVA에서 문자 타입은 문자 1개를 저장하고, '' 를 사용하여 표현함
//    JAVA에서 문자열 타입은 문자 여러개를 동시에 저장하고, "" 를 사용하여 표현함
//    'A'와 "A" 는 자바에서는 서로 다른 데이터 타입임

    char c1 = 'A'; // char 문자 타입, 문자를 직접 입력
    char c2 = 65; // char 타입에 숫자 65를 저장
    char c3 = '\u0041'; // 유니코드표를 사용하여 0041을 저장

    char c4 = '가'; // char 타입의 변수에 문자 '가'를 직접 저장
    char c5 = 44032; // char 타입의 변수에 10진수 정수 44032를 저장
    char c6 = '\uac00'; // char 타입의 변수에 유니코드 ac00을 저장

    int uniCode = c1; // 문자 타입의 데이터 'A'를 정수 타입인 int 타입의 변수에 저장 시 10진수 정수값이 저장됨

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);
    System.out.println(c6);
    System.out.println(uniCode);
  }
}
