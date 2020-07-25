public class bai1 {
        public static int gcd(int a, int b){
            int gcd = 1;
            for(int i = 1; i <= a && i <= b; i++)
            {
                if(a%i==0 && b%i==0)
                    gcd  = i;
            }
            return  gcd;
        }
        public static int fibonacci(int n) {
            int f0 = 0;
            int f1 = 1;
            int fn = 1;

            if (n < 0) {
                return -1;
            } else if (n == 0 || n == 1) {
                return n;
            } else {
                for (int i = 2; i < n; i++) {
                    f0 = f1;
                    f1 = fn;
                    fn = f0 + f1;
                }
            }
            return fn;
        }
        public static boolean checkSNT(int n) {
            // so nguyen n < 2 khong phai la so nguyen to
            if (n < 2) {
                return false;
            }
            // check so nguyen to khi n >= 2
            int squareRoot = (int) Math.sqrt(n);
            for (int i = 2; i <= squareRoot; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
        public static void sieveEratosthenes(int n){
            String s = new String();
            for (int i = 1; i <= n; i++)
            {
                if(checkSNT(i)){
                    s+= i +", ";
                }
            }
            System.out.println(s.substring(0,s.length() -2));
        }
        public static void main(String[] args) {
            int a = gcd(2,4);
            System.out.println(a);

            System.out.println(fibonacci(6));
            sieveEratosthenes(100);
        }

}
