public class ForEach {
  public static void main(String[] args){
    int[] numbers = {1, 2, 3, 4, 5};
    for(int i = 0 ; i<numbers.length ; i++){
      System.out.println(numbers[i]);
    }
    int[] number = {-62, 107, -12, 89, -35};
    int count = 1;
    for(int num : number){
      if(num>50){
        System.out.println(count+" : "+num);
        // count += count;
        count = count+1;
      }
    }
  }
}
