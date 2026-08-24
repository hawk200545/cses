import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    int ans = 0;
    for(int i =0;i<n-1;i++){
      int k = sc.nextInt();
      ans ^= (i+1);
      ans ^= k;
    }
    ans ^= n;
    System.out.print(ans); 
  }
}
