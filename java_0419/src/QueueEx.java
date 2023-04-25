import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
  public static void main(String[] args) {
    Queue<Message> msgQueue = new LinkedList<>();

    msgQueue.offer(new Message("sendMail", "홍길동"));
    msgQueue.offer(new Message("sendSMS", "아이유"));
    msgQueue.offer(new Message("sendKakaotalk", "아이유"));

    while(!msgQueue.isEmpty()) {
      Message msg = msgQueue.poll();

      switch(msg.command) {
        case "sendMail":
          System.out.println(msg.to + "님에게 메일을 보냅니다.");
          break;

        case "sendSMS":
          System.out.println(msg.to + "님에게 SMS를 보냅니다.");
          break;

        case "sendKakaotalk":
          System.out.println(msg.to + "님에게 카카오톡을 보냅니다.");
          break;
      }
    }
  }
}
