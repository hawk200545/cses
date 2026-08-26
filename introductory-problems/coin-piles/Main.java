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

    int nextInt() { return Integer.parseInt(next()); }
    long nextLong() { return Long.parseLong(next()); }
    double nextDouble() { return Double.parseDouble(next()); }
  }

  public static void main(String[] args) {
    FastReader in = new FastReader();
    PrintWriter out = new PrintWriter(System.out);
    
    // Write your solution here
    int t = in.nextInt();
    while(t-- > 0){
      long a = in.nextLong();
      long b = in.nextLong();
      long c = (a%3) + (b%3);
      boolean can = false;
      if(a<=b){
        if(2*a >= b) can = true;
      }
      else {
        if(2*b >= a) can = true;
      }
      if( can && c%3 == 0) out.println("YES");
      else out.println("NO");
    }
    out.flush();
  }
}
