import linkedlist.LinkedList
import linkedlist.Node
import org.junit.Assert.assertEquals
import org.junit.Test

class LinkedListTest {

    @Test
    fun shouldAddElementToLinkedList() {
        var ll = LinkedList()
        var firstNode = Node(1, null)
        ll.add(firstNode)
        assertEquals(1, ll.get(0)?.value)
        assertEquals(1, ll.size())
    }

    @Test
    fun shouldAddElementToStartOfLinkedList() {
        var ll = LinkedList()
        var firstNode = Node(1, null)
        var secondNode = Node(2, null)
        var newFirstNode = Node(99, null)
        ll.add(firstNode)
        ll.add(secondNode)
        ll.addAtStart(newFirstNode)
        assertEquals(99, ll.get(0)?.value)
        assertEquals(1, ll.get(1)?.value)
        assertEquals(2, ll.get(2)?.value)
        assertEquals(3, ll.size())
    }

    @Test
    fun shouldAddElementToEndOfLinkedList() {
        var ll = LinkedList()
        var firstNode = Node(1, null)
        var secondNode = Node(2, null)
        var lastNode = Node(99, null)
        ll.add(firstNode)
        ll.add(secondNode)
        ll.addAtEnd(lastNode)
        assertEquals(1, ll.get(0)?.value)
        assertEquals(2, ll.get(1)?.value)
        assertEquals(99, ll.get(2)?.value)
        assertEquals(3, ll.size())
    }

    @Test
    fun shouldAddElementAtGivenIndex() {
        var ll = LinkedList()
        var firstNode = Node(1, null)
        var secondNode = Node(2, null)
        var thirdNode = Node(3, null)
        var newNode = Node(99, null)
        ll.add(firstNode)
        ll.add(secondNode)
        ll.addAtEnd(thirdNode)
        var isAdded = ll.addAtIndex(1, newNode);

        assertEquals(1, ll.get(0)?.value);
        assertEquals(99, ll.get(1)?.value);
        assertEquals(2, ll.get(2)?.value);
        assertEquals(3, ll.get(3)?.value);
        assertEquals(4, ll.size());
        assertEquals(true, isAdded);
    }

    @Test
    fun shouldNotAddElementAtInvalidIndexIndex() {
        var ll = LinkedList()
        var firstNode = Node(1, null)
        var secondNode = Node(2, null)
        var thirdNode = Node(3, null)
        var newNode = Node(99, null)
        ll.add(firstNode)
        ll.add(secondNode)
        ll.add(thirdNode)
        var isAdded = ll.addAtIndex(11, newNode);

        assertEquals(1, ll.get(0)?.value);
        assertEquals(2, ll.get(1)?.value);
        assertEquals(3, ll.get(2)?.value);
        assertEquals(3, ll.size());
        assertEquals(false, isAdded);
    }

    @Test
    fun shouldAddElementAtZeroIndexWhenListIsEmpty() {
        var ll = LinkedList()
        var firstNode = Node(1, null)
        ll.addAtIndex(0, firstNode);

        assertEquals(1, ll.get(0)?.value);
        assertEquals(1, ll.size());
    }

    @Test
    fun shouldAddElementAtZeroIndexWhenListIsNotEmpty() {
        var ll = LinkedList()
        var firstNode = Node(1, null)
        var newFirstNode = Node(99, null)
        ll.add(firstNode);
        ll.addAtIndex(0, newFirstNode);

        assertEquals(99, ll.get(0)?.value);
        assertEquals(1, ll.get(1)?.value);
        assertEquals(2, ll.size());
    }

    @Test
    fun shouldDeleteElementAtStart() {
        var ll = LinkedList()
        var firstNode = Node(1, null)
        var secondNode = Node(99, null)
        ll.add(firstNode);
        ll.add(secondNode)

        assertEquals(2, ll.size())
        assertEquals(1, ll.get(0)?.value)
        assertEquals(99, ll.get(1)?.value)
        ll.deleteAtIndex(0)
        assertEquals(1, ll.size())
        assertEquals(99, ll.get(0)?.value)
    }

    @Test
    fun shouldDeleteElementAtEnd() {
        var ll = LinkedList()
        var firstNode = Node(1, null)
        var secondNode = Node(99, null)
        ll.add(firstNode);
        ll.add(secondNode)

        assertEquals(2, ll.size())
        var isDeleted = ll.deleteAtIndex(0)
        assertEquals(1, ll.size())
        assertEquals(true, isDeleted)
    }

    @Test
    fun shouldDeleteElementAtIndex1() {
        var ll = LinkedList()
        var firstNode = Node(1, null)
        var secondNode = Node(2, null)
        var thirdNode = Node(3, null)
        ll.add(firstNode)
        ll.add(secondNode)
        ll.add(thirdNode)

        assertEquals(2, ll.get(1)?.value)
        var isDeleted = ll.deleteAtIndex(1)
        assertEquals(2, ll.size())
        assertEquals(3, ll.get(1)?.value)
        assertEquals(true, isDeleted)
    }

    @Test
    fun shouldDeleteElementAtGivenIndex() {
        var ll = LinkedList()
        var firstNode = Node(1, null)
        var secondNode = Node(2, null)
        var thirdNode = Node(3, null)
        var fourthNode = Node(4, null)
        ll.add(firstNode)
        ll.add(secondNode)
        ll.add(thirdNode)
        ll.add(fourthNode)

        assertEquals(2, ll.get(1)?.value)
        var isDeleted = ll.deleteAtIndex(2)
        assertEquals(3, ll.size())
        assertEquals(4, ll.get(2)?.value)
        assertEquals(true, isDeleted)
    }

    @Test
    fun shouldGetElementAtGivenIndex() {
        var ll = LinkedList()
        var firstNode = Node(1, null)
        var secondNode = Node(2, null)
        var thirdNode = Node(3, null)
        var fourthNode = Node(4, null)
        ll.add(firstNode)
        ll.add(secondNode)
        ll.add(thirdNode)
        ll.add(fourthNode)

        assertEquals(1, ll.get(0)?.value)
        assertEquals(2, ll.get(1)?.value)
        assertEquals(3, ll.get(2)?.value)
        assertEquals(4, ll.get(3)?.value)
    }


    @Test
    fun shouldPrintLinkedList() {
        var ll = LinkedList()
        var firstNode = Node(1, null)
        var secondNode = Node(2, null)
        var thirdNode = Node(3, null)
        var fourthNode = Node(4, null)
        ll.add(firstNode)
        ll.add(secondNode)
        ll.add(thirdNode)
        ll.add(fourthNode)

        assertEquals("[1,2,3,4]", ll.toString());
    }

    @Test
    fun shouldPrintEmptyLinkedList() {
        var ll = LinkedList()
        assertEquals("[]", ll.toString());
    }
}