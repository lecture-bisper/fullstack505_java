public class PromotionEx {
  public static void main(String[] args) {
    B b = new B();
    C c = new C();
    D d = new D();
    E e = new E();

//    A클래스와 B 클래스는 상속 관계이기 때문에 자동 타입 변환됨
    A a1 = b;
//    A클래스와 C 클래스는 상속 관계이기 때문에 자동 타입 변환됨
    A a2 = c;
//    A클래스와 D 클래스는 상속 관계이기 때문에 자동 타입 변환됨
    A a3 = d;
//    A클래스와 E 클래스는 상속 관계이기 때문에 자동 타입 변환됨
    A a4 = e;

//    B클래스와 D 클래스는 상속 관계이기 때문에 자동 타입 변환됨
    B b1 = d;
//    C클래스와 E 클래스는 상속 관계이기 때문에 자동 타입 변환됨
    C c1 = e;

//    B 클래스와 E 클래스는 상속관계가 아니기 때문에 자동 타입변환이 발생하지 않음
//    B b2 = e;
//    C 클래스와 D 클래스는 상속관계가 아니기 때문에 자동 타입 변환이 발생하지 않음
//    C c2 = d;
  }
}
