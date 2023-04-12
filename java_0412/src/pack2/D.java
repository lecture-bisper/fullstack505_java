package pack2;

import pack1.A;

public class D extends A {
  public D() {
    // 부모 객체의 생성자 호출, D 클래스의 부모인 A 클래스의 생성자호출
    super();
//    부모 객체의 field, method()를 상속받아 사용
    this.field = "value";
    this.method();
  }
}
