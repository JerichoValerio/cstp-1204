import java.util.LinkedList;

public class HashDictionary<K, V> {
    private int capacity;
    private int size;
    private LinkedList<Entry<K, V>>[] table;

    public HashDictionary(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void put(K key, V value) {
        int hash = hash(key);
        int index = hash % capacity;
        LinkedList<Entry<K, V>> bucket = table[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        bucket.add(new Entry<>(key, value));
        size++;
        if ((double) size / capacity >= 0.75) {
            resize();
        }
    }

    public V get(K key) {
        int hash = hash(key);
        int index = hash % capacity;
        LinkedList<Entry<K, V>> bucket = table[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public void remove(K key) {
        int hash = hash(key);
        int index = hash % capacity;
        LinkedList<Entry<K, V>> bucket = table[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                bucket.remove(entry);
                size--;
                return;
            }
        }
    }

    private void resize() {
        capacity *= 2;
        LinkedList<Entry<K, V>>[] oldTable = table;
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
        for (LinkedList<Entry<K, V>> bucket : oldTable) {
            for (Entry<K, V> entry : bucket) {
                int hash = hash(entry.key);
                int index = hash % capacity;
                table[index].add(entry);
            }
        }
    }

    private int hash(K key) {
        return key.hashCode() & 0x7FFFFFFF;
    }

    private static class Entry<K, V> {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
