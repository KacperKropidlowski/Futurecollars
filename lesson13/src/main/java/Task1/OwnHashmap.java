package Task1;

public class OwnHashmap implements OwnMap {

    Entry[][] ownHashMap = new Entry[1000][1000];

    @Override
    public boolean put(String key, String value) {
        int index = Math.abs(key.hashCode() % 1000);
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
        int index = Math.abs(key.hashCode() % 1000);
        for (Entry value : ownHashMap[index]) {
            if (value != null)
                return true;
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public String remove(String key) {
        int index = Math.abs(key.hashCode() % 1000);
        String value = null;
        for (int i = 0; i < ownHashMap[index].length; i++) {
            if (ownHashMap[index][i] != null) {
                value = ownHashMap[index][i].value;
                ownHashMap[index][i] = null;
                break;
            }

        }
        return value;
    }

    @Override
    public String get(String key) {
        int index = Math.abs(key.hashCode() % 1000);
        for (Entry value : ownHashMap[index]) {
            if (value != null && value.key.equals(key)) {
                return value.value;
            }
        }
        return null;
    }
}
