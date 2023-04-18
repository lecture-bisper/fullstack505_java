import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
  public static void main(String[] args) {
    FileReader reader = null;

    try {
      System.out.println("----- 파일 읽기 시작 -----");

      reader = new FileReader("C:\\smart505\\tokentest.txt");
      int c;

      while ((c = reader.read()) != -1) {
        System.out.print((char) c);
      }

      reader.close();
      System.out.println("\n----- 파일 읽기 완료 -----");
    }
    catch (IOException e) {
      System.out.println("입출력 오류");
    }
    finally {
      System.out.println("여기는 무조건 실행되는 부분");
      try {
        if (reader != null) {
          reader.close();
        }
      }
      catch (Exception e) {
      }
    }

    System.out.println("\n ***** 프로그램 종료 ***** \n");
  }
}
