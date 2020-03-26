package problem_0019_RemoveNthNodeFromEndOfList;


import utils.ListNode;

/*
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 *
 * 说明：给定的 n 保证是有效的。
 * 进阶：你能尝试使用一趟扫描实现吗？
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = new ListNode(0);
        first.next = head; // 添加一个哑结点作为辅助，便于处理头结点
        ListNode p = first, q = first;
        while (n > 0) {
            q = q.next;
            n--;
        }
        while (q != null && q.next != null) {
            p = p.next;
            q = q.next;
        }
        p.next = p.next.next;
        return first.next;
    }
}
