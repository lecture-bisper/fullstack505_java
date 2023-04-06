public class ArrayCreateEx1 {
  public static void main(String[] args) {
//    배열 : JS의 배열과 기본적인 특징은 비슷하지만 다른 점도 있음
//    다른점
//    1. 자바의 배열은 생성 시 지정된 크기를 변경할 수 없음
//    2. 자바의 배열을 동일한 데이터 타입만 저장할 수 있음

//    사용방법 (선언)
//    1. 타입[] 배열명 = new 타입[크기];
//    2. 타입[] 배열명 = {데이터1, 데이터2, 데이터3, ... };
//    3. 타입[] 배열명;
//        배열명 = new 타입[] {데이터1, 데이터2, 데이터3, ... };

//    일반적으로 사용하는 방식
//    배열의 크기를 지정하여 생성하는 방식
    int[] numArr1 = new int[5];
    numArr1[0] = 10;
    numArr1[1] = 20;
    numArr1[2] = 30;
    numArr1[3] = 40;
    numArr1[4] = 50;

    System.out.println("배열 numArr1[0] : " + numArr1[0]);
    System.out.println("배열 numArr1[4] : " + numArr1[4]);

//    배열 선언과 동시에 데이터를 저장하는 방식
//    편의를 위해서 new 부분을 생략해도 됨
//    {} 안의 데이터의 개수에 따라서 배열의 크기가 결정됨
    int[] numArr2 = {10, 20, 30, 40, 50};
//    int[] numArr2 = new int[] {10, 20, 30, 40, 50};

    System.out.println("배열 numArr2[0] : " + numArr2[0]);
    System.out.println("배열 numArr2[4] : " + numArr2[4]);

//    배열 타입의 변수만 먼저 생성하고 필요에 따라서 배열 객체를 생성하여 사용하는 방식
//    배열의 크기가 결정되지 않았기 때문에 나중에 배열 객체 생성 시 크기를 결정할 수 있도록 반드시 new 키워드를 사용해야 함
//    new 키워드 없이 { 데이터 } 형식으로 사용하는 것은 지원하지 않음
    int[] numArr3;
//    numArr3 = {10, 20, 30, 40, 50};
    numArr3 = new int[] {10, 20, 30, 40, 50};
//    numArr3 = new int[5];

    System.out.println("배열 numArr3[0] : " + numArr3[0]);
    System.out.println("배열 numArr3[4] : " + numArr3[4]);


    System.out.println("\n ----- 배열의 기본 값 ----- \n");

    byte bVal;
    int iVal;
    
//    초기화되지 않은 변수를 사용하기 때문에 오류가 발생함
//    System.out.println("byte 타입의 변수 bVal : " + bVal);
//    System.out.println("int 타입의 변수 iVal : " + iVal);
    
    byte[] bArr = new byte[2];
    int[] iArr = new int[2];
    double[] dArr = new double[2];
    boolean[] boArr = new boolean[2];
    String[] sArr = new String[2];

    System.out.println("byte 타입의 배열 bArr의 0번 index : " + bArr[0]);
    System.out.println("int 타입의 배열 iArr의 0번 index : " + iArr[0]);
    System.out.println("double 타입의 배열 dArr의 0번 index : " + dArr[0]);
    System.out.println("boolean 타입의 배열 boArr의 0번 index : " + boArr[0]);
    System.out.println("String 타입의 배열 sArr의 0번 index : " + sArr[0]);

    System.out.println("\n ----- 배열의 길이 -----\n");

    System.out.println("배열 bArr의 길이 : " + bArr.length);
    System.out.println("배열 numArr1의 길이 : " + numArr1.length);

//    numArr1.length = 10; // length 는 읽기 전용임
  }
}










