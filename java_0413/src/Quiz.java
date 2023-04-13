import java.util.Scanner;

public class Quiz {
  private static int position = 0;
  private static Shape[] shapes = new Shape[10];

  public static void quiz02() {
    System.out.println("\n ----- Quiz02 -----\n");

    MyAdder adder = new MyAdder();
    System.out.println(adder.add(5, 10));
    System.out.println(adder.add(10));
  }

  public static void quiz03() {
    System.out.println("\n ----- Quiz03 -----\n");

    Adder adder = new Adder();
    Subtracter sub = new Subtracter();

    adder.run();
    sub.run();
  }

  private static void quiz05() {
    System.out.println("\n ----- Quiz05 -----\n");

    StringStack stack = new StringStack(10);
    Scanner sc = new Scanner(System.in);

    System.out.print(" >> ");

    for (int i = 0; i < 5; i++) {
      String text = sc.next();
      stack.push(text);
    }

    int count = stack.length();

    for (int i = 0; i < count; i++) {
      System.out.print(stack.pop() + " ");
    }
  }

  private static void quiz06() {
    System.out.println("\n ----- Quiz06 -----\n");

    Scanner sc = new Scanner(System.in);

    int choice = 0;

    while (choice != 4) {
      System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
      choice = sc.nextInt();

      switch (choice) {
        case 1:
          System.out.print("도형 종류 Line(1), Rect(2), Circle(3) >> ");
          int type = sc.nextInt();

          if (type < 1 || type > 3) {
            System.out.println("잘못 입력하였습니다.");
            break;
          }

          insert(type);
          break;

        case 2:
          System.out.print("삭제할 도형의 위치 >> ");
          int index = sc.nextInt();
          if (!delete(index)) {
            System.out.println("삭제할 수 없습니다.");
          }
          break;

        case 3:
          String tmp = "";
          for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
              tmp += shapes[i] + "\n";
            }
          }
          System.out.println(tmp);
          break;

        case 4:
          System.out.println("프로그램을 종료합니다...");
          break;

        default:
          System.out.println("잘못 입력하였습니다.");
          break;
      }
    }

  }

  public static void insert(int type) {
    Shape obj = null;

    switch (type) {
      case 1:
        obj = new Line();
        break;

      case 2:
        obj = new Rect();
        break;

      case 3:
        obj = new Circle();
        break;
    }

    shapes[position] = obj;
    position++;
  }

  public static boolean delete(int index) {
    int count = 0;
    shapes[index] = null;

    for (int i = 0; i < shapes.length; i++) {
      if (shapes[i] == null) {
        count++;
      }
    }

    if (count == shapes.length) {
      return false;
    }
    return true;
  }

  public static void main(String[] args) {
    quiz02();
    quiz03();
    quiz05();
    quiz06();
  }
}
