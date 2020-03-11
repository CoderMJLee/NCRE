#include  <stdlib.h>
#include  <string.h>
#include  <conio.h>
#include  <ctype.h>
#include  <stdio.h>
#include  <string.h>
/*************found**************/
void upfst(char p)
{
  int k=0;
  for ( ;*p;p++)
     if (k)
        {
         if (*p==' ')  
         	k=0;
        }
     else
        {
			if (*p!=' ')  
			{
				k=1;
				*p=toupper(*p);
			}
		}
}
void main()
{
	char  chrstr[81];
	system("CLS");    
	printf("\nPlease enter an English text line: ");
	gets(chrstr);
	printf("\nBofore changing:\n  %s",chrstr);
	upfst(chrstr);
	printf("\nAfter changing:\n  %s\n",chrstr);
}
