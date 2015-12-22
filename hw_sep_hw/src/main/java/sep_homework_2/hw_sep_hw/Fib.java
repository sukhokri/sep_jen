package sep_homework_2.hw_sep_hw;

public class Fib {

    public int count(int n) {
        if (n < 2) {
            return n;
        } else {
            return count(n - 1) + count(n - 2);
        }
    }
}
