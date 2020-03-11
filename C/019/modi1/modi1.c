#include <stdio.h>

double fun ( int m )
{  double   y = 1.0 ;
   int  i ;
/**************found**************/
   for(i = 2 ; i < m ; i++)
/**************found**************/
      y -= 1 /(i * i) ;
   return( y ) ;
}

void main( )
{  int n = 5 ;

   printf( "\nThe result is %lf\n", fun ( n ) ) ;
}

