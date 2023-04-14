public class RemoteControl3Ex {
  public static void main(String[] args) {
    RemoteControl rc = null;

    rc = new Television2();
    rc.turnOn();
    rc.setVolume(100);
    rc.setMute(true);
    rc.setVolume(-10);
    rc.setMute(false);
    rc.turnOff();

    System.out.println(" -------------------------------- ");

    rc = new Audio2();
    rc.turnOn();
    rc.setVolume(100);
    rc.setMute(true);
    rc.setVolume(-10);
    rc.setMute(false);
    rc.turnOff();

//    정적 메소드를 통해서 기능을 추가
    RemoteControl.changeBattery();
  }
}










