public class StringStack extends StackClass{
  private String[] stack;
  private int count;

  public StringStack(int index) {
    stack = new String[index];
    count = 0;
  }

  @Override
  int length() {
    return count;
  }

  @Override
  String pop() {
    if (count == 0) {
      return null;
    }
    count--;
    return stack[count];
  }

  @Override
  boolean push(String ob) {
    if (count == stack.length) {
      return false;
    }

    stack[count++] = ob;

    return true;
  }
}
