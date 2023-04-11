package pack1;

public class E {
  E e1 = new E(true);
  E e2 = new E(1);
  E e3 = new E("문자열");

//  접근 제한자를 public 으로 지정한 생성자
  public E(boolean b) {

  }

//  접근 제한자를 default 로 지정한 생성자
  E(int e) {

  }

//  접근 제한자를 private으로 지정한 생성자
  private E(String e) {

  }
}
