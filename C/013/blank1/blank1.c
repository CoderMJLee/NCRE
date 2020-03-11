#include  <stdio.h>
#define   N   3
int fun(int  (*a)[N])
{ int  i,j,m1,m2,row,colum;
  m1=m2=0;
  for(i=0; i<N; i++)
  { j=N-i-1;  m1+=a[i][i];  m2+=a[i][j];  }
  if(m1!=m2) return  0;
  for(i=0; i<N; i++) {
/**********found**********/
     row=colum= __1__;
     for(j=0; j<N; j++)
     {  row+=a[i][j];  colum+=a[j][i];  }
/**********found**********/
     if( (row!=colum) __2__ (row!=m1) ) return 0;
  }
/**********found**********/
  return  __3__;
}
void main()
{ int  x[N][N],i,j;
  printf("Enter number for array:\n");
  for(i=0; i<N; i++)
    for(j=0; j<N; j++)  scanf("%d",&x[i][j]);
  printf("Array:\n");
  for(i=0; i<N; i++)
  {  for(j=0; j<N; j++)  printf("%3d",x[i][j]);
     printf("\n");
  }
  if(fun(x)) printf("The Array is a magic square.\n");
  else printf("The Array isn't a magic square.\n");
}

