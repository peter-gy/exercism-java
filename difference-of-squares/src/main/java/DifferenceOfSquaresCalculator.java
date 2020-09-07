import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = IntStream.range(1, input + 1).sum();
        return sum * sum;
    }

    int computeSumOfSquaresTo(int input) {
        return IntStream.range(1, input + 1).map(i -> i*i).sum();
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
