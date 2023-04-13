public class ChildEx {
  public static void main(String[] args) {
    Parent p = new Parent();
    Child c = new Child();

    System.out.println("----- Parent 클래스 타입의 객체 p-----");
    p.method1();
    p.method2();

    System.out.println("----- Child 클래스 타입의 객체 c -----");
    c.method1();
    c.method2();
    c.method3();

    System.out.println("----- Parent에 Child를 대입 -----");
    p = c;
    p.method1();
//    부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 대입하면 부모 클래스 타입의 객체처럼 보이지만 실제로는 자식 클래스 타입의 객체이므로 데이터는 자식 클래스 타입의 객체가 가지고 있던 것을 그대로 가지고 있음
    p.method2();
//   부모 클래스 타입의 변수에 자식 클래스 타입의 객체를 대입하면 부모 클래스 타입의 멤버만 사용이 가능
//    p.method3();
    
  }
}
