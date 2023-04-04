public class FloatDoubleEx {
  public static void main(String[] args) {
//    큰 데이터 타입의 데이터를 작은 데이터 타입의 변수에 저장할 수 없음
    double var1 = 3.14; // 실수의 기본 데이터 타입인 double 타입
//    float var2 = 3.14; // double 타입의 데이터 3.14를 float 타입의 변수 var2에 저장하고자 하기 때문에 오류 발생
    float var3 = 3.14F;

//    double 타입은 소수점 18번째자리까지 표현, 19번째 자리에서 반올림
    double var4 = 0.1234567890123456789;
//    float 타입은 소수점 8번째자리까지 표현, 9번째 자리에서 반올림
    float var5 = 0.1234567890123456789F;

    System.out.println("var1 : " + var1);
    System.out.println("var3 : " + var3);
    System.out.println("var4 : " + var4);
    System.out.println("var5 : " + var5);

    int var6 = 3000000;
    double var7 = 3e6;
    float var8 = 3e6F;
    double var9 = 2e-3;

    System.out.println("var6 : " + var6);
    System.out.println("var7 : " + var7);
    System.out.println("var8 : " + var8);
    System.out.println("var9 : " + var9);

  }
}
