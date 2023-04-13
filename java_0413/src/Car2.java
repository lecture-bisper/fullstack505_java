public class Car2 {
  Tire[] tires = {
      new Tire("앞왼쪽", 6),
      new Tire("앞오른쪽", 2),
      new Tire("뒤왼쪽", 3),
      new Tire("뒤오른쪽", 5)
  };

//  Tire[] tires;
//
//  public Car2() {
//    tires = new Tire[4];
//    tires[0] = new Tire("앞왼쪽", 6);
//    tires[1] = new Tire("앞오른쪽", 2);
//    tires[2] = new Tire("뒤왼쪽", 3);
//    tires[3] = new Tire("뒤오른쪽", 5);
//  }

  int run() {
    System.out.println("[자동차가 달립니다.]");

    for (int i = 0; i < tires.length; i++) {
      if (tires[i].roll() == false) {
        stop();
        return (i + 1);
      }
    }
    return 0;
  }

  void stop() {
    System.out.println("[자동차가 멈춥니다.]");
  }
}
