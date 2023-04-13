public class Animal2Ex {
  public static void main(String[] args) {
//    추상 클래스인 Animal2 클래스를 상속받은 Dog2, Cat2 클래스를 객체화
    Dog2 dog = new Dog2();
    Cat2 cat = new Cat2();

    dog.sound();
    cat.sound();
    System.out.println("--------------------------------");

//    추상 클래스인 Animal2 클래스 타입의 변수 animal 선언
    Animal2 animal = null;
//   부모 클래스인 Animal2 클래스 타입의 변수 animal에 자식 클래스 타입의 객체를 생성하여 저장 (다형성)
    animal = new Dog2();
//    부모 클래스 타입으로 메소드를 실행하지만 실제로 동작되는 것은 자식 클래스 타입의 객체가 가지고 있는 메소드가 동작됨
    animal.sound();
    animal = new Cat2();
    animal.sound();

    System.out.println("--------------------------------");


  }
}
