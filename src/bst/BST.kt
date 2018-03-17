package bst

class BST {

    var root: Node? = null

    fun insertKey(key: Int) {
        if (root == null) {
            root = Node(key)
            return
        }
        var rootValue = root?.value as Int
        if (key < rootValue) {
            insertToLeftSubTree(root, key)
        }
        if (key > rootValue) {
            insertToLeftRightTree(root, key)
        }
    }

    fun insertToLeftSubTree(root: Node?, key: Int) {
        if (root?.left != null && key < root?.left?.value as Int) {
            insertToLeftSubTree(root?.left, key)
        } else {
            root?.left = Node(key)
        }
    }

    fun insertToLeftRightTree(root: Node?, key: Int) {
        if (root?.right != null && key > root?.right?.value as Int) {
            insertToLeftRightTree(root?.right, key)
        } else {
            root?.right = Node(key)
        }
    }
}
