public class Car6 {
  String model;
  String color;
  String price;

  public Car6() {
    this("토레스");
  }

  public Car6(String model) {
    this(model, "밝은 회색");
  }

  public Car6(String model, String color) {
    this(model, color, "2800");
  }

  public Car6(String model, String color, String price) {
    this.model = model;
    this.color = color;
    this.price = price;
  }
}
