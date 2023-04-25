import java.awt.*;

public class BeepPrintEx2 {
  public static void main(String[] args) {
//    Runnable 인터페이스를 상속받아 run() 메소드를 오버라이딩하여 구현
//    Runnable beepTask = new BeepTask();
////    스레드를 추가로 생성하고 BeepTask 객체를 매개변수로 사용
//    Thread thread = new Thread(beepTask);
//
////    스레드 동작
////    메인 스레드가 새로 생성한 스레드 객체를 동작시킴
////    그리고 메인 스레드는 아래의 명령을 실행하러 이동함
////    새로 생성된 스레드가 메인 스레드와 분리되어 시작하면서 beepTask의 내용을 실행함
//    thread.start();

//    스레드 생성 시 매개변수로 인터페이스인 Runnable의 익명구현객체를 사용하여 스래드를 생성
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 5; i++) {
          toolkit.beep();

          try {
            Thread.sleep(500);
          }
          catch (Exception e) {

          }
        }
      }
    });

    thread.start();

//    메인 스레드가 동작 실행함
    for (int i = 0; i < 5; i++) {
      System.out.println("띵");
      try {
        Thread.sleep(500);
      }
      catch (Exception e) {

      }
    }
  }
}
