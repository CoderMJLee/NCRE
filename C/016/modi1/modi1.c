#include <stdio.h>
#include <string.h>

void fun( char  *a, char  *b, char  *c )
{
  int   i , j;     char   ch;
  i = 0;    j = strlen(b)-1;
/************found************/
  while ( i > j )
  {   ch = b[i]; b[i] = b[j]; b[j] = ch;
      i++;    j--;
  }
  while ( *a || *b ) {
/************found************/
     If ( *a )
       { *c = *a;  c++; a++; }
     if ( *b )
       { *c = *b;  c++; b++; }
  }
  *c = 0;
}

void main()
{
  char   s1[100],s2[100],t[200];
  printf("\nEnter s1 string : ");scanf("%s",s1);
  printf("\nEnter s2 string : ");scanf("%s",s2);
  fun( s1, s2, t );
  printf("\nThe result is : %s\n", t );
}

