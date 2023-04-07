public class CarEx {
  public static void main(String[] args) {
    Car myCar = new Car();

    System.out.println("제작회사 : " + myCar.company);
    System.out.println("모델명 : " + myCar.model);
    System.out.println("색상 : " + myCar.color);
    System.out.println("최고속도 : " + myCar.maxSpeed);
    System.out.println("현재속도 : " + myCar.speed);

    myCar.speed = 50;
    System.out.println("수정된 현재 속도 : " + myCar.speed);

    Car yourCar = new Car();
    yourCar.company = "기아자동차";
    yourCar.model = "EV6";
    yourCar.color = "밝은 회색";
    yourCar.maxSpeed = 300;
    yourCar.speed = 50;

    System.out.println("제작회사 : " + yourCar.company);
    System.out.println("모델명 : " + yourCar.model);
    System.out.println("색상 : " + yourCar.color);
    System.out.println("최고속도 : " + yourCar.maxSpeed);
    System.out.println("현재속도 : " + yourCar.speed);

  }
}
