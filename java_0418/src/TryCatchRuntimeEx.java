public class TryCatchRuntimeEx {
  public static void main(String[] args) {
//    finally : try ~ catch 구문에서 가장 마지막에 실행되는 코드 블록
//    finally 코드 블록은 오류가 발생하거나 발생하지 않거나 상관없이 무조건 실행되야 하는 소스 코드를 입력하는 코드 블록
//    파일 및 네트워크와 같은 외부 리소스를 사용 시 자바에서 해당 외부 리소스는 가비지 컬렉터가 메모리를 처리하지 않음 (사용자가 직접 메모리 해제를 해야 함)
//    finally를 사용하여 외부 리소스의 메모리 해제를 진행해야 함

    String data1 = null;
    String data2 = null;

//    data1 = args[0];
//    data2 = args[1];
    try {
      data1 = args[0];
      data2 = args[1];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("실행 매개값의 수가 부족합니다.");
      System.out.println("[실행 방법]");
      System.out.println("java TryCatchRuntimeEx  num1  num2");
      return;
    }

//    int value1 = Integer.parseInt(data1);
//    int value2 = Integer.parseInt(data2);
//    int result = value1 + value2;
//    System.out.println(data1 + " + " + data2 + " = " + result);

    try {
      int value1 = Integer.parseInt(data1);
      int value2 = Integer.parseInt(data2);
      int result = value1 + value2;
      System.out.println(data1 + " + " + data2 + " = " + result);
    }
    catch (NumberFormatException e) {
      System.out.println("숫자로 변환할 수 없습니다.");
    }
    finally {
      System.out.println("다시 실행하세요 : ");
    }

    System.out.println("\n----- 프로그램 종료 -----\n");
  }
}







