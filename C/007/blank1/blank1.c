#include  <stdlib.h>
#include  <stdio.h>
#define   N   10
double fun(double  *x)
{ int  i, j;    double  s, av, y[N];
  s=0;
  for(i=0; i<N; i++)  s=s+x[i];
/**********found**********/
  av=__1__;
  for(i=j=0; i<N; i++)
    if( x[i]>av ){
/**********found**********/
      y[__2__]=x[i];
	  x[i]=-1;}
  for(i=0; i<N; i++)
/**********found**********/
    if( x[i]!= __3__) y[j++]=x[i];
  for(i=0; i<N; i++)x[i] = y[i];
  return  av;
}
void main()
{ int  i;     double  x[N];
  for(i=0; i<N; i++){ x[i]=rand()%50; printf("%4.0f ",x[i]);}
  printf("\n");
  printf("\nThe average is: %f\n",fun(x));
  printf("\nThe result :\n",fun(x));
  for(i=0; i<N; i++)  printf("%5.0f ",x[i]);
  printf("\n");
}

