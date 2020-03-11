#include  <stdlib.h>
#include  <conio.h>
#include  <stdio.h>
/*************found**************/
int fun(int n)
{ float A=1;int i;
/*************found**************/
  for(i=2;i<n;i++)
     A=1.0/(1+A);
  return A;
}
void main()
{ int n;
  system("CLS");
  printf("\nPlease enter n: ");
  scanf("%d",&n);
  printf("A%d=%lf\n",n,fun(n));
}
