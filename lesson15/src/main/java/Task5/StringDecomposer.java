package Task5;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StringDecomposer {

    public Set<Character> decomposeStrings(List<String> strings) {
        return strings
                .stream()
                .map(this::convertStringToCharList)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
    }

    private List<Character> convertStringToCharList(String string) {
        return string
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
    }
}
