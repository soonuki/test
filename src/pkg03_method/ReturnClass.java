package pkg03_method;

import pkg02.model.vo.Car;

public class ReturnClass {
  public void greet(){
    System.out.println("안녕하세요!");
  }
  public int generateNumber(){
    return 42;
  }
  public int[] createArry(){
    int[] arr = {1,2,3,4,5};
    return arr;
  }
  public Car createCar(){
    return new Car();
  }
}
