public class Hello {
//  메소드( 자바스크립트의 함수와 동일한 기능을 가지고 있음)
//  클래스의 멤버인 함수를 메소드라고 함
//  클래스의 멤버가 아닐 경우 함수라고 함
  public static int sum(int n, int m) {
    return n + m;
  }

//  자바 프로그램의 시작점(main())
  public static void main(String[] args) {
    int i = 20;
    int s;
    char a;

    s = sum(i, 10);
    a = '?';

    System.out.println(a);
    System.out.println("Hello");
    System.out.println(s);
  }
}
