// 인터페이스 InterA와 InterB를 다중 상속 받은 인터페이스 InterC
public interface InterC extends InterA, InterB {
//  인터페이스 InterC의 전용 추상 메소드 methodC
//  InterA의 methodA와 InterB의 methodB는 상속받았지만 오버라이딩하지 않음
  void methodC();
}
