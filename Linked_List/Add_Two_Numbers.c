/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    int sum=0,carry=0;
    struct ListNode dummy;
    dummy.next=NULL;
    struct ListNode* curr= &dummy;
    while(1){
        int a = l1==NULL? 0: l1->val;
        int b = l2==NULL? 0: l2->val;
        sum= ( a + b + carry);
        struct ListNode* newNode= (struct ListNode*)malloc(sizeof(struct ListNode));
        newNode->val=sum%10;
        newNode->next=NULL;
        carry=sum/10;
        curr->next=newNode;
        curr=newNode;
        if(l1!=NULL){l1=l1->next;}
        if(l2!=NULL){l2=l2->next;}

        if(l1==NULL && l2==NULL){ 
            if(carry>0){
                struct ListNode* newNode= (struct ListNode*)malloc(sizeof(struct ListNode));
                newNode->val=carry;
                newNode->next=NULL;
                curr->next=newNode;
                break; 
            }
            else{ break; }
        }
    }
    return dummy.next;
}
