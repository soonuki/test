package pkg01;

public class MainClass {
  public static void main(String[] args){
    // 참조 변수 선언
    Car c1;
    // 객체 생성
    // 객체의 주소를 참조 변수에 저장
    c1 = new Car();
    // 동시 진행 가능
    Car c2 = new Car();
    String str = new String();
  }
}
