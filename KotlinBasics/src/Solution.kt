/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
internal class Solution {
    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        var ptr: ListNode? = head
        var count = 0
        while (ptr != null && count < k) {
            count++
            ptr = ptr.next
        }
        if (count == k) {
            val current: ListNode? = reverseList(head, k)
            head?.next = reverseKGroup(ptr, k)
            return current
        }
        return head
    }

    fun reverseList(root: ListNode?, k: Int): ListNode? {
        var k = k
        var prev: ListNode? = null
        var current: ListNode? = root
        var next: ListNode? = root?.next
        while (k > 0) {
            current?.next = prev
            prev = current
            current = next
            next = next?.next

            k--
        }
        return prev
    }
}