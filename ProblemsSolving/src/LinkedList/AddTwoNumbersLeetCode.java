package LinkedList;

/*
*
* You are given two non-empty linked lists representing two non-negative integers.
* The digits are stored in reverse order and each of their nodes contain a single digit.
* Add the two numbers and return it as a linked list.
* You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
*
* */
public class AddTwoNumbersLeetCode {
    ListNode node;

    public static void main(String[] args) {
        AddTwoNumbersLeetCode obj = new AddTwoNumbersLeetCode();
        ListNode list1 = new ListNode(9);
//        list1.next = new ListNode(4);
//        list1.next.next = new ListNode(3);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(9);
        list2.next.next = new ListNode(9);
        list2.next.next.next = new ListNode(9);
        list2.next.next.next.next = new ListNode(9);
        list2.next.next.next.next.next = new ListNode(9);
        list2.next.next.next.next.next.next = new ListNode(9);
        list2.next.next.next.next.next.next.next = new ListNode(9);
        list2.next.next.next.next.next.next.next.next = new ListNode(9);
        list2.next.next.next.next.next.next.next.next.next = new ListNode(9);

        ListNode finalList = obj.addTwoNumbers(list1, list2);
        obj.print(finalList);

    }

    public static ListNode insert(ListNode list, int i) {
        if (list == null) {
            list = new ListNode(i);
            return list;
        } else {
            list.next = insert(list.next, i);
        }
        return list;
    }

    public void print(ListNode list) {
        while (list != null) {
            System.out.print(list.val);
            list = list.next;
        }
    }

    public long getListNumber(ListNode listNode, int i) {
        long num = 0;
        while (listNode != null) {
            num = num + listNode.val * (long)Math.pow(10, i);
            System.out.println(listNode.val+"-"+Math.pow(10,i)+" inside"+num);
            listNode = listNode.next;
            i++;
        }
        System.out.println("outside"+num);
        return num;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode finalList = null;

        long sum = getListNumber(l1, 0) + getListNumber(l2, 0);
        long rem = 0;
        if (sum == 0) {
            return new ListNode(0);
        } else {
            while (sum > 0) {
                rem = sum % 10;
                sum = sum / 10;
                finalList = insert(finalList, (int) rem);
            }
        }
        return finalList;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
