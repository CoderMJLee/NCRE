#include  <stdlib.h>
#include  <conio.h>
#include  <stdio.h>
int fun( int m)
{ int i,k;
  for (i=m+1; ;i++)
     { for (k=2;k<i;k++)
/*************found**************/
          if (i%k!=0)
          break;
/*************found**************/
        if (k<i)
        return(i);
     }
}
void main()
{  int n;
   system("CLS");
   printf("\nPlease enter n: ");
   scanf("%d",&n);
   printf ("%d\n",fun(n));
}
