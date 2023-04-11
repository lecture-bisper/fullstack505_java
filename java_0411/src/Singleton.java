public class Singleton {

//  자신 타입의 객체를 생성
//  외부에서 직접적인 접근은 차단
  private static Singleton singleton = new Singleton();

//  생성자
  private Singleton() {}

//  정적 메소드 선언
//  미리 만들어 놓은 객체를 우회하여 사용하도록 제공
  static Singleton getInstance() {
//    정적 필드인 singleton을 외부로 전달
    return singleton;
  }
}
