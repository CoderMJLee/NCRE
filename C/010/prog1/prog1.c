#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

void fun (int array[3][3])
{
  
}
void main()
{
  FILE *wf;
  int i,j;
  int array [3][3]={{100,200,300},{400,500,600},{700,800,900}};
  system("CLS");
  for (i=0;i<3;i++)
     {for (j=0;j<3;j++)
          printf("%7d ",array[i][j]);
      printf("\n ");
     }
  fun(array);
  printf("Converted array:\n ");
  for (i=0;i<3;i++)
     { for (j=0;j<3;j++)
          printf("%7d ",array[i][j]);
       printf("\n ");
     }   
/******************************/
  wf=fopen("out.dat","w");
  for (i=0;i<3;i++)
     { for (j=0;j<3;j++)
          fprintf(wf,"%7d ",array[i][j]);
       fprintf(wf,"\n");
     }   
  fclose(wf);
/*****************************/
}
