package pack1;

public class F {
  E e1 = new E(true);
//  E(int) 생성자는 접근제한자가 default 이기 때문에 동일한 패키지에서는 사용에 제한이 없음
  E e2 = new E(1);
//  E(String) 생성자는 접근제한자가 private 이기 때문에 외부에서 해당 생성자에 접근할 수 없음, 객체 생성이 불가능함
//  E e3 = new E("문자열");
}
