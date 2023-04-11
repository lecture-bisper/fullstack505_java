package pack2;

//다른 패키지에 있는 클래스 E를 import로 가져옴
import pack1.E;

public class G {
//  E(boolean) 생성자는 접근제한자를 public으로 설정하여 접근에 제한이 없음
  E e1 = new E(true);
//  E(int) 생성자는 접근제한자를 default로 설정하여 다른 패키지에서 접근이 불가능함
//  E e2 = new E(1);
//  E(String) 생성자는 접근제한자를 private 으로 설정되어 있어 클래스 외부에서 접근이 불가능함
//  E e3 = new E("문자열");
}
