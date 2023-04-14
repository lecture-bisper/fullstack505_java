//인터페이스는 다중 상속을 지원함
//implements 뒤에 여러개의 인터페이스를 추가하여 다중 상속 받을 수 있음
//다중 상속 시 상속받은 모든 추상 메소드를 오버라이딩을 통해서 구현해야 함
public class SmartTelevision implements RemoteControl, Searchable{
  private int volume;

  @Override
  public void turnOn() {
    System.out.println("스마트 TV를 켭니다.");
  }

  @Override
  public void turnOff() {
    System.out.println("스마트 TV를 끕니다.");
  }

  @Override
  public void setVolume(int volume) {
    if (volume > RemoteControl.MAX_VOLUME) {
      this.volume = RemoteControl.MAX_VOLUME;
    }
    else if (volume < RemoteControl.MIN_VOLUME) {
      this.volume = RemoteControl.MIN_VOLUME;
    }
    else {
      this.volume = volume;
    }

    System.out.println("현재 스마트 TV 볼륨 : " + this.volume);
  }

  @Override
  public void search(String url) {
    System.out.println(url + "을 검색합니다.");
  }
}
