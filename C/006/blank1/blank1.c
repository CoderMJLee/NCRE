#include  <stdlib.h>
#include  <stdio.h>
#define   N   10
double fun(double  x[],double  *av)
{ int  i,j;    double  d,s;
  s=0;
  for(i=0; i<N; i++)  s = s +x[i];
/**********found**********/
  __1__=s/N;
  d=32767;
  for(i=0; i<N; i++)
    if(x[i]<*av && *av - x[i]<=d){
/**********found**********/
      d=*av-x[i]; 
	  j=__2__;
	 }
/**********found**********/
  return  __3__;
}
void main()
{ int  i;    double  x[N],av,m;
  for(i=0; i<N; i++){ x[i]=rand()%50; printf("%4.0f ",x[i]);}
  printf("\n");
  m=fun(x,&av);
  printf("\nThe average is: %f\n",av);
  printf("m=%5.1f ",m);
  printf("\n");
}

