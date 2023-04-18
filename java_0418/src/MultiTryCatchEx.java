public class MultiTryCatchEx {
  public static void main(String[] args) {
    System.out.println("----- Exception 으로 모든 예외 처리 -----");

    try {
      String data1 = args[0];
      String data2 = args[1];
      int value1 = Integer.parseInt(data1);
      int value2 = Integer.parseInt(data2);
      int result = value1 + value2;
      System.out.println(data1 + " + " + data2 + " = " + result);
    }
//    예외처리의 최상위 클래스인 Exception을 통해서 예외처리를 진행
//    모든 예외에 대해서 동일한 처리만 가능
    catch (Exception e) {
      System.out.println("오류가 발생했습니다.");
    }
    finally {
      System.out.println("프로그램을 종료합니다.");
    }


    System.out.println("\n ----- multi try ~ catch -----\n");
//    여러개의 Exception을 동시에 사용 시 예외처리 최상위 클래스인 Exception 클래스를 사용하는 catch 부분을 가장 마지막에 사용해야 함
//    Excception 클래스를 사용하는 catch 부분이 앞에 있을 경우 Exception 클래스가 모든 예외를 다 처리하여 다른 예외가 동작하지 않음

    try {
      String data1 = args[0];
      String data2 = args[1];
      int value1 = Integer.parseInt(data1);
      int value2 = Integer.parseInt(data2);
      int result = value1 + value2;
      System.out.println(value1 + " + " + value2 + " = " + result);
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("배열의 최대 범위를 초과하여 사용했습니다.");
    }
    catch (NumberFormatException e) {
      System.out.println("숫자로 변경할 수 없습니다.");
    }
    catch (Exception e) {
      System.out.println("알 수 없는 오류가 발생했습니다.");
    }

    System.out.println("\n ***** 프로그램 종료 ***** \n");
  }
}









