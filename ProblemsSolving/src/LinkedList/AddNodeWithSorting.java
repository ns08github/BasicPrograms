package LinkedList;

/*
 * Given linkedlist as 3-4-5;
 * insert 7,2,1;
 *
 * output should be 1-2-3-4-5-7
 * */

public class AddNodeWithSorting {

    public static void main(String[] args) {
        AddNodeWithSorting obj = new AddNodeWithSorting();
        ListNode head = new ListNode(3);
        head.next = new ListNode(4);
        head.next.next = new ListNode(5);
        int[] nums = {7, 2, 1};
        obj.insertWithSort(head, nums);
    }

    public static ListNode insert(ListNode head, int num) {
        ListNode temp=head;
        ListNode prev = null;
        while (head != null) {
            // we came to the end point of the list
            if (head.next == null) {
                head.next = new ListNode(num);
                return temp;
            }
            // found the less or equal number
            else if (head.val >= num) {
                // creating a new node
                ListNode node = new ListNode(num);
                // if prev i.e. it is at the head
                if (prev == null) {
                    node.next = head;
                    return node;
                } else {
                    prev.next=node;
                    node.next = head;
                }
            }
            prev = head;
            head = head.next;
        }
        return head;
    }

    public void insertWithSort(ListNode head, int[] arr) {


        for (Integer n : arr) {
            head = insert(head, n);
        }

        print(head);
    }

    public static void print(ListNode head){
        System.out.println();
        while (head!=null){
            System.out.print(head.val+"->");
            head=head.next;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
