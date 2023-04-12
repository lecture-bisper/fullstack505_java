import java.util.Scanner;

public class Quiz4 {

  public static void quiz01() {
    System.out.println("\n ----- quiz1 -----\n");

    Song mySong = new Song("Nessun Dorma");
    Song yourSong = new Song("공주는 잠 못 이루고");
    System.out.println("내 노래는 " + mySong.getTitle());
    System.out.println("너 노래는 " + yourSong.getTitle());
  }

  public static void quiz02() {
    System.out.println("\n ----- quiz2 -----\n");

    Scanner sc = new Scanner(System.in);

    Phone[] phones = new Phone[2];

    for (int i = 0; i < phones.length; i++) {
      System.out.print("이름과 전화번호 입력 >> ");
      String name = sc.next();
      String tel = sc.next();

      phones[i] = new Phone(name, tel);
    }

    for (int i = 0; i < phones.length; i++) {
      System.out.println(phones[i].getName() + "의 번호 " + phones[i].getTel());
    }


//    System.out.print("이름과 전화번호 입력 >> ");
//    String name = sc.next();
//    String tel = sc.next();
//
//    Phone p1 = new Phone(name, tel);
//
//    System.out.print("이름과 전화번호 입력 >> ");
//    name = sc.next();
//    tel = sc.next();
//
//    Phone p2 = new Phone(name, tel);
//
//
//
//    System.out.println(p1.getName() + "의 번호 " + p1.getTel());
//    System.out.println(p2.getName() + "의 번호 " + p2.getTel());
  }

  public static void quiz03() {
    System.out.println("\n ----- quiz3 -----\n");

    Scanner sc = new Scanner(System.in);

    Rect[] rects = new Rect[4];

    for (int i = 0; i < rects.length; i++) {
      System.out.print((i + 1) + " 너비와 높이 >> ");

      int width = sc.nextInt();
      int height = sc.nextInt();

      rects[i] = new Rect(width, height);
    }

    System.out.println("저장하였습니다....");

    int total = 0;

    for (int i = 0; i < rects.length; i++) {
      total += rects[i].getArea();
    }

    System.out.println("사각형의 전체 합은 " + total);
  }

  public static void quiz04() {
    System.out.println("\n ----- quiz4 -----\n");

    Phone2Manager pm = new Phone2Manager();
    pm.run();
  }

  public static void quiz05() {
    System.out.println("\n ----- quiz5 -----\n");

    Circle pizza = new Circle(5);
    Circle waffle = new Circle(1);

    boolean res = CircleManager.equals(pizza, waffle);

    if (res == true) {
      System.out.println("pizza와 waffle 크기 같음");
    }
    else {
      System.out.println("pizza와 waffle 크기 다름");
    }

    CircleManager.copy(pizza, waffle);
    res = CircleManager.equals(pizza, waffle);

    if (res == true) {
      System.out.println("pizza와 waffle 크기 같음");
    }
    else {
      System.out.println("pizza와 waffle 크기 다름");
    }
  }

  public static void quiz06() {
    System.out.println("\n ----- quiz6 -----\n");

    Box a = new Box(); // 10x1 크기
    Box b = new Box(20, 3); // 20x3 크기

    a.fill('*');
    b.fill('%');
    a.draw();
    b.draw();
  }

  public static void main(String[] args) {
    quiz01();
    quiz02();
    quiz03();
    quiz04();
    quiz05();
    quiz06();
  }
}
