public class SingletonEx {
  public static void main(String[] args) {
//    Singleton obj1 = new Singleton();
//    Singleton obj2 = new Singleton();

    Singleton obj1 = Singleton.getInstance();
    Singleton obj2 = Singleton.getInstance();

    if (obj1 == obj2) {
      System.out.println("obj1과 obj2는 같은 객체입니다.");
    }
    else {
      System.out.println("obj1과 obj2는 다른 객체입니다.");
    }
  }
}
