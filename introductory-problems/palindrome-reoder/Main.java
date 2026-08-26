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
    String s = in.next();
    int n = s.length();
    char oddChar  = '\0';
    int[] hs = new int[26];
    for(char c : s.toCharArray()){
      hs[c - 'A']++;
    }
    boolean chance = true;
    for (int i = 0; i < hs.length; i++) {
      if((hs[i]&1) == 1) {
        if(chance){
          oddChar = (char) ('A' + i);
          chance = false;
        }
        else{
          System.out.println("NO SOLUTION");
          System.exit(0);
        }
      }
    }
      for (int j = 0; j < hs.length; j++) {
       for (int j2 = 0; j2 < hs[j]/2; j2++) {
          out.print((char)('A' + j));
        } 
      }
      if((n&1) == 1)out.print(oddChar);
      for (int j = hs.length-1; j > -1; j--) {
       for (int j2 = 0; j2 < hs[j]/2; j2++) {
          out.print((char)('A' + j));
        } 
      }
    out.flush();
  }
}
