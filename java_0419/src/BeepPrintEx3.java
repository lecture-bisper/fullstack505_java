import java.awt.*;

public class BeepPrintEx3 {
  public static void main(String[] args) {
//    Thread 클래스를 직접 상속받은 BeepThread 클래스 타입의 객체를 이용함
//    Thread thread = new BeepThread();
//
//    thread.start();

//    익명 클래스를 사용하여 스레드를 사용함
    Thread thread = new Thread() {
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
    };

    thread.start();

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
