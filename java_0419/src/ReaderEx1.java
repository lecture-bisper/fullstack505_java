import java.io.FileReader;
import java.io.Reader;

public class ReaderEx1 {
  public static void main(String[] args) throws Exception {
//    문자 입력 스트림의 최상위 클래스인 Reader 클래스 타입의 변수 reader에 자식 클래스인 FileReader 객체를 저장
    Reader reader = new FileReader("C:\\smart505\\tokentest.txt");

    int readData;

    while (true) {
//      파일에서 문자 1자를 가져와 readData에 저장
      readData = reader.read();

//      가져온 데이터가 -1이면 더 이상 읽을 수 없음
      if (readData == -1) {
        break;
      }

      System.out.print((char) readData);
    }

    reader.close();
  }
}
