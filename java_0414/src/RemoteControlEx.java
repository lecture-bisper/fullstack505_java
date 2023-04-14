public class RemoteControlEx {
  public static void main(String[] args) {
//    인터페이스 타입의 변수 rc 선언
//    인터페이스도 추상 클래스처럼 객체를 만들 수 없지만 변수는 생성 가능
    RemoteControl rc = null;

//    부모 타입의 변수에 자식 클래스 타입의 객체를 저장하는 것이 가능함
    rc = new Audio();
    rc.turnOn();
    rc.setVolume(10);
    rc.setMute(true);
    rc.setMute(false);
    rc.turnOff();

    rc = new Television();
    rc.turnOn();
    rc.setMute(true);
    rc.setVolume(5);
    rc.setMute(false);
    rc.turnOff();

  }
}
