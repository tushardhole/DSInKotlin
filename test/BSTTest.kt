import bst.BST
import org.junit.Assert.assertEquals
import org.junit.Test

class BSTTest {

    @Test
    fun shouldInsertAtRoot() {
        var bst = BST(99)
        var rootNode = bst.root
        assertEquals(99, rootNode.value);
    }

    @Test
    fun shouldInsertAtLeftOfRoot() {
        var bst = BST(99)
        bst.insertKey(9)
        var rootNode = bst.root
        assertEquals(9, rootNode.left?.value);
    }

    @Test
    fun shouldInsertAtLeftTreeOfRoot() {
        var bst = BST(99)
        bst.insertKey(9)
        bst.insertKey(7)
        bst.insertKey(6)
        var rootNode = bst.root
        assertEquals(9, rootNode.left?.value);
        assertEquals(7, rootNode.left?.left?.value);
        assertEquals(6, rootNode.left?.left?.left?.value);
    }

    @Test
    fun shouldInsertAtRightTreeOfRoot() {
        var bst = BST(99)
        bst.insertKey(101)
        bst.insertKey(102)
        bst.insertKey(103)
        var rootNode = bst.root
        assertEquals(101, rootNode.right?.value);
        assertEquals(102, rootNode.right?.right?.value);
        assertEquals(103, rootNode.right?.right?.right?.value);
    }

    @Test
    fun shouldInsertAtRightOfRoot() {
        var bst = BST(99)
        bst.insertKey(109)
        var rootNode = bst.root
        assertEquals(109, rootNode.right?.value);
    }

    @Test
    fun shouldInsertAtInLeftAndRightSubTree() {
        /*
                     10
                   2    11
                 1  3      12
                            13
*/
        var bst = BST(10)
        bst.insertKey(2)
        bst.insertKey(3)
        bst.insertKey(1)
        bst.insertKey(11)
        bst.insertKey(12)
        bst.insertKey(13)
        var rootNode = bst.root
        assertEquals(10, rootNode.value);

        assertEquals(2, rootNode.left?.value);
        assertEquals(1, rootNode.left?.left?.value);
        assertEquals(3, rootNode.left?.right?.value);

        assertEquals(11, rootNode.right?.value);
        assertEquals(12, rootNode.right?.right?.value);
        assertEquals(13, rootNode.right?.right?.right?.value);
    }

}
