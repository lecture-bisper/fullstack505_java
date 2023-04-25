import java.util.TreeSet;

public class TreeSetEx {
  public static void main(String[] args) {
    TreeSet<Integer> scores = new TreeSet<Integer>();

//    add(데이터) : 데이터 추가
//    remove(데이터) : 데이터 삭제
//    clear() : 모든 데이터 삭제
//    size() : 저장된 데이터의 수 출력
//    isEmpty() : 트리셋이 비었는지 확인
//    first() : 최소값 출력
//    last() : 최대값 출력
//    higher(데이터) : 입력값보다 큰 데이터 중 최소값 출력, 없으면 null
//    lower(데이터) : 입력값보다 작은 데이터 중 최대값 출력, 없으면 null
//    iterator() : 트리셋의 데이터를 반복자 컬렉션으로 출력
//    floor(데이터) : 입력값과 같거나 작은 데이터 중 최대값을 출력
//    ceiling(데이터) : 입력값과 같거나 큰 데이터 중 최소값을 출력
//    pollFirst() : 최소값을 출력하고 트리셋에서 제거
//    pollLast() : 최대값을 출력하고 트리셋에서 제거
//    descendingIterator() : 내림차순으로 정렬된 Iterator를 출력
//    headSet(데이터, 포함여부) : 입력값보다 낮은 값을 출력, 해당 객체를 포함할지 여부 지정
//    tailSet(데이터, 포함여부) : 입력값보다 높은 값을 출력, 해당 객체를 포함할지 여부 지정
//    subSet(시작, 시작포함, 종료, 종료포함) : 시작 범위와 종료 범위 사이의 데이터를 출력, 해당 객체를 포함할지 여부 지정
    scores.add(87);
    scores.add(98);
    scores.add(75);
    scores.add(95);
    scores.add(80);

    Integer score = null;

    score = scores.first();
    System.out.println("가장 낮은 점수 : " + score);

    score = scores.last();
    System.out.println("가장 높은 점수 : " + score);

    score = scores.lower(95);
    System.out.println("95점 아래 점수 : " + score);

    score = scores.higher(95);
    System.out.println("95점 위의 점수 : " + score);

    score = scores.floor(95);
    System.out.println("95점 이거나 바로 아래 점수 : " + score);

    score = scores.ceiling(85);
    System.out.println("85점 이거나 바로 위의 점수 : " + score);

    while (!scores.isEmpty()) {
      score = scores.pollFirst();
      System.out.println(score + "(남은 객체 수 : " + scores.size() + ")");
    }
  }
}
