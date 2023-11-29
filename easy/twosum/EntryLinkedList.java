/**
 * This is a custom implementation of the LinkedList data structure. A circular, doubly linked list with a sentinel.
 *
 * @author Jonathan Manzano
 * @version "%I%, %G%"
 */
package easy.twosum;

public class EntryLinkedList {
    private final EntryNode SENTINEL;

    EntryLinkedList() {
        SENTINEL = new EntryNode(null);
        SENTINEL.sentinel = true;
        SENTINEL.next = SENTINEL;
        SENTINEL.prev = SENTINEL;
    }

    public void listPrepend(final Entry KEY) {
        EntryNode newEntryNode = new EntryNode(KEY);
        newEntryNode.next = SENTINEL.next;
        newEntryNode.prev = SENTINEL;
        SENTINEL.next.prev = newEntryNode;
        SENTINEL.next = newEntryNode;
    }

    public void listAppend(final Entry KEY) {
        EntryNode newEntryNode = new EntryNode(KEY);
        EntryNode current = SENTINEL.prev;
        newEntryNode.next = current.next;
        newEntryNode.prev = current;
        current.next.prev = newEntryNode;
        current.next = newEntryNode;
    }

    public boolean listSearch(final int KEY) {
        SENTINEL.key.setKey(KEY);
        EntryNode current = SENTINEL.next;
        while (current.key.getKey() != KEY) {
            current = current.next;
        }

        if (current.sentinel) {
            SENTINEL.key.setKey(null);
        }
    }

    public boolean delete(final Integer KEY) {
        EntryNode current = SENTINEL.next;
        while (current != SENTINEL) {
            if (current.key.getKey() == KEY) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void printList() {
        EntryNode current = SENTINEL.next;
        while (current != SENTINEL) {
            System.out.print(current.key + " ");
            current = current.next;
        }
        System.out.println();
    }

    private static class EntryNode {
        boolean sentinel;
        Entry key;
        EntryNode next;
        EntryNode prev;

        EntryNode(final Entry KEY) {
            key = KEY;
            sentinel = false;
        }
    }
}
