/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null ||head.next==null)
            return true;
        ListNode slow,fast;
        slow=fast=head;
    Stack<ListNode> s=new Stack<ListNode>();
    s.push(slow);
    while(fast.next!=null && fast.next.next!=null)
    {
      slow=slow.next;
      fast=fast.next.next;
      s.push(slow);
    }
    if(fast.next==null)
    s.pop();
    ListNode Shalf=slow.next;
    while(Shalf!=null)
    {
      if(s.pop().val !=Shalf.val)
      return false;
      Shalf=Shalf.next;
    }
    return true;  
    }
}
