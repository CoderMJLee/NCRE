#include<string.h>
#include<stdio.h>
#define N 80
int fun(char *s)
{
  
}
void main()
{ 
  FILE *wf;
  char line[N]; 
  int num=0;
  printf("Enter a string:\n "); 
  gets(line);
  num=fun(line);
  printf("The number of word is:%d\n\n ",num);
/******************************/
  wf=fopen("out.dat","w");
  fprintf(wf,"%d",fun("a big car"));
  fclose(wf);
/*****************************/
}
