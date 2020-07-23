package util;

import java.util.HashMap;

/**
 * This is a generic thing used for easier production of HashMaps.
 * @param <T> The type. Can be a slottype, a resource, or any other similar thing.
 */
public class DoubleSet<T> {
    public static int total;
    public int amt;
    T type;
    public DoubleSet(T type, int amt) {
        this.type = type;
        this.amt = amt;
    }
    public static <V> HashMap<V, Integer> generate(DoubleSet... sets) {
        HashMap<V, Integer> tbr = new HashMap<V, Integer>();
        for (DoubleSet set : sets) {
            tbr.put((V)set.type, set.amt);
        }
        total++;
        System.out.println(total);
        return tbr;
    }
    public static <T> DoubleSet<T> make(T e1, int e2) {
        return new DoubleSet<T>(e1, e2);
    }

}
