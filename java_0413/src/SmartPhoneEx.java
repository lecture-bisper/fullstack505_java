public class SmartPhoneEx {
  public static void main(String[] args) {

//    추상 클래스로는 객체를 생성할 수 없음
//    추상 클래스 타입의 변수는 생성할 수 있음
//    Phone phone; // 변수 생성 가능
//    phone = new phone(); // 객체 생성 실패

    SmartPhone smartPhone = new SmartPhone("아이유");
    smartPhone.turnOn();
    smartPhone.internetSearch();
    smartPhone.turnOff();
  }
}
