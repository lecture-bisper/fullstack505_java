import java.awt.*;

public class BeepPrintEx1 {
  public static void main(String[] args) {
//    싱글 스레드로 프로그램을 동작했을 경우
    Toolkit toolkit = Toolkit.getDefaultToolkit();

    for (int i = 0; i < 5; i++) {
      toolkit.beep();
      try {
        Thread.sleep(500);
      }
      catch (Exception e) {

      }
    }

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
