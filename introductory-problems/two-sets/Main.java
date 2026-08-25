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

  public static void main(String[] args) {
    FastReader in = new FastReader();
    PrintWriter out = new PrintWriter(System.out);
    ArrayList<Integer> set1 = new ArrayList<>();
    ArrayList<Integer> set2 = new ArrayList<>();
    int n = in.nextInt();
    long tot = 1L * n * (n+1)/2;

    long req = tot/2;

    if((tot&1) == 1){
      out.print("NO");
    }
    else {
      out.println("YES");
      long set1Sum = 0;
      int maxElem = n; 
      boolean[] vis = new boolean[n+1];
      while(set1Sum < req){
        if(set1Sum + maxElem <= req){
          set1Sum += maxElem;
          set1.add(maxElem);
          vis[maxElem--] = true;
        }
        else {
          set1.add((int)(req-set1Sum));
          vis[(int) (req-set1Sum)] = true;
          set1Sum = req;
          break;
        }
      }
      for (int i = 1; i < vis.length; i++) {
        if(!vis[i]) set2.add(i);
      }
      out.println(set1.size());
      for (int b : set1) {
        out.print(b + " "); 
      }
      out.println();
      out.println(set2.size());
      for (int b : set2) {
        out.print(b+ " "); 
      }
    }
    out.flush();
  }
}
