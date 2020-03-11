#include  <stdio.h>
#define   M   3
#define   N   5
void fun(int  (*a)[N],int  k)
{ int  i,j,p,temp;
/**********found**********/
  for(p=1; p<= __1__; p++)
     for(i=0; i<M; i++)
     {  temp=a[i][0];
/**********found**********/
        for(j=0; j< __2__ ; j++) a[i][j]=a[i][j+1];
/**********found**********/
        a[i][N-1]= __3__;
     }
}
void main( )
{ int  x[M][N]={ {1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5} },i,j;
  printf("The array before moving:\n\n");
  for(i=0; i<M; i++)
  {  for(j=0; j<N; j++)  printf("%3d",x[i][j]);
     printf("\n");
  }
  fun(x,2);
  printf("The array after moving:\n\n");
  for(i=0; i<M; i++)
  {  for(j=0; j<N; j++)  printf("%3d",x[i][j]);
     printf("\n");
  }
}

