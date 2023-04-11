package pack1;

public class I {
  public I() {
    H h = new H();
    h.field1 = 1;
//    접근제한자가 default이므로 동일한 패키지 안에 있는 I 클래스는 H클래스를 사용할 수 있음
    h.field2 = 1;
//    접근제한자가 private으로 설정되어 외부에서 사용 불가
//    h.field3 = 0;

    h.method1();
    h.method2();
//    접근제한자가 private으로 설정되어 외부에서 사용 불가
//    h.method3();
  }
}
