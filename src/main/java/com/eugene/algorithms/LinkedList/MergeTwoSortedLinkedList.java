package main.java.com.eugene.algorithms.LinkedList;


public class MergeTwoSortedLinkedList {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode();

        ListNode list1Head = list1;
        ListNode list2Head = list2;
        ListNode mergedHead = mergedList;
        while(list1Head != null && list2Head != null){
            if(list1Head.val < list2Head.val){
                mergedHead.next = list1Head;
                list1Head = list1Head.next;
                mergedHead =  mergedHead.next;
            } else {
                mergedHead.next = list2Head;
                list2Head = list2Head.next;
                mergedHead =  mergedHead.next;
            }
        }

        if (list1Head != null){
            mergedHead.next = list1Head;
        } else {
            mergedHead.next = list2Head;
        }

        return mergedList.next;
    }

    public static void main(String[] args){
        ListNode a3 = new ListNode(4);
        ListNode a2 = new ListNode(2, a3);
        ListNode a1 = new ListNode(1, a2);

        ListNode b3 = new ListNode(4);
        ListNode b2 = new ListNode(3, b3);
        ListNode b1 = new ListNode(1, b2);

        ListNode mergedList = mergeTwoLists(a1,b1);
        ListNode head = mergedList;
        while(head.next !=null){
            head = head.next;
            System.out.println(head.val);
        }

    }
}
