import java.util.Arrays;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;

class Acronym {

    private final String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        return Arrays.stream(phrase.replaceAll("[^a-zA-Z -]", "").split("[ |-]"))
                .filter(not(String::isEmpty))
                .map(s -> String.valueOf(s.charAt(0)).toUpperCase())
                .collect(Collectors.joining(""));
    }

}
