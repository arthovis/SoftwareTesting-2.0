package service;

public class CalculatorService {

    public int sum(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Fuck off, cap de vita furajata!");
        }

        if (x == 0 && y == 0) {
            return -1;
        }

        if (x == 1 && y == 1) {
            return -1;
        }

        if (x == 2 && y == 2) {
            return -2;
        }

        return x + y;
    }
}
