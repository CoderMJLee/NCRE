#include <stdio.h>
#include <stdlib.h>
typedef  struct  aa
{  int  data;
   struct  aa  *next;
} NODE;
NODE *Creatlink(int  n, int  m)
{  NODE  *h=NULL, *p, *s;
   int  i;
/**********found***********/
   p=(NODE )malloc(sizeof(NODE));
   h=p;
   p->next=NULL;
   for(i=1; i<=n; i++)
   {  s=(NODE *)malloc(sizeof(NODE));
      s->data=rand()%m;      s->next=p->next;
      p->next=s;             p=p->next;
   }
/**********found***********/
   return  p;
}
void outlink(NODE  *h)
{  NODE  *p;
   p=h->next;
   printf("\n\nTHE  LIST :\n\n  HEAD ");
   while(p)
   {  printf("->%d ",p->data);
      p=p->next;
   }
   printf("\n");
}
void main()
{  NODE  *head;
   head=Creatlink(8,22);
   outlink(head);
}

