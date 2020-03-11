#include  <string.h>
#include  <stdio.h>
void fun(char  t[])
{
 char c;
 int i,j;
 /*************found**************/
 for(i=strlen(t);i;i--)
     for(j=0;j<i;j++)
        /*************found**************/
	  if(t[j]<t[j+1])
          {
           c= t[j];
           t[j]=t[j+1];
           t[j+1]=c;
          }
}
void main()
{
 char  s[81];
 
 printf("\nPlease  enter a character string :");
 gets(s);
 printf("\n\nBefore sorting :\n  %s",s);
 fun(s);
 printf("\nAfter sorting decendingly:\n %s",s);
}
