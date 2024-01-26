 import java.util.HashSet;

public class HappyNumber {
    public static int nextHappy(int N) {
        int num = N + 1;

        while (!isHappy(num))
            num++;

        return num;
    }

    private static boolean isHappy(int num) {
        HashSet<Integer> seen = new HashSet<>();

        while (true) {
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum += digit * digit;
                num /= 10;
            }

            if (sum == 1)
                return true;
            else if (seen.contains(sum))
                return false;

            seen.add(sum);
            num = sum;
        }
    }

    public static void main(String[] args) {
        int N = 8;
        int nextHappyNum = nextHappy(N);
        System.out.println("Next smallest Happy Number after " + N + " is: " + nextHappyNum);

        N = 10;
        nextHappyNum = nextHappy(N);
        System.out.println("Next smallest Happy Number after " + N + " is: " + nextHappyNum);
    }
}
