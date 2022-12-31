package section1.collection;

import java.util.HashMap;
import java.util.List;

public class GetElementOfListEntry {
    public String getElementOfListEntry(HashMap<String, List<String>> hashMap, String key, int index) {
        if (!hashMap.containsKey(key)) {
            return null;
        }
        List<String> valueList = hashMap.get(key);
        if (index < 0 || index >= valueList.size()) {
            return null;
        }
        return valueList.get(index);
    }
}
