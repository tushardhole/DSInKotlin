package bst

class Node {
    var left: Node? = null
    var right: Node? = null
    var value: Int

    constructor(left: Node?, right: Node?, value: Int) {
        this.left = left
        this.right = right
        this.value = value
    }

    constructor(value: Int) {
        this.value = value
    }
}
