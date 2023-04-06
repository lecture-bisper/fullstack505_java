import java.util.Arrays;

public class ArrayCopyEx {
  public static void main(String [] args) {
    int a = 10;
    int b = 20;

    System.out.println("변수 a : " + a);
    System.out.println("변수 b : " + b);

    a = b;

    System.out.println("대입 후 a : " + a);
    System.out.println("대입 후 b : " + b);

    b = 100;

    System.out.println("b 수정 후 a : " + a);
    System.out.println("b 수정 후 b : " + b);

    System.out.println("\n ----- 배열 단순 대입 시 -----\n");

    int[] arr1 = {10, 20};
    int[] arr2 = {30, 40};

    System.out.println("----- 원본 배열 출력 -----");

    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

    arr1 = arr2;

    System.out.println("----- 단순 대입 후 배열 출력 ----- ");

    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

    arr2[0] = 100;
    arr2[1] = 200;

    System.out.println("----- arr2의 값 변경 -----");

    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");
    
    System.out.println("\n ----- 반복문을 통한 복사 -----\n");

    arr1 = new int[] {10, 20};
    arr2 = new int[] {30, 40};

    System.out.println("----- 원본 배열 출력 -----");

    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

    for (int i = 0; i < arr2.length; i++) {
      arr1[i] = arr2[i];
    }

    System.out.println("----- for문으로 복사 -----");

    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

    arr2[0] = 100;
    arr2[1] = 200;

    System.out.println("----- arr2의 값 직접 변경 -----");

    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

//    System.arraycopy() : System 클래스에서 지원하는 배열 복사 메소드
//    사용법 :
//    System.arraycopy(원본배열, 원본배열 시작index, 타겟배열, 타겟배열 시작index, 복사할 크기);

    System.out.println("\n ----- System.arraycopy() 사용 -----\n");

    arr1 = new int[] {10, 20};
    arr2 = new int[] {30, 40};

    System.out.println("----- 원본 배열 출력 -----");

    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

    System.arraycopy(arr2, 0, arr1, 0, arr2.length);

    System.out.println(" ----- arraycopy()로 복사 ----- ");

    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

    arr2[0] = 100;
    arr2[1] = 200;

    System.out.println("----- arr2의 값 직접 변경 -----");

    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

//    Arrays.copyOf() : Arrays 클래스에서 지원하는 배열 복사 메소드, 원본 배열을 그대로 복사
//    Arrays.copyOfRange() : Arrays 클래스에서 지원하는 배열 복사 메소드, 원본에서 원하는 크기만큼만 복사
//    사용법 :
//    타겟 배열 = Arrays.copyOf(원본배열, 크기);

    System.out.println("\n ----- Arrays.copyOf() 사용하기 -----\n");

    arr1 = new int[] {10, 20};
    arr2 = new int[] {30, 40};

    System.out.println("----- 원본 배열 출력 -----");

    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

    arr1 = Arrays.copyOf(arr2, arr2.length);

    System.out.println(" ----- copyOf() 사용 후 ----- ");

    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

    arr2[0] = 100;
    arr2[1] = 200;

    System.out.println("----- arr2의 값 직접 변경 -----");

    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

//    Object.clone() : 자바의 최상위 클래스인 Object 클래스에서 제공하는 메소드
//    사용법 :
//    타겟 배열 = 원본 배열.clone();

    System.out.println("\n ----- Object.clone() 사용하기 ----- \n");

    arr1 = new int[] {10, 20};
    arr2 = new int[] {30, 40};

    System.out.println("----- 원본 배열 출력 -----");

    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

    arr1 = arr2.clone();

    System.out.println(" ----- clone() 사용 후 ----- ");

    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

    arr2[0] = 100;
    arr2[1] = 200;

    System.out.println("----- arr2의 값 직접 변경 -----");

    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

  }

  public static void printArrays(int[] array, String name) {
    for (int i = 0; i < array.length; i++) {
      System.out.println(name + "[" + i + "] : " + array[i]);
    }
  }

  public static void print(int[] arr1, int[] arr2) {
    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");
  }
}











