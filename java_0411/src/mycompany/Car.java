package mycompany;

import hyndai.Engine; // 지정한 패키지의 지정한 클래스 1개를 가져오기
import hankook.*; // 지정한 패키지 안의 모든 클래스 가져오기
import kumho.BigWidthTire;
// Tire라는 클래스가 hankook 패키지의 Tire 클래스인지, kumho 패키지의 Tire 클래스인지 알 수 없음
// 서로 다른 패키지의 동일한 이름의 클래스를 동시에 import하여 사용해야 할 경우 많이 사용하는 패키지의 클래스를 import로 가져오고, 사용 빈도가 낮은 패키지의 클래스를 패키지명과 함께 전체 다 입력하는 방식으로 사용해야 함
import hankook.Tire;

public class Car {
  Engine engine = new Engine();
  SnowTire tire1 = new SnowTire();
  BigWidthTire tire2 = new BigWidthTire();

//  import 없이 해당 클래스를 가져오는 방식
//  해당 클래스가 존재하는 패키지명과 클래스를 모두 입력하여 가져오기
  Tire tire3 = new Tire();
  kumho.Tire tire4 = new kumho.Tire();

}
