// 클래스와 동일한 방식으로 이름을 설정
public interface RemoteControl {
//  인터페이스의 필드 (상수)
//  선언과 동시에 데이터 입력, static 초기화 블록 사용 불가
  int MAX_VOLUME = 10;
  public static final int MIN_VOLUME = 0;

//  인터페이스의 멤버인 추상 메소드
//  public abstract 키워드를 생략해도 자동으로 추가
//  자식 클래스는 반드시 추상 메소드를 상속받아 구현해야 함
//  상속받은 추상 메소드를 구현하지 않으면 해당 클래스도 추상 클래스가 됨
  void turnOn();
  void turnOff();
  void setVolume(int volume);

//  인터페이스의 추가된 멤버, 디폴트 메소드
  default void setMute(boolean mute) {
    if (mute) {
      System.out.println("무음 모드 입니다.");
    }
    else {
      System.out.println("무음 모드 해제 합니다.");
    }
  }

//  인터페이스의 추가된 멤버, 정적 메소드
  static void changeBattery() {
    System.out.println("건전지를 교환합니다.");
  }
}









