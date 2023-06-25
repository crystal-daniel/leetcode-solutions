#include<stdio.h>
#include<stdlib.h>
struct ListNode {
     int val;
     struct ListNode *next;
 };

 int cout=0;
 int add(int a, int b)
 {
     int sum=0;
     sum=a+b+cout;
     if(sum>9)
     {
         sum=sum%10;
         cout=sum/10;
     }
     return sum;
 }
 struct ListNode* create(int value)
 {
     struct ListNode *newnode=(struct ListNode*)malloc(sizeof(struct ListNode*));
     newnode->val=value;
     newnode->next=NULL;
     return newnode;
 }
 struct ListNode* insert(struct ListNode* head, int value)
 {
     struct ListNode *temp;
     if(head==NULL)
     {
        head= create(value);
     }
     else
     {
         temp=head;
         while(temp->next!=NULL)
         {
             temp=temp->next;
         }
         temp->next=create(value);
     }
     return head;
 }
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2){
    int s=0;
    struct ListNode* l3=NULL;
    while(l1->next!=NULL && l2->next!=NULL)
    {
        s=(l1->val,l2->val);
        l3=insert(l3,s);
        l1=l1->next;
        l2=l2->next;
    }
    if(l1->next!=NULL)
    {
        while(l1->next!=NULL)
        {
            s=(l1->val,0);
            l3=insert(l3,s);
            l1=l1->next;
        }
    }
    if(l2->next!=NULL)
    {
        while(l2->next!=NULL)
        {
            s=(l2->val,0);
            l3=insert(l3,s);
            l2=l2->next;
        }
    }
    if(cout>0)
    {
        l3=insert(l3,cout);
    }
    return l3;
}
void display(struct ListNode* l3)
{
    while(l3!=NULL)
    {
        printf("%d \t",l3->val);
        l3=l3->next;
    }
}
void main()
{
    struct ListNode *h1;
    struct ListNode *h2;
    h1=insert(h1,8);
    h1=insert(h1,6);
    h1=insert(h1,7);
    h1=insert(h1,4);
    h1=insert(h1,1);

    h2=insert(h2,8);
    h2=insert(h2,5);
    h2=insert(h2,9);

    struct ListNode *h3;
    h3=addTwoNumbers(h1,h2);
    display(h3);
}
