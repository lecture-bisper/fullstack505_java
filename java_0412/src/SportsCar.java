public class SportsCar extends Car {

//  부모 클래스에서 상속받아 오버라이딩한 메소드
  @Override
  public void speedUp() {
    speed += 10;
  }

//  부모 클래스에서 상속받아 오버라이딩하려고 했지만 부모 클래스의 메소드가 final로 지정되어 있어 오버라이딩이 불가능함
//  부모 클래스에서 상속받은 메소드를 그대로 사용해야 함
//  @Override
//  public void stop() {
//    System.out.println("스포츠카를 멈춥니다.");
//    speed = 0;
//  }
}
