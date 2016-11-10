import java.io.BufferedReader;
import java.io.InputStreamReader;

class PrimeGenerator {

  public static boolean checkPrime(int n) {
    if(n < 2) {
      return false;
    }
    int sqrt = (int)Math.sqrt(n);
    for (int i = 2; i <= sqrt; i++) {
      if(n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void printPrimes(int lower, int higher) {
    for(int i = lower; i <= higher; i++) {
      if(checkPrime(i)) {
        System.out.println(i);
      }
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCases = Integer.parseInt(br.readLine());
    while(testCases-- > 0) {
      int lower = Integer.parseInt(br.readLine());
      int higher = Integer.parseInt(br.readLine());
      printPrimes(lower, higher);
      System.out.println();
    }
  }
}
