import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PangramChecker {

    private static final String alphabet = IntStream.range(97, 123)
            .mapToObj(i -> "" + (char)i)
            .collect(Collectors.joining());

    public boolean isPangram(String input) {
        final String lowerCasedInput = input.toLowerCase();
        return alphabet.chars().allMatch(value -> lowerCasedInput.contains("" + (char)value));
    }

}
