public class DriverEx {
  public static void main(String[] args) {
    Driver driver = new Driver();

//    각각의 객체를 생성 및 run() 실행
    Vehicle vehicle = new Vehicle();
    vehicle.run();

    Bus bus = new Bus();
    bus.run();

    Taxi taxi = new Taxi();
    taxi.run();

    System.out.println("\n ----- Driver 클래스의 drive()메소드 실행 -----\n");

//    Driver 클래스 타입의 객체 driver의 drive() 메소드를 실행
    driver.drive(vehicle);
    driver.drive(bus);
    driver.drive(taxi);

    System.out.println("\n ----- 부모 클래스 타입의 변수 vehicle에 자식 클래스 타입의 객체를 대입 후 부모 클래스 타입의 멤버인 run() 메소드 실행 -----\n");

    vehicle = bus;
    vehicle.run();

    vehicle = taxi;
    vehicle.run();






  }
}
