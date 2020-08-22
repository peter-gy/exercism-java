import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        List<Character> charactersToConsider = IntStream.range(0, phrase.length())
                .mapToObj(i -> phrase.toLowerCase().charAt(i))
                .filter(character -> character != ' ' && character != '-')
                .collect(Collectors.toList());

        return charactersToConsider.size() == new HashSet<>(charactersToConsider).size();
    }

}
