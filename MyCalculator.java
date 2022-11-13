import java.util.*;

class MyCalculator implements AdvancedArithmetic {
    
    public int divisor_sum(int n) {
        if (n <= 1) { return n; }

        int res = n + 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                res += i;
            }
        }

        return res;
    }
}
