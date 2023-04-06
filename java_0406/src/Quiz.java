import java.util.Scanner;

public class Quiz {
//  실습문제 2번
  public static void quiz01() {
    System.out.println("----- 실습문제 2번 -----");

    Scanner sc = new Scanner(System.in);

//    정수를 입력받을 배열 10개짜리 하나 생성
    int[] numArr = new int[10];

//    배열에 정수를 입력받은 부분
    for (int i = 0; i < numArr.length; i++) {
      System.out.print("정수를 입력하세요 (" + (numArr.length - i) + "개) : ");
      numArr[i] = sc.nextInt();
    }

//    배열에 저장된 데이터 출력
    for (int i = 0; i < numArr.length; i++) {

//      3의 배수 확인
      if (numArr[i] % 3 == 0) {
        System.out.print(numArr[i] + " ");
      }
    }
  }

  public static void quiz02() {
    System.out.println("----- 실습문제 5번 -----");

//    정수 10개 입력 받기 위한 배열 선언
    Scanner sc = new Scanner(System.in);
    int numArr[] = new int [10];

//    정수를 10개 입력받기 위한 반복문
    for (int i = 0; i < numArr.length; i++) {
      System.out.print("정수를 입력하세요 (" + (numArr.length - i) + "개) : ");
      numArr[i] = sc.nextInt();
    }
    
//    입력된 배열의 내용을 정렬함
    for(int i = 0; i < numArr.length; i++) {
      for(int j = i; j < numArr.length; j++) {
        if(numArr[i] > numArr[j]) {
          int tmp = numArr[i];
          numArr[i] = numArr[j];
          numArr[j] = tmp;
        }
      }
    }

    for(int i=0; i < numArr.length; i++) {
      System.out.print(numArr[i] + " ");
    }
  }

  public static void quiz03() {
    System.out.println("----- 실습문제 6번 -----");
//    단어장 생성
    String eng[] = { "student", "love", "java", "happy", "future" };
    String kor[] = { "학생", "사랑", "자바", "행복한", "미래" };

    Scanner sc = new Scanner(System.in);
//    사용자 입력을 'exit'가 입력될 때까지 무한으로 받아야 함
    while(true) { // 무한 반복
      System.out.print("영어 단어를 입력하세요 : ");
      String s = sc.nextLine(); // 사용자 입력 단어

//      입력된 문자열이 "exit"와 같은지 비교
      if(s.equals("exit")) {
        break; // 반복문 종료
      }

//      영어 단어 배열에서 사용자가 입력한 단어와 동일한 것이 있는지 확인
      int i;
      for(i = 0; i < eng.length; i++) {
        if(eng[i].equals(s)) {
          System.out.println(kor[i]); // 동일한 단어가 있을 경우 한글 단어 배열에서 해당 index의 단어를 출력
          break; // 영어 단어 배열 검색을 즉시 종료
        }
      }

//      i의 값과 영어단어 배열의 크기가 같으면 영어 단어 배열 안에 사용자가 입력한 단어가 없다는 의미
      if(i == eng.length) {
        System.out.println("그런 영어 단어가 없습니다.");
      }
    }

    System.out.println("종료합니다...");
  }

  public static void quiz04() {
    System.out.println("----- 실습문제 7번 -----");

    for (int i = 1; i < 100; i++) {
      int count = 0;

      int first = i / 10; // 10의 자리
      int second = i % 10; // 1의 자리

//      10의 자리에 숫자가 있는지 확인, 10의 자리의 숫자가 3의 배수인지 확인
//      30번대, 60번대, 90번대 일때만 count++;
      if((first != 0) && (first % 3 == 0)) {
        count++;
      }

//      1의 자리의 숫자가 0이 아닌지 확인(1 ~ 9), 1의 자리의 숫자가 3의 배수인지 확인
//      3, 6, 9 일때만 count++;
      if((second != 0) && (second % 3 == 0)) {
        count++;
      }

      switch(count) {
        case 1 :
          System.out.println(i + " 박수한번");
          break;

        case 2 :
          System.out.println(i + " 박수두번");
          break;
      }
    }
  }

  public static void quiz05() {
    System.out.println("----- 실습문제 8번 -----");

    String com[] = { "가위", "바위", "보" };

    Scanner sc = new Scanner(System.in);
    System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

    while(true) {
      System.out.print("가위 바위 보! : ");
      String a = sc.nextLine(); // 사용자 입력

//      종료 명령과 같은지 확인
      if(a.equals("그만")) {
        System.out.print("게임을 종료합니다...");
        break;// 종료
      }

//      컴퓨터의 숫자를 0 ~ 2까지 랜덤하게 받음
      int n = (int)(Math.random() * 3);
      String b = com[n]; // 미리 생성해 둔 문자열 배열에 있는 index 번호의 문자열을 가져옴

      System.out.print("사용자 = " + a + " , 컴퓨터 = " + b + ", ");

//      컴퓨터와 사용자의 가위바위보 비교
      if(a.equals("가위")) { // 사용자의 입력이 "가위" 
        if(b.equals("가위")) // 컴퓨터의 입력이 "가위" 이면 비김
          System.out.println("비겼습니다.");
        else if(b.equals("바위")) // 컴퓨터의 입력이 "바위"이면 컴퓨터 승
          System.out.println("컴퓨터가 이겼습니다.");
        else // 컴퓨터의 입력이 "보"이면 사용자 승
          System.out.println("사용자가 이겼습니다.");
      }
      else if(a.equals("바위")) { // 사용자의 입력이 "바위"
        if(b.equals("가위")) // 컴퓨터의 입력이 "가위" 이면 사용자 승
          System.out.println("사용자가 이겼습니다.");
        else if(b.equals("바위")) // 컴퓨터의 입력이 "바위"이면 비김
          System.out.println("비겼습니다.");
        else // 컴퓨터의 입력이 "보"이면 컴퓨터 승
          System.out.println("컴퓨터가 이겼습니다.");
      }
      else if(a.equals("보")) { // 사용자의 입력이 "보"
        if(b.equals("가위")) // 컴퓨터의 입력이 "가위" 이면 컴퓨터 승
          System.out.println("컴퓨터가 이겼습니다.");
        else if(b.equals("바위")) // 컴퓨터의 입력이 "바위"이면 사용자 승
          System.out.println("사용자가 이겼습니다.");
        else // 컴퓨터의 입력이 "보"이면 비김
          System.out.println("비겼습니다.");
      }
      else { // 잘못된 입력일 경우
        System.out.println("다시 하세요.");
      }
    }
  }

  public static void main(String[] args) {
    quiz01();
    quiz02();
    quiz03();
    quiz04();
    quiz05();
  }
}
