package Task1;

import java.util.*;

public class Names {
    public static void main(String[] args) {

        List<String> namesList = new ArrayList<>();
        Collections.addAll(namesList,"Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna", "Karolina", "Dorota", "Piotr");

        Set<String> namesSet = new HashSet<>();
        namesSet.addAll(namesList);
        System.out.println("Lista bez duplikatów: " + namesSet);

        Collections.reverse(namesList);
        System.out.println("Elementy w odwrotnej kolejności: " + namesList);

        Collections.reverse(namesList);
        System.out.println("Elementy po zmianie: Anna -> Joanna: \n" + replaceElement(namesList, "Anna", "Joanna"));

    }

    public static List<String> replaceElement(List<String> inputList, String elementBefore, String elementAfter) {
        while (inputList.contains(elementBefore)) {
            inputList.set(inputList.indexOf(elementBefore), elementAfter);
        }
        return inputList;
    }
}
