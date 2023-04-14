public class Bus3 implements Vehicle3{

  @Override
  public void run() {
    System.out.println("버스가 달립니다.");
  }

  public void checkFare() {
    System.out.println("요금을 확인합니다.");
  }
}
