public class Main {
  public static void main(String[] args) {
    System.out.println("=== 7단 ===");
    for(int i = 1; i <= 9 ; i = i +1){
      System.out.println("7 *" + i + " = "+7*i);
    }
    int i = 1;
    for(; i <= 5; i++){
      System.out.println(i);
    }
    for( ; ; i++ ){
      System.out.println(i);
      if(i>=10){
        break;
      }
    }
    String str = "Hello, world!";

    char[] charArrayy = str.toCharArray();

    for(int j = 0 ; j < charArrayy.length ; j++){
      System.out.println(i + " : "+charArrayy[j]);
    }
    for(int j = 0 ; j < str.length() ; j++){
      System.out.println("charAt("+j+") : " + str.charAt(j));
    }
  }
}
