package pack2;

// pack2 패키지에는 A 클래스가 없기 때문에 pack1 패키지에서 A 클래스를 import하여 가져옴
import pack1.A;
// pack2 패키지에는 B 클래스가 없기 때문에 pack1 패키지에서 B클래스를 import하여 가져오려고 했으나 클래스 B는 접근제한자가 default 이므로 패키지 외부에서 접근이 불가능함
//import pack1.B;

public class D {
//  pack1 패키지에 있는 클래스 A를 사용하여 객체 생성
  A a = new A();
//  B 클래스가 default 접근제한자를 사용하여 외부 패키지에서 해당 클래스를 사용할 수 없음
//  B b = new B();
}
