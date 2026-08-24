import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    while(n!=1){
      System.out.print(n + " ");
      if((n&1) == 0) n /= 2;
      else n = n*3 + 1;
    }
    System.out.print(1 + " ");
    sc.close();
  }
}
