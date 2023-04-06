import java.util.Calendar;

public class EnumWeekEx {
  public static void main(String[] args) {
//    사용자가 생성한 열거형 데이터 타입 Week를 사용하여 변수 today를 생성
//    변수 today에 저장할 수 있는 데이터는 Week 열거형 타입에 등록된 데이터만 사용할 수 있음
    Week today = null;

//    자바의 날짜 정보를 가져오는 클래스
    Calendar cal = Calendar.getInstance();
//    Calendar.DAY_OF_WEEK : 일주일 중의 요일을 1 ~ 7까지의 숫자로 표현
    int week = cal.get(Calendar.DAY_OF_WEEK);

    switch (week) {
      case 1:
        today = Week.SUNDAY;
        break;

      case 2:
        today = Week.MONDAY;
        break;

      case 3:
        today = Week.TUESDAY;
        break;

      case 4:
        today = Week.WEDNESDAY;
        break;

      case 5:
        today = Week.THURSDAY;
        break;

      case 6:
        today = Week.FRIDAY;
        break;

      case 7:
        today = Week.SATURDAY;
        break;
    }

    System.out.println("오늘 요일 : " + today);

    if (today == Week.SUNDAY) {
      System.out.println("일요일에는 축구를 합니다.");
    }
    else {
      System.out.println("열심히 자바 공부를 합니다");
    }
  }
}
