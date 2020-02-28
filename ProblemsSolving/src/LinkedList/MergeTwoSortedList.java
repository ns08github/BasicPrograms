package LinkedList;

import java.util.ArrayList;

public class MergeTwoSortedList {

    public static void main(String[] args) {
        MergeTwoSortedList sortedList = new MergeTwoSortedList();
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(4);

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(4);

        ListNode finalList = sortedList.mergeTwoLists(list1, list2);
        print(finalList);
    }

    public static ArrayList<Integer> convertListToArray(ListNode l1) {
        ArrayList<Integer> arr = new ArrayList();
        while (l1 != null) {
            arr.add(l1.val);
            l1 = l1.next;
        }
        return arr;
    }

    public static ListNode insert(ListNode head, int num) {
        ListNode temp = head;
        ListNode prev = null;
        while (head != null) {
            // we came to the end point of the list
            if (head.next == null) {
                ListNode node = new ListNode(num);
                if (head.val <= num) {
                    head.next = node;
                } else {
                    if (prev != null) {
                        prev.next = node;
                    }
                    node.next = head;
                }
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
                    prev.next = node;
                    node.next = head;
                    return temp;
                }
            }
            prev = head;
            head = head.next;
        }
        return head;
    }

    public static ListNode insertWithSort(ListNode head, ArrayList<Integer> arr) {
        if (arr.size() > 0) {
            for (Integer n : arr) {
                head = insert(head, n);
                //print(head);
            }
        }
        return head;
    }

    public static void print(ListNode head) {
        System.out.println();
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ArrayList<Integer> list = convertListToArray(l1);
        if (l2 == null) {
            return l1;
        }
        return insertWithSort(l2, list);
    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
