import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int prev = 0;
    long change = 0;
    for(int i = 0;i<n;i++){
        int curr = sc.nextInt();
        change += (prev > curr) ? prev-curr : 0;
        prev = (prev>curr) ? prev : curr;
    }
    System.out.println(change);
    sc.close();
  }
  
}
