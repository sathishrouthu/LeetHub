/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverseList(ListNode* head){
        if(!head || !head->next) return head;
        ListNode* rest = reverseList(head->next);
        head->next->next = head;
        head->next = NULL;
        return rest;
    }
    bool isPalindrome(ListNode* head) {
        ListNode* dummy = head;
        ListNode* slow=head;
        ListNode* fast = head;
        while(fast->next!=NULL && fast->next->next!=NULL){
            slow = slow->next;
            fast = fast->next->next;
        }
        //slow is at mid
        slow->next = reverseList(slow->next);
        slow = slow->next;
        while(slow!=NULL){
            if(dummy->val!=slow->val)
                return false;
            dummy = dummy->next;
            slow = slow->next;
        }
        return true;
    }
};
// 1 2 3 2 1