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
    void reverseList(ListNode* s,ListNode* e){
        ListNode *c = s,*p=NULL,*n=NULL;
        while(c!=e){
            n = c->next;
            c->next = p;
            p = c;
            c = n;
        }
        c->next = p;
    }
    ListNode* reverseKGroup(ListNode* head, int k) {
     if(head==nullptr || head->next==nullptr || k==1) return head;
        ListNode *s = head, *e = head;
        int i = k-1;
        while(i!=0){
            e=e->next;
            if(e==nullptr) return head;
            i--;
        }
        ListNode *rest = reverseKGroup(e->next,k);
        reverseList(s,e);
        s->next = rest;
        return e;
    }
};