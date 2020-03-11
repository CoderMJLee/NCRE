#include <stdio.h> 
#include <string.h> 
void fun( char *s1, char *s2, char *s3)
{   int i,j,k=0;
	for(i = 0; i<strlen(s2); i++)  
	{	for(j = 0; j<strlen(s1); j++)  
/**********************found***********************/
			if (s2[i] != s1[j])
			   break;
/**********************found***********************/
		if (j>=strlen(s1))
/**********************found***********************/
			s3[++k]=s2[i];
	}
	s3[k] = '\0';
}
void main() 
{	char s1[128], s2[128], s3[128];  
	printf("Please input string1:"); 
	gets(s1);   
	printf("Please input string2:");  
	gets(s2);    
	fun(s1,s2,s3);
	printf("string:%s\n", s3);   
}