/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    struct ListNode dummy;
    dummy.next = NULL;

    struct ListNode* curr = &dummy;

    while (list1 != NULL && list2 != NULL) {
        struct ListNode* newNode = malloc(sizeof(struct ListNode));
        newNode->next = NULL;

        if (list1->val <= list2->val) {
            newNode->val = list1->val;
            list1 = list1->next;
        } else {
            newNode->val = list2->val;
            list2 = list2->next;
        }

        curr->next = newNode;
        curr = curr->next;
    }

    while (list1 != NULL) {
        struct ListNode* newNode = malloc(sizeof(struct ListNode));
        newNode->val = list1->val;
        newNode->next = NULL;
        curr->next = newNode;
        curr = curr->next;
        list1 = list1->next;
    }

    while (list2 != NULL) {
        struct ListNode* newNode = malloc(sizeof(struct ListNode));
        newNode->val = list2->val;
        newNode->next = NULL;
        curr->next = newNode;
        curr = curr->next;
        list2 = list2->next;
    }

    return dummy.next;
}
