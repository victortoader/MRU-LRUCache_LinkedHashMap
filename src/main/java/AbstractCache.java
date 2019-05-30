import java.util.HashMap;

public abstract class AbstractCache implements ICache {

    int cacheSize;
    HashMap cacheImplemenation;


    public AbstractCache(int cacheSize, HashMap cacheImplemenation) {
        this.cacheSize = cacheSize;
        this.cacheImplemenation = cacheImplemenation;
    }

    public abstract void put(Object key, Object val);

    public abstract Object get(Object key);



}
