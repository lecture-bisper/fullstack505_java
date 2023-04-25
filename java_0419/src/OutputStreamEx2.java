import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx2 {
  public static void main(String[] args) throws Exception {
    OutputStream os = new FileOutputStream("C:\\smart505\\outputfile2.txt");

    byte[] data = "ABC".getBytes();

    os.write(data);
    os.flush();
    os.close();
  }
}
