
// 추상 메소드 : 메소드의 선언부만 존재하고 실행영역인 코드블록은 존재하지 않는 메소드
// 추상 클래스 : 추상 메소드를 가지고 있는 클래스
// 추상 클래스는 자체적으로 객체를 생성할 수 없음 (new 키워드 사용불가)
// 다른 클래스가 추상 클래스를 상속받아 추상 메소드 부분을 모두 오버라이딩으로 구현해야 함
// 추상 클래스에서 상속받은 추상 메소드를 1개라도 구현하지 않으면 해당 클래스도 추상 클래스가 됨
// 다른 클래스들의 부모 클래스로 사용하여 구현해야 하는 멤버를 미리 지정함 (규격화 작업)
// 키워드로 abstract 키워드를 클래스 및 메소드에 사용함

public abstract class Phone {
  public String owner;

  public Phone(String owner) {
    this.owner = owner;
  }

  public void turnOn() {
    System.out.println("폰 전원을 켭니다.");
  }

  public void turnOff() {
    System.out.println("폰 전원을 끕니다.");
  }
}










