class Solution {
    public ListNode middleNode(ListNode head) {
        int cnt = 0;
        List<ListNode> arrlist = new ArrayList<ListNode>();
        while(head!=null){
            cnt += 1;
            arrlist.add(head);
            head = head.next;
        }
        //System.out.println("Count : "+ cnt);
        //System.out.println("ArrayList = " + arrlist);
        //for(int i = cnt/2; i<cnt; i++){
        //    arr = arrlist.toArray(arr);
        //}

        return arrlist.get(cnt/2);
    }
}

/* 
class Solution {
    public ListNode middleNode(ListNode head) {
        int len=0;

        ListNode temp = head;
        //Calculating length of the linked list
        while(temp!=null){
            temp = temp.next;
            len++;
        }
        //finding middle of linked list
        len = len/2;
        ListNode currentNode = head;
        // iterate till length of linked list becomes 0
        while(len>0){
            currentNode = currentNode.next; //shifting head forward
            len--; //reducing length
        }
        return currentNode; //node at which length becomes 0, is middle node
    }
}
 */

/*
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
*/ 