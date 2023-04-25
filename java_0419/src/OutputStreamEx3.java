import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx3 {

  public static void main(String[] args) throws Exception {
    OutputStream os =  new FileOutputStream("c:\\smart505\\outputfile3.txt");

    byte[] bytes = "ABCDEFGHIJKLMNOPQ".getBytes();

    os.write(bytes, 5, 10);
    os.flush();
    os.close();
  }
}
