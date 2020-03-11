#include <stdio.h>
void fun (int (*s)[10], int *b, int *n, int mm, int nn)
{
  
}
void main()
{
  FILE *wf;
  int w[10][10]={{33,33,33,33},{44,44,44,44},{55,55,55,55}}, i, j;
  int a[100]={0},n=0 ;
  printf("The matrix:\n");
  for (i=0; i<3; i++)
    {for (j=0;j<4;j++)  
        printf("%3d",w[i][j]);
     printf("\n");
    }
  fun(w,a,&n,3,4);
  printf("The A array:\n");
  for(i=0; i<n; i++)  
     printf("%3d",a[i]); 
  printf("\n\n");
/******************************/
  wf=fopen("out.dat","w");
  for(i=0; i<n; i++)  
     fprintf(wf,"%3d",a[i]); 
  fclose(wf);
/*****************************/
}
