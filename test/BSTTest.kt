import bst.BST
import org.junit.Assert.assertEquals
import org.junit.Test

class BSTTest {

    @Test
    fun shouldInsertAtRoot() {
        var bst = BST()
        bst.insertKey(99)
        var rootNode = bst.root
        assertEquals(99, rootNode?.value);
    }

    @Test
    fun shouldInsertAtLeftOfRoot() {
        var bst = BST()
        bst.insertKey(99)
        bst.insertKey(9)
        var rootNode = bst.root
        assertEquals(9, rootNode?.left?.value);
    }

    @Test
    fun shouldInsertAtLeftTreeOfRoot() {
        var bst = BST()
        bst.insertKey(99)
        bst.insertKey(9)
        bst.insertKey(7)
        bst.insertKey(6)
        var rootNode = bst.root
        assertEquals(9, rootNode?.left?.value);
        assertEquals(7, rootNode?.left?.left?.value);
        assertEquals(6, rootNode?.left?.left?.left?.value);
    }

    @Test
    fun shouldInsertAtRightTreeOfRoot() {
        var bst = BST()
        bst.insertKey(99)
        bst.insertKey(101)
        bst.insertKey(102)
        bst.insertKey(103)
        var rootNode = bst.root
        assertEquals(101, rootNode?.right?.value);
        assertEquals(102, rootNode?.right?.right?.value);
        assertEquals(103, rootNode?.right?.right?.right?.value);
    }

    @Test
    fun shouldInsertAtRightOfRoot() {
        var bst = BST()
        bst.insertKey(99)
        bst.insertKey(109)
        var rootNode = bst.root
        assertEquals(109, rootNode?.right?.value);
    }
}
