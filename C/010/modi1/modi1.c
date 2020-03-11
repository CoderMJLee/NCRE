#include <stdio.h>
void fun()
{
 int a[3][3],sum;
 int i,j;
/*************found**************/
 sum=1;
 for (i=0;i<3;i++)
    { for (j=0;j<3;j++)
/*************found**************/
      scanf("%d",a[i][j]);
    }
 for(i=0;i<3;i++)
     sum=sum+a[i][i];
 printf("Sum=%d\n",sum);
}
void main()
{
fun();
}
