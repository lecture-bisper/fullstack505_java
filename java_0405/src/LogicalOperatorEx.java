public class LogicalOperatorEx {
  public static void main(String[] args) {
    int charCode = 'A';

    if ((charCode >= 65) && (charCode <= 90)) {
      System.out.println("대문자 입니다.");
    }
    else if ((charCode >= 97) && (charCode <= 122)) {
      System.out.println("소문자 입니다.");
    }
    else if (!(charCode < 48) && !(charCode > 57)) {
      System.out.println("0 ~ 9 숫자 입니다.");
    }

    int value = 6;

    if ((value % 2 == 0) || (value % 3 == 0)) {
      System.out.println("2 또는 3의 배수입니다ㅏ.");
    }

    int score = 85;

    char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');

    System.out.println(score + "점은 " + grade + "등급입니다.");

    if (score > 90) {
      grade = 'A';
    }
    else {
      if (score > 80) {
        grade = 'B';
      }
      else {
        grade = 'C';
      }
    }

    System.out.println(score + "점은 " + grade + "등급입니다.");
  }
}
