import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
  static class FastReader {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer("");

    String next() {
      while (!st.hasMoreTokens()) {
        try {
          String line = br.readLine();
          if (line == null) return null;
          st = new StringTokenizer(line);
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    @Override
    public String toString() {
      return "FastReader [br=" + br + ", st=" + st + ", nextInt()=" + nextInt() + ", nextLong()=" + nextLong()
          + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    }

    int nextInt() { return Integer.parseInt(next()); }
    long nextLong() { return Long.parseLong(next()); }
  }

  public static void main(String[] args) {
    FastReader in = new FastReader();
    PrintWriter out = new PrintWriter(System.out);
    
    // Write your solution here
    int n = in.nextInt();
    for (int i = 0; i < n; i++) {
      long x = in.nextLong();
      long y = in.nextLong();
      long ans = 0;
      if(x <= y){
          if((y&1) == 1) ans = (y*y) - (x-1);
          else ans = (y-1) * (y-1) + x;
      }
      else {
        if((x&1) == 0) ans = (x*x) - (y-1);
        else ans = (x-1) * (x-1) + y;
      }
      out.println(ans);
    }
    
    out.flush();
  }
}
