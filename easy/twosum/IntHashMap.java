/**
 * This is a custom implementation of the HashMap data structure.
 *
 * @author Jonathan Manzano
 * @version "%I%, %G%"
 */
package easy.twosum;

public class IntHashMap {
    private EntryLinkedList[] table;
    private final int CAPACITY;

    public IntHashMap(final int CAPACITY) {
        this.CAPACITY = CAPACITY;
    }

    public void chainedHashInsert(final int KEY, int VALUE) {
        Entry newEntry = new Entry(KEY, VALUE);
        table[hash(KEY)].listPrepend(newEntry);
    }

    public boolean chainedHashSearch(final int KEY) {
        return listS
    }

    // Hash function
    private int hash(final int KEY) {
        return KEY % CAPACITY;
    }
}
