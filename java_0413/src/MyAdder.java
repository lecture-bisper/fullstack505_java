public class MyAdder extends AdderClass {

  @Override
  int add(int x, int y) {
    return x + y;
  }

  @Override
  int add(int n) {
    int total = 0;
    for (int i = 1; i <= n; i++) {
      total += i;
    }
    return total;
  }
}
