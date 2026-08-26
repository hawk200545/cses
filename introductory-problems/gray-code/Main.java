import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
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
  public static ArrayList<String> grayCode(int n){
    if(n == 1) {
      ArrayList<String> arr = new ArrayList<>();
      arr.add("0");
      arr.add("1");
      return arr;
    }
    else {
      ArrayList<String> arr = grayCode(n-1);
      for (int i = arr.size()-1; i > -1;  i--) {
        arr.add(arr.get(i));
      }
      for (int i = 0; i < arr.size(); i++) {
        if(i < arr.size()/2) arr.set(i, "0" + arr.get(i));
        else arr.set(i, "1" + arr.get(i));
      }
      return arr;
    }
  }
  public static void main(String[] args) {
    FastReader in = new FastReader();
    PrintWriter out = new PrintWriter(System.out);
    
    // Write your solution here
    int n = in.nextInt();
    ArrayList<String> ans = grayCode(n);
    for(String s : ans) {
      out.println(s);
    }
    
    out.flush();
  }
}
