public class Car2 {
//  인터페이스 타입의 배열 선언
//  배열의 요소로 자식 클래스인 KumhoTire 클래스의 객체를 사용함
  Tire[] tires = {
      new KumhoTire(),
      new KumhoTire(),
      new KumhoTire(),
      new KumhoTire()
  };

  void run() {
//    발전된 for 문을 사용하여 배열의 모든 요소를 출력
    for (Tire tire : tires) {
      tire.roll();
    }
  }
}
