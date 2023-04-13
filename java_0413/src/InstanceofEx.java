public class InstanceofEx {
  public static void main(String[] args) {
    System.out.println("----- 원본이 Child3 일 경우 -----");
//    원본이 Child3 타입의 객체
    Parent3 p1 = new Child3();
    method1(p1);
    method2(p1);

    System.out.println("----- 원본이 Parent3 일 경우 -----");
    Parent3 p2 = new Parent3();
    method1(p2);
    method2(p2);
  }

  public static void method1(Parent3 p) {
    if (p instanceof Child3) {
      Child3 c = (Child3) p;
      System.out.println("method1 - Child3으로 변환 성공");
    }
    else {
      System.out.println("method1 - Child3으로 변환되지 않음");
    }
  }

  public static void method2(Parent3 p) {
    Child3 c = (Child3) p;
    System.out.println("method2 - Child3으로 변환 성공");
  }
}
