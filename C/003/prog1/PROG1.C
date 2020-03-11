#include <stdio.h>
#pragma warning(disable:4996)

int fun(int x[], int n, int e, int *num)
{



}

int main()
{  
  void NONO();
  int x[] = {1, 9, 8, 6, 12}, num=0, sum;
  sum = fun(x, 5, 3, &num);
  printf("sum=%d,num=%d\n", sum, num);
  NONO();
  return 0;
}

void NONO( )
{
	int x[100] = {1, 9, 8, 6, 12}, num, sum, i, j, count, e;
	FILE *rf, *wf;
	rf = fopen("in.dat","r");
	wf = fopen("out.dat","w");
	for(i=0;i<10;i++) {
		num = 0;
		sum = 0;
		fscanf(rf, "%d,", &count);
		for(j=0;j<count;j++)
			fscanf(rf,"%d,",&x[j]);
		fscanf(rf, "%d,", &e);
		sum = fun(x, count, e, &num);
		fprintf(wf, "sum=%d,num=%d\n", sum, num);
     }
     fclose(rf);
     fclose(wf);
}