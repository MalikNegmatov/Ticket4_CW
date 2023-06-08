import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyPool <T> {
    private final Map<T, T> map;
    public MyPool() {
        map = new ConcurrentHashMap<>();
    }

    public T intern(T t) {
        T exist = map.putIfAbsent(t, t);
        return (exist == null) ? t : exist;
    }
    @Override
    public String toString() {
        return "MyPool{" +
                "map=" + map +
                '}';
    }
}