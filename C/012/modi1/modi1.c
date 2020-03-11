#include <stdio.h>
#include <conio.h>
/*************found**************/
void fun(int m,int k);
{ int aa[20], i;
  for(i=0;m;i++)
  {
	/*************found**************/
	aa[i]=m/k;
	m/=k;
  }
  for(;i;i--)
	/*************found**************/
	printf("%d",aa[i]);
}
void main()
{
  int b,n;
  printf("\nPlease enter a number and a base:\n");
  scanf("%d%d",&n,&b);
  fun(n,b);
  printf("\n ");
}
