#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#define  N  5
double fun (int w[][N])
{
 
}
void main()
{
  FILE *wf;
  int a[N][N]={0,1,2,7,9,1,9,7,4,5,2,3,8,3,1,4,5,6,8,2,5,9,1,4,1};
  int i, j;
  double s;
  system("CLS");
  printf("*****The array*****\n ");
  for (i=0; i<N; i++)
    { for (j=0;j<N;j++)
         {printf("%4d ",a[i][j]);}
      printf("\n ");
    }
  s=fun(a);
  printf("*****THE RESULT*****\n ");
  printf("The sum is : %lf\n ",s);
/******************************/
  wf=fopen("out.dat","w");
  fprintf (wf,"%lf",s);
  fclose(wf);
/*****************************/
}
