import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

class TestClass 
{
    static class FastReader 
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
            InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main(String args[] ) throws IOException {
        FastReader in = new FastReader();
        int N = in.nextInt();
        long[] A = new long[N];
        for(int i = 0; i < N; i++) {
            long x = in.nextLong();
            long y = in.nextLong();
            A[i] = (x * x) + (y * y);
        }
        Arrays.sort(A);
        int Q = in.nextInt();
        while(Q-->0) {
            int count = 0;
            long R = in.nextLong();
            int low = 0, high = N, mid = 0;
            while(low < high) {
                mid = (low + high)/2;
                if(Math.sqrt(A[mid]) > R) {
                    high = mid;
                }
                if(Math.sqrt(A[mid]) <= R) {
                    low = mid + 1;
                }
                count = low;
            }
            System.out.println(count);
        }
    }
}
