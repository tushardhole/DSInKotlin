package linkedlist;

/**
 * Given a singly linked list, remove all the nodes which have a greater value on right side.
 * Example:
 * The list 12->15->10->11->5->6->2->3->NULL
 * should be changed to 15->11->6->3->NULL.
 * Note that 12, 10, 5 and 2 have been deleted
 * because there is a greater value on the right side.
 * When we examine 12, we see that after 12 there is
 * one node with value greater than 12 (i.e. 15),
 * so we delete 12.
 * When we examine 15, we find no node after 15
 * that has value greater than 15
 * so we keep this node.
 * When we go like this, we get 15->6->3
 */
public class RemoveNodes {

  public static void main(String[] args) {
    Node eight = new Node(3, null);
    Node seventh = new Node(2, null);
    Node six = new Node(6, null);
    Node five = new Node(5, null);
    Node four = new Node(11, null);
    Node three = new Node(10, null);
    Node two = new Node(15, null);
    Node one = new Node(12, null);

    LinkedList ll = new LinkedList();
    ll.add(one);
    ll.add(two);
    ll.add(three);
    ll.add(four);
    ll.add(five);
    ll.add(six);
    ll.add(seventh);
    ll.add(eight);

    Node right = ll.get(1);
    Node left = ll.get(0);
    Node previous = null;

    do {
      if (left.getValue() < right.getValue()) {
        if (ll.getHead() == left) {
          ll.setHead(right);
          left.setNext(null);
          left = right;
          right = right.getNext();
          continue;
        } else {
          previous.setNext(right);
          left.setNext(null);
        }
      }
      previous = left;
      left = right;
      right = right.getNext();
    } while (left.getNext() != null);

    System.out.println(ll);
  }
}
