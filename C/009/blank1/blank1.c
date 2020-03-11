#include  <stdio.h>
#include  <string.h>
#include  <ctype.h>
#define  N  9
long  ctod( char  *s )
{ long  d=0;
  while(*s)
    if(isdigit( *s))  {
/**********found**********/
      d=d*10+*s-__1__;
/**********found**********/
      __2__;  
	 }
  return  d;
}
long  fun( char  *a, char  *b )
{
/**********found**********/
  return  __3__;
}
void main()
{ char  s1[N],s2[N];
  do
  { printf("Input  string  s1 : "); gets(s1); }
  while( strlen(s1)>N );
  do
  { printf("Input  string  s2 : "); gets(s2); }
  while( strlen(s2)>N );
  printf("The result is:  %ld\n", fun(s1,s2) );
}


