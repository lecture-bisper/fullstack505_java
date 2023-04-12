import java.util.Scanner;

//문제 1 ) 아래의 소스에서 run() 메소드의 내용을 수정하여 간단하게 만드세요..
//* 메소드를 추가
public class Phone2Manager {
//  Scanner 클래스 타입의 객체를 필드로 사용하여 해당 클래스 전체에서 사용할 수 있도록 함
  private Scanner sc = new Scanner(System.in);
  private Phone2[] phones; // 연락처 정보를 저장할 배열, 현재는 Null

  private void inputData() {
    System.out.print("인원수 >> ");
    int count = sc.nextInt(); // 사용자 수 입력받음
    phones = new Phone2[count]; // 사용자 수 만큼 배열 크기 설정

    for (int i = 0; i < phones.length; i++) {
      System.out.print("이름과 전화번호(번호는 연속적으로 입력) >> ");
//      사용자 이름과 전화번호 입력받기
      String name = sc.next();
      String tel = sc.next();

//      입력받은 정보를 통해서 Phone2 객체를 생성과 동시에 배열에 저장
      phones[i] = new Phone2(name, tel);
    }
    System.out.println("저장되었습니다.");
  }

  private String search(String name) {
    String tel = ""; // 전화번호를 입력받을 변수

//      입력된 배열의 크기만큼 반복하면서 사용자를 검색
    for (int i = 0; i < phones.length; i++) {
//        입력한 사용자와 동일한 정보가 있을 경우
      if (phones[i].getName().equals(name)) {
//          해당 사용자의 전화번호를 변수에 저장
        tel = phones[i].getTel();
        break; // 검색을 멈춤
      }
    }

    return tel;
  }

  private void printResult(String tel, String name) {
    //      검색 결과를 출력
    if (tel.equals("")) {
      System.out.println(name + "이 없습니다.");
    }
    else {
      System.out.println(name + "의 번호는 " + tel + " 입니다.");
    }
  }

  public void run() {
    inputData(); // 사용자 정보 입력

//    무한 루프로 입력을 계속 받음
    while (true) {
      System.out.print("검색할 이름 >> ");
      String name = sc.next(); // 이름 입력 받기

//      입력 받은 내용이 exit와 같으면 무한루프 종료
      if (name.equals("exit")) {
        break;
      }

      // 전화번호를 입력받을 변수
      String tel = search(name); // 사용자 검색

      printResult(tel, name); // 결과 출력
    }

    System.out.println("프로그램을 종료합니다.");
  }
}
