#include  <stdlib.h>
#include  <stdio.h>
#define   N   10
double fun(double  *x)
{ int  i, j;    double  av, y[N];
  av=0;
  for(i=0; i<N; i++) 
/**********found**********/ 
	av+=__1__;
  for(i=j=0; i<N; i++)
    if( x[i]<av ){
      y[j]=x[i]; x[i]=-1; 
/**********found**********/
	  __2__;
	}
  i=0;
  while(i<N)
  {  if( x[i]!= -1 ) y[j++]=x[i];
/**********found**********/
     __3__;
  }
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

