import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    StringBuilder sb = new StringBuilder();
    if( n < 4 && n != 1){
      System.out.print("NO SOLUTION");
    }else {
      long i =2;
      while(i <= n){
        sb.append(i).append(" ");
        i+=2;
      }
      i = 1;
      while(i <= n){
        sb.append(i).append(" ");
        i+=2;
      }
    }
    System.out.println(sb.toString());
    sc.close();
  }

}
