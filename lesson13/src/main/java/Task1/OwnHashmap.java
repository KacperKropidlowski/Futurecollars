package Task1;

public class OwnHashmap implements OwnMap {

    private static final int MAX_SIZE = 1000;
    private final Entry[][] ownHashMap = new Entry[MAX_SIZE][MAX_SIZE];

    @Override
    public boolean put(String key, String value) {
        int index = Math.abs(key.hashCode() % MAX_SIZE);
        for (int i = 0; i < ownHashMap[index].length; i++) {
            if (ownHashMap[index][i] == null) {
                ownHashMap[index][i] = new Entry(key, value);
                break;
            } else {
                ownHashMap[index][i] = new Entry(key, value);
            }
        }
        return true;
    }

    @Override
    public boolean containsKey(String key) {
        int index = Math.abs(key.hashCode() % MAX_SIZE);
        for (Entry value : ownHashMap[index]) {
            if (value != null)
                return true;
        }
        return false;
    }

    @Override
    public boolean containsValue(String value) {
        for (Entry[] keys : ownHashMap) {
            for (Entry entry : keys) {
                if (entry.getValue().equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String remove(String key) {
        int index = Math.abs(key.hashCode() % MAX_SIZE);
        String value = null;
        for (int i = 0; i < ownHashMap[index].length; i++) {
            if (ownHashMap[index][i] != null && ownHashMap[index][i].getKey().equals(key)) {
                value = ownHashMap[index][i].getValue();
                ownHashMap[index][i] = null;
                break;
            }

        }
        return value;
    }

    @Override
    public String get(String key) {
        int index = Math.abs(key.hashCode() % MAX_SIZE);
        for (Entry value : ownHashMap[index]) {
            if (value != null && value.getKey().equals(key)) {
                return value.getValue();
            }
        }
        return null;
    }
}
