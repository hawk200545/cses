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

  private static int solve(int n){
    if(n == 0) return 0;
    return n/5 + solve(n/5);
  }
  public static void main(String[] args) {
    FastReader in = new FastReader();
    PrintWriter out = new PrintWriter(System.out);
    
    // Write your solution here
    int n = in.nextInt();
    out.print(solve(n));
    out.flush();
  }
}
