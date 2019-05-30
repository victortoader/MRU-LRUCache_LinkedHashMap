import java.util.LinkedHashMap;

public class MRUCache extends AbstractCache {
    public MRUCache(int size) {
        super(size, new LinkedHashMap(size, 0.9f, true));
    }
    public void put(Object key, Object val) {
        this.cacheImplemenation.put(key, val);
    }

    public Object get(Object key) {
        return this.cacheImplemenation.get(key);
    }
}
