package Task5;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StringDecomposer {

    public Set<Character> decomposeStrings(List<String> strings) {
        Set<Character> decomposedStrings = new HashSet<>();
        strings.
                forEach(s -> decomposedStrings.addAll(convertStringToCharList(s.toUpperCase())));

        return decomposedStrings;
    }

    public List<Character> convertStringToCharList(String string){
        return string
                .chars()
                .mapToObj(c -> (char)c )
                .collect(Collectors.toList());
    }
}
