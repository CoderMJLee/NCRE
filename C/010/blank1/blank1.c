#include  <stdlib.h>
#include  <stdio.h>
#define   N  20
void  fun( int  *a)
{ int  i, x, n=0;
  x=rand()%20;
/**********found**********/
  while (n<__1__)
  {  for(i=0; i<n; i++ )
/**********found**********/
         if( x==a[i] ) 
		    __2__;
/**********found**********/
     if( i==__3__)
		{ a[n]=x; n++; }
     x=rand()%20;
  }
}
void main()
{ int  x[N]={0} ,i;
  fun( x );
  printf("The result :  \n");
  for( i=0; i<N; i++ )
  { printf("%4d",x[i]);
    if((i+1)%5==0)printf("\n");
  }
  printf("\n\n");
}

