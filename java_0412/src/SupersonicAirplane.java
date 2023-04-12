public class SupersonicAirplane extends Airplane {
  public static final int NORMAL = 1; // 상수
  public static final int SUPERSONIC = 2; // 상수

  public int flyMode = NORMAL; // 필드

  @Override
  public void fly() {
    if (flyMode == SUPERSONIC) {
      System.out.println("초음속 비행 합니다.");
    }
    else {
      super.fly();
    }
  }
}
