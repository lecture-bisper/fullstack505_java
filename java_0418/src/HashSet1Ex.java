import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1Ex {
  public static void main(String[] args) {
    Set<String> set = new HashSet<>();

    set.add("Java");
    set.add("JDBC");
    set.add("Servlet/JSP");
    set.add("Java");
    set.add("mybatis");

    int size = set.size();
    System.out.println("총 크기 : " + size);

    Iterator<String> iter = set.iterator();

//    hasNext() : 지정한 객체 다음 데이터가 있는지 확인
//    next() : 다음 데이터 가져오기
    while (iter.hasNext()) {
      String element = iter.next();
      System.out.println("\t" + element);
    }

    set.remove("mybatis");
    set.remove("JDBC");

    size = set.size();
    System.out.println("총 크기 : " + size);

    for (String element : set) {
      System.out.println("\t" + element);
    }

    set.clear();

    if (set.isEmpty()) {
      System.out.println("비어 있음");
    }
  }
}
