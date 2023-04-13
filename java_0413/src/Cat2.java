//  상속 받은 추상 메소드를 반드시 구현해야 함
//  상속받은 추상 메소드를 구현하지 않을 경우 해당 클래스로 추상클래스로 선언해야 함
public class Cat2 extends Animal2 {
  public Cat2() {
    this.kind = "포유류";
  }

//  상속받은 추상 메소드를 오버라이딩한 메소드
  @Override
  public void sound() {
    System.out.println("야옹");
  }
}
