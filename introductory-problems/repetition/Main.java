import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int max = 1;
    int curr = 1;
    char c = s.charAt(0);
    for(int i = 1;i<s.length();i++){
      if(s.charAt(i) == c) curr++;
      else {
        curr = 1;
        c = s.charAt(i);
      }
      max = Math.max(max, curr);
    }
    sc.close();
    System.out.print(max);
  }
  
}
