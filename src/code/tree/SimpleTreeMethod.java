package code.tree;

import java.util.Iterator;

public interface SimpleTreeMethod<K extends Comparable<K>, V> {
    boolean isEmpty();
    V findMin();
    boolean isContain(K key);
}
