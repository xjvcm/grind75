package easy.twosum;

public class Entry {
    private int key;
    private int value;
    private Entry next;

    public Entry(final int KEY, final int VALUE) {
        this.key = KEY;
        this.value = VALUE;
        this.next = null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(final Integer KEY) {
        this.key = KEY;
    }
}
