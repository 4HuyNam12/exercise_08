public class PrimeNumber {
    public static boolean isCheckPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void firstTenPrimeNumber(int n) {
        int count = 0;
        System.out.println(n + " số nguyên tố đâu tiên là: ");
        for (int i = 2; count < n; i++) {
            if (PrimeNumber.isCheckPrimeNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
    }
    public static void smaller10PrimeNuber ( int n){
        System.out.println("\nCác số nguyên tố nhỏ hơn 10 là: ");
        for (int i = 2; i <= n; i++) {
            if (PrimeNumber.isCheckPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
}