#include <stdio.h>
/*************found**************/
void fun(int x,int y)
{ int t;
/*************found**************/
  t=x;x=y;y=t;
}
void main()
{ int a,b;
  a=8;
  b=3;
  fun(&a, &b);
  printf("%d  %d\n ", a,b);
}
