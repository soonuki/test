package pkg03_method;

public class ParamClass {
    //매개변수가 없는 메소드
    public  void greet(){
      System.out.println("안녕하세요");
    }
    public void add(int a, int b){
      System.out.println(a+b);
    }
    public void printArray(int[] array){
      for(int num : array){
        System.out.println(num+" ");
      }
    }
}
