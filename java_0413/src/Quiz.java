import java.util.Scanner;

public class Quiz {
//  추상 클래스인 Shape 클래스 타입의 배열에 저장되는 데이터 위치
  private static int position = 0;
//  추상 클래스인 Shape 클래스 타입의 배열 선언
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

//    StringStack 클래스 타입의 변수 선언 및 객체 생성
//    매개변수로 정수 10을 사용하여 스택 구조로 사용하는 배열의 크기를 10으로 설정
    StringStack stack = new StringStack(10);
    Scanner sc = new Scanner(System.in);

    System.out.print(" >> ");

//    5번은 사용자 키보드 입력
    for (int i = 0; i < 5; i++) {
      String text = sc.next();
//      StringStack 클래스 타입의 객체 stack의 메소드 push를 사용하여 데이터를 입력받은 데이터를 저장
      stack.push(text);
    }

//    StringStack 클래스 타입의 객체 stack의 메소드 length()를 사용하여 스택 구조의 배열 저장된 데이터의 크기를 가져옴
    int count = stack.length();

//    입력된 내용을 출력
    for (int i = 0; i < count; i++) {
//      StringStack 클래스 타입의 객체 stack의 메소드 pop()을 사용하여 스택 구조의 배열에 저장된 데이터를 하나씩 가져옴
      System.out.print(stack.pop() + " ");
    }
  }

  private static void quiz06() {
    System.out.println("\n ----- Quiz06 -----\n");

    Scanner sc = new Scanner(System.in);

//    메뉴 선택용 변수
    int choice = 0;

//    무한 반복
    while (choice != 4) {
//      화면에 메뉴 출력
      System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
//      메뉴 선택
      choice = sc.nextInt();

//      메인 메뉴 선택에 따라 다르게 동작
      switch (choice) {
        case 1:
//          서브 메뉴 출력
          System.out.print("도형 종류 Line(1), Rect(2), Circle(3) >> ");
//          서브 메뉴 입력 받기
          int type = sc.nextInt();

//          서브 메뉴 클릭 시 1 미만, 3 초과일 경우 오류 내용 출력
          if (type < 1 || type > 3) {
            System.out.println("잘못 입력하였습니다.");
            break; // 스위치 문 강제 종료, 반복문 재시작
          }

//          Shape 클래스 타입의 배열에 데이터 추가
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

//  Shapes 배열에 데이터 입력
  public static void insert(int type) {
//    부모인 추상 클래스 Shape 타입의 변수 선언;
    Shape obj = null;

//    매개변수로 받아온 데이터에 따라 Shape 타입의 변수에 저장할 자식 클래스의 객체를 생성함
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

//    추상 클래스 타입의 배열 shapes에 데이터 추가
    shapes[position] = obj;
//    저장된 위치 업데이트
    position++;
  }

//  추상 클래스 타입의 배열 shapes 에 저장된 내용 삭제
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
