#include  <stdio.h>
double f1(double  x)
{  return  x*x;  }
double f2(double x, double y)
{  return  x*y;  }
double fun(double  a, double  b)
{
/**********found**********/
  __1__ (*f)();
  double  r1, r2;
/**********found**********/
  f = __2__ ; 
  r1 = f(a);
/**********found**********/
  f = __3__ ; 
  r2 = (*f)(a, b);
  return  r1 + r2;
}
void main()
{ double  x1=5, x2=3, r;
  r = fun(x1, x2);
  printf("\nx1=%f,  x2=%f,  x1*x1+x1*x2=%f\n",x1, x2, r);
}

