#include  <stdio.h>
#define  N  4
void fun(int  (*a)[N], int  *b)
{ int  i,j;
  for(i=0; i<N; i++) {
/**********found**********/
    b[i]=__1__;
    for(j=1; j<N; j++)
/**********found**********/
        if(b[i]__2__ a[j][i])
		   b[i]=a[j][i];
  }
}
void main()
{ int  x[N][N]={ {12,5,8,7},{6,1,9,3},{1,2,3,4},{2,8,4,3} },y[N],i,j;
  printf("\nThe matrix :\n");
  for(i=0;i<N; i++)
  {  for(j=0;j<N; j++) printf("%4d",x[i][j]);
     printf("\n");
  }
/**********found**********/
  fun(__3__);
  printf("\nThe result is:");
  for(i=0; i<N; i++)  printf("%3d",y[i]);
  printf("\n");
}

