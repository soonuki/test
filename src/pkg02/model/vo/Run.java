package pkg02.model.vo;

public class Run {
  public static void main(String[] args){
    Car c2 = new Car();
    Car c3 = new Car();
    // 인스턴스 c2의 brand 값 지정
    c2.brand = "Hyundai";
    // 인스턴스 c2와 c3의 brand값 모두 변경
    System.out.println("c2 : "+c2.brand);
    System.out.println("c3 : "+c3.brand);
  }
}
