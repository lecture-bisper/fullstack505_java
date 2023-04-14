public class InterfaceExtendsEx {
  public static void main(String[] args) {
//    인터페이스 InterC 를 구현한 클래스 ImplC 타입의 객체 생성
    ImplC implc = new ImplC();

    System.out.println("\n ----- 인터페이스를 구현한 객체 -----\n");
//    ImplC 클래스서 구현한 methodA, methodB, methodC를 사용
    implc.methodA();
    implc.methodB();
    implc.methodC();

    System.out.println("\n ----- InterA 타입의 변수에 대입 -----\n");
//    조상인 InterA 타입의 변수에 자손 객체를 대입
    InterA interA = implc;
//    InterA의 멤버인 methodA만 사용 가능
    interA.methodA();
//    interA.methodB();
//    interA.methodC();

    System.out.println("\n ----- InterB 타입의 변수에 대입 -----\n");
//    조상인 InterB 타입의 변수에 자손 객체를 대입
    InterB interB = implc;
//    interB.methodA();
//    InterB의 멤버인 methodB만 사용 가능
    interB.methodB();
//    interB.methodC();

    System.out.println("\n ----- InterC 타입의 변수에 대입 -----\n");
//    조상인 InterC 타입의 변수에 자손 객체를 대입
    InterC interC = implc;
//    InterC는 InterA, InterB를 다중 상속했기 때문에 InterA의 methodA와 InterB의 methodB 그리고 자신 전용의 methodC를 모두 사용할 수 있음
    interC.methodA();
    interC.methodB();
    interC.methodC();
  }
}
