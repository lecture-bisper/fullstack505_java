public class Driver3 {
  public void drive(Vehicle3 vehicle) {
    if (vehicle instanceof Bus3) {
      Bus3 bus = (Bus3) vehicle;
      bus.checkFare();
    }
    vehicle.run();
  }
}
