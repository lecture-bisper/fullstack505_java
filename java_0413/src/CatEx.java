public class CatEx {
  public static void main(String[] args) {
//    부모 클래스인 Animal 클래스 타입의 변수 animal에 Animal 클래스 타입의 객체를 생성
    Animal animal = new Animal();
//    Animal 클래스를 상속받은 Cat 클래스 타입의 변수 cat을 선언하고 Cat 클래스 타입의 객체를 생성
    Cat cat = new Cat();

//    두 객체를 비교
    if (animal == cat) {
      System.out.println("두 객체는 같다.");
    }
    else {
      System.out.println("두 객체는 다르다.");
    }

//    부모 클래스인 Animal 클래스 타입의 변수 animal에 자식 클래스인 Cat 클래스 타입의 객체를 대입
//    자동 타입 변환이 발생하면서 부모 클래스인 Animal 클래스 타입의 변수에 자식 클래스인 Cat 클래스 타입의 객체가 저장됨
    animal = cat;

//    겉 모양은 부모인 Animal 클래스 타입의 변수이지만 실제 데이터는 자식 클래스인 Cat 클래스 타입의 객체임
    if (animal == cat) {
      System.out.println("두 객체는 같다.");
    }
    else {
      System.out.println("두 객체는 다르다.");
    }
  }
}
