package linkedlist

class LinkedList {

    var head: Node? = null
    private var tail: Node? = null
    private var size: Int = 0;

    fun add(node: Node) {
        addAtEnd(node);
    }

    fun addAtEnd(node: Node) {
        node.next = null
        if (head == null) {
            head = node
            tail = node
            size++
            return
        }
        tail?.next = node
        tail = node
        size++
    }

    fun addAtStart(node: Node) {
        if (head == null) {
            node.next = null
            head = node
            return
        }
        node.next = head;
        head = node
        size++
    }

    fun addAtIndex(index: Int, node: Node): Boolean {
        if (index > size) return false
        node.next = null
        if (index == 0) {
            if (head != null) node.next = head
            head = node
            size++
            return true
        }
        var temp = head
        for (i in 0..index - 1) {
            if (i > 0) {
                temp = temp?.next;
            }
        }
        if (temp != null) {
            node.next = temp.next
            temp.next = node
            size++
        }
        return true
    }

    fun deleteAtIndex(index: Int): Boolean {
        if (head != null && index == 0) {
            head = (head as Node).next
            size--
            return true
        }
        var oneBeforeNodeToBeDeleted = head
        for (i in 0..index - 2) {
            oneBeforeNodeToBeDeleted = oneBeforeNodeToBeDeleted?.next
        }
        oneBeforeNodeToBeDeleted?.next = oneBeforeNodeToBeDeleted?.next?.next
        oneBeforeNodeToBeDeleted?.next?.next = null
        size--
        return true
    }

    fun get(index: Int): Node? {
        var temp: Node? = head
        for (i in 0..index - 1) {
            temp = temp?.next
        }
        return temp
    }

    fun size(): Int {
        return size
    }


    override fun toString(): String {
        if (head == null)
            return "[]";

        var buffer = StringBuffer()
        buffer.append("[")
        var node = head

        while (node?.next != null) {
            buffer.append(node?.value.toString() + ",")
            node = node?.next
        }

        buffer.append(node?.value);

        buffer.append("]")
        return buffer.toString()
    }
}
