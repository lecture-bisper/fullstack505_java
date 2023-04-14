public class SmartTelevisionEx {
  public static void main(String[] args) {
//    인터페이스 RemoteControl, Searchable 를 다중 상속받은 클래스 SmartTelevision 타입의 변수 stv 를 선언과 동시에 객체를 생성
    SmartTelevision stv = new SmartTelevision();

//    RemoteControl의 멤버와 Searchable 의 멤버를 모두 사용할 수 있음
    stv.turnOn();
    stv.setVolume(50);
    stv.setVolume(5);
    stv.setMute(true);
    stv.setMute(false);
    stv.search("ps vr2");
    stv.turnOff();

    RemoteControl irc = null;
    Searchable is = null;

    irc = stv;
    irc.turnOn();
    irc.setVolume(-100);
    irc.setMute(true);
//    irc는 RemoteControl 인터페이스 타입의 변수이므로 인터페이스 RemoteControl 의 멤버만 사용할 수 있음
//    irc.search("ps vr2"); // 오류 발생
    irc.turnOff();

    is = stv;
    is.search("ps vr2");
//    is는 Searchable 인터페이스 타입의 변수이므로 인터페이스 Searchable 의 멤버만 사용할 수 있음
//    is.turnOn(); // 오류 발생
//    is.turnOff();
  }
}
