public class Main {
  public static void main(String[] args) {
    long result = 0L;

    for(int i = 0; i < 1000; i++) {
      if (i%3 == 0) {
        result += i;
      } else if (i%5 == 0) {
        result += i;
      }
    }

    System.out.println(result);    
  }
}