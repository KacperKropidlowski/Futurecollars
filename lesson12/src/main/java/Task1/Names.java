package Task1;

import java.util.*;

public class Names {
    public static void main(String[] args) {

        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("Anna");
        namesArrayList.add("Katarzyna");
        namesArrayList.add("Tymon");
        namesArrayList.add("Tadeusz");
        namesArrayList.add("Anna");
        namesArrayList.add("Karolina");
        namesArrayList.add("Dorota");
        namesArrayList.add("Piotr");

        Set<String> namesSet = new HashSet<>();
        namesSet.add("Anna");
        namesSet.add("Katarzyna");
        namesSet.add("Tymon");
        namesSet.add("Tadeusz");
        namesSet.add("Anna");
        namesSet.add("Karolina");
        namesSet.add("Dorota");
        namesSet.add("Piotr");
        System.out.println("Lista bez duplikatów: " + namesSet);

        List<String> reverseNameList = new ArrayList<>();
        ListIterator<String> iterator = namesArrayList.listIterator();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        iterator.next();
        while (iterator.hasPrevious()) {
            reverseNameList.add(iterator.previous());
        }
        System.out.println("Elementy w odwrotnej kolejności: " + reverseNameList);

        System.out.println("Elementy po zmianie: Anna -> Joanna: \n" + resetElement(namesArrayList, "Anna", "Joanna"));

    }

    public static ArrayList resetElement(ArrayList<String> arrayList, String elementBefore, String elementAfter) {
        ListIterator<String> iterator = arrayList.listIterator();
        ArrayList resetElementArrayList = new ArrayList<>();
        while (iterator.hasNext()) {
            if (iterator.next().equals(elementBefore)) {
                resetElementArrayList.add(elementAfter);
            } resetElementArrayList.add(iterator.next());
        }
        return resetElementArrayList;
    }
}
