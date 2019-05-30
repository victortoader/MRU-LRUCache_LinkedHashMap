import java.util.LinkedHashMap;

public class LRUCache extends AbstractCache {
    public LRUCache(int size) {
        super(size, new LinkedHashMap(size, 0.8f, false));
    }
    public void put(Object key, Object val) {
        this.cacheImplemenation.put(key, val);
    }

    public Object get(Object key) {
        return this.cacheImplemenation.get(key);
    }
}
