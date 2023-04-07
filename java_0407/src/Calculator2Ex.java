public class Calculator2Ex {
  public static void main(String[] args) {
//    Calculator2 클래스 타입의 변수 myCal에 CalCulator2 클래스의 객체 생성 후 대입
    Calculator2 myCal = new Calculator2();
//    CalCulator2 클래스 타입의 객체 myCal의 멤버 메소드 중 execute() 를 호출
//    execute() 메소드를 myCal 객체 외부에서 접근해서 호출함
//    객체 외부에서 접근
    myCal.execute();
  }
}
