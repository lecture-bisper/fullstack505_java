public class StringStack extends StackClass{
//  스택 구조로 사용할 배열
  private String[] stack;
//  스택에 쌓여있는 데이터의 크기(높이)
  private int count;

//  생성자, 객체 생성 시 매개변수로 스택의 크기를 결정
  public StringStack(int index) {
    stack = new String[index]; // 스택 크기 지정
    count = 0; // 스택의 높이를 0으로 초기화
  }

//  스택에 저장된 데이터의 마지막 위치 출력
  @Override
  int length() {
    return count;
  }

//  스택에 저장된 가장 마지막 데이터를 출력
  @Override
  String pop() {
//    스택의 높이가 0일 경우 저장된 데이터 없음
    if (count == 0) {
      return null;
    }
    count--; // 스택 높이를 1 낮춤
    return stack[count];
  }

//  스택의 마지막 위치에 데이터를 저장
//  스택의 최대 크기에 도달 시 더이상 데이터를 쌓을 수 없음(false)
  @Override
  boolean push(String ob) {
//    스택의 높이와 스택 구조로 사용하는 배열의 크기가 같으면 더이상 데이터를 추가할 수 없으므로 false를 출력
    if (count == stack.length) {
      return false;
    }

//    스택 구조로 사용하는 배열에 데이터를 추가
    stack[count++] = ob;

//    정상적으로 데이터를 저장했다는 의미로 true 출력
    return true;
  }
}
