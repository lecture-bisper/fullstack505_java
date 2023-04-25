import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx3 {
  public static void main(String[] args) throws Exception {
    InputStream is = new FileInputStream("c:\\smart505\\tokentest.txt");
    int readData;
    byte[] readBytes = new byte[8];
    readData = is.read(readBytes, 2, 3);

    for (int i = 0; i < readBytes.length; i++) {
      System.out.println(readBytes[i] + " : " + (char)readBytes[i]);
    }

    is.close();
  }
}
