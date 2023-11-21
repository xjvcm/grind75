package easy.twosum;

public class SimpleHashTable<K, V> {
    private static class Entry<K, V> {
        final K key;
        V value;
        Entry<K, V> next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private Entry<K, V>[] table;
    private int capacity;
    private int size;

    @SuppressWarnings("unchecked")
    public SimpleHashTable(int capacity) {
        this.capacity = capacity;
        this.table = new Entry[capacity];
        this.size = 0;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        Entry<K, V> newEntry = new Entry<>(key, value);
        if (table[index] == null) {
            table[index] = newEntry;
        } else {
            Entry<K, V> current = table[index];
            while (current.next != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            if (current.key.equals(key)) {
                current.value = value;
            } else {
                current.next = newEntry;
            }
        }
        size++;
    }

    public V get(K key) {
        int index = getIndex(key);
        Entry<K, V> entry = table[index];
        while (entry != null) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
            entry = entry.next;
        }
        return null;
    }

//    public V remove(K key) {
//        int index = getIndex(key);
//        Entry<K, V> previous = null;
//        Entry<K, V> current = table[index];
//
//        while (current != null) {
//            if (current.key.equals(key)) {
//                if (previous == null) {
//                    table[index] = current.next;
//                } else {
//                    previous.next = current.next;
//                }
//                size--;
//                return current.value;
//            }
//            previous = current;
//            current = current.next;
//        }
//        return null;
//    }

//    public int size() {
//        return size;
//    }

    public boolean containsKey(K key) {
        int index = getIndex(key);
        Entry<K, V> entry = table[index];
        while (entry != null) {
            if (entry.key.equals(key)) {
                return true;
            }
            entry = entry.next;
        }
        return false;
    }

    private int getIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode) % capacity;
    }

//    Method to display the hash table
//    public void display() {
//        for (int i = 0; i < capacity; i++) {
//            System.out.print("Bucket " + i + ": ");
//            Entry<K, V> entry = table[i];
//            while (entry != null) {
//                System.out.print("[" + entry.key + "=" + entry.value + "] ");
//                entry = entry.next;
//            }
//            System.out.println();
//        }
//    }
}

