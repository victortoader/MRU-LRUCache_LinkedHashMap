import java.util.ArrayList;

public class LRUCacheTest {

    public static void main(String args[])
    {

    AbstractCache lruCache = new LRUCache(3);
    lruCache.put("yahoo","www.Yahoo.com");
    lruCache.put("google","www.google.com");
    lruCache.put("fb","www.facebook.com");

    lruCache.get("yahoo");
    lruCache.toString();
        System.out.println("- Least Recently Used Cache Test - (keeps recently used items near the top of cache)");

        ArrayList<String> listOfKeys = new ArrayList<String>(lruCache.cacheImplemenation.keySet());
        for (String a: listOfKeys) {
            System.out.println(lruCache.cacheImplemenation.get(a));
        }
            
    }
}
