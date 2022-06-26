package Task2;

import java.util.ArrayList;

public class OwnListClass implements OwnList {

    ArrayList<Integer> ownList = new ArrayList<>();

    @Override
    public int size() {
        return ownList.size();
    }

    @Override
    public boolean isEmpty() {
        return ownList.isEmpty();
    }

    @Override
    public void add(Integer element) {
        ownList.add(element);
    }

    @Override
    public Integer get(int i) {
        return ownList.get(i);
    }

    @Override
    public void add(int index, Integer element) {
        try {
            ownList.add(index, element);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Integer remove(int index) {
        try {
            return ownList.remove(index);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return ownList.remove(index);
    }
}
