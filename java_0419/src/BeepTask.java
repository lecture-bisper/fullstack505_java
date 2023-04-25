import java.awt.*;

public class BeepTask implements Runnable {

  @Override
  public void run() {
    Toolkit toolkit = Toolkit.getDefaultToolkit();

    for (int i = 0; i < 5; i++) {
      toolkit.beep();

      try {
//        현재 스레드의 동작을 지정한 시간(1/1000초 기준)동안 멈춤
        Thread.sleep(500);
      }
      catch (Exception e) {

      }
    }
  }
}
