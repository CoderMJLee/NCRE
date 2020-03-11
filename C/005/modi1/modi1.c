#include  <stdlib.h>
#include  <conio.h>
#include  <stdio.h>
/*************found**************/
fun (int m)
{ double y=0, d;
  int i;
/*************found**************/
  for(i=100,i<=m,i+=100)
     {d=(double)i*(double)i;
      y+=1.0/d;
     }
  return(y);
}
void main()
{ int n=2000;
  system("CLS");
  printf("\nThe result is %1f\n",fun(n));
}

