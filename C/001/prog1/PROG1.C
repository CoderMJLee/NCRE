#include <stdio.h>
#define N  3
#pragma warning(disable:4996)
void NONO( );

void fun( int a[N][N],int *p)
{


}
main()
 {   int a[N][N]={ 1,5,7,2,6,8,3,4,9};
     int b[2*N],i;
     fun(a,b);
     for(i=0;i<2*N;i++)
            printf("%d,",b[i]);
     NONO();
}

void NONO( )
{   int a[N][N];
     int b[2*N],i,j,k;
     FILE *rf, *wf;

     rf = fopen("in.dat","r") ;
     wf = fopen("out.dat","w") ;
     for(k=0; k<9;k++) {
           for(i=0;i<N;i++)
                for(j=0;j<N;j++)
                     fscanf(rf,"%d,",&a[i][j]);
         fun(a,b);
         for(i=0;i<2*N;i++)
              fprintf(wf, "%d,",b[i]);
         fprintf(wf, "\n");
     }
     fclose(rf);
     fclose(wf);
}