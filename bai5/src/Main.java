import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        int randomNumber = randomNumber();
        System.out.println("Số ngẫu nhiên là: " + randomNumber);
        boolean isPrimeNumber = ischeckPrimeNumber(randomNumber);
        if (!isPrimeNumber) {
            System.out.println("Số: " + randomNumber + " không phải là số nguyên tố");
        } else {
            System.out.println("Số: " + randomNumber + " là số nguyên tố");
        }

    }

    static int randomNumber() {
        return ThreadLocalRandom.current().nextInt(1, 1000);
    }

    static boolean ischeckPrimeNumber(int randomNumb) {
        if (randomNumb < 2) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(randomNumb); i++) {
            if (randomNumb % i == 0) {
                return false;
            }
        }
        return true;
    }
}


