import java.io.FileWriter;
import java.io.Writer;

public class WriteEx3 {
  public static void main(String[] args) throws Exception {
    Writer writer = new FileWriter("C:\\smart505\\writer3.txt");

    String data = "문자열로 바로 파일에 쓰기";

    writer.write(data);

    writer.flush();
    writer.close();
  }
}
