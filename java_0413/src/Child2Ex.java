public class Child2Ex {
  public static void main(String[] args) {
    System.out.println("----- Parent2 클래스 타입의 객체 -----");
    Parent2 p = new Parent2();
    p.field1 = "부모 필드 1";
    p.method1();
    p.method2();

    System.out.println("----- Child2 클래스 타입의 객체 -----");
    Child2 c = new Child2();
    c.field1 = "상속받은 필드1";
    c.field2 = "자식 클래스 전용 필드 2";
    c.method1();
    c.method2();
    c.method3();

    System.out.println("----- Parent2에 Child2 객체 대입 -----");
//    자동 타입 변환으로 부모 클래스 타입으로 변경
    p = c;
    p.field1 = "data1";
    // 부모 클래스 타입의 변수에 Child2 클래스 타입의 객체를 대입하여 Child2 클래스 타입 전용 필드인 field2 는 사용 못함
//    p.field2 = "data2";
    p.method1();
    p.method2();
    // 부모 클래스 타입의 변수에 Child2 클래스 타입의 객체를 대입하여 Child2 클래스 타입 전용 메소드인 method3 은 사용 못함
//    p.method3();

    System.out.println("----- 다시 Child2 객체에 Parent2 객체를 대입 -----");
//    원본이 자식 클래스인 Child2 클래스 타입의 객체인 Parent2클래스 타입의 변수를 다시 자식 클래스 타입의 변수에 강제 타입 변환으로 대입
    Child2 c2 = (Child2) p;
    c2.field1 = "data1";
//    다시 Child2 클래스 타입이 되었으므로 Child2 클래스의 전용 필드인 field2 를 사용 가능
    c2.field2 = "data2";
    c2.method1();
    c2.method2();
//    다시 Child2 클래스 타입이 되었으므로 Child2 클래스의 전용 메소드인 method3 을 사용 가능
    c2.method3();
  }
}







