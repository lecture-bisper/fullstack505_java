public class Tire {
  public int maxRotation; // 최대
  public int accRotation; // 누적
  public String location; // 위치

  public Tire(String location, int maxRotation) {
    this.location = location;
    this.maxRotation = maxRotation;
  }

  public boolean roll() {
    ++accRotation;

    if (accRotation < maxRotation) {
      System.out.println(location + " Tire 수명 : " + (maxRotation - accRotation) + "회");
      return true;
    }
    else {
      System.out.println("*** " + location + " Tire 펑크 ***");
      return false;
    }
  }
}





