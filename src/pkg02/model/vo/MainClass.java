package pkg02.model.vo;

public class MainClass {
  public static void main(String[] args){
    Car c1 = new Car();
    // c1 인스턴스의 name을 소방차로 설정
    c1.name = "소방차";
    // c1 인스턴스의 name 호출
    System.out.println(c1.name);
  }
}
