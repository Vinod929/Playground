#include <stdio.h>
int svr(int n)
{
if(n>=1)
  {
    return n*svr(n-1);
  }
  else
  { 
      return 1;
  }
}
int main() {
  int n;
  scanf("%d",&n);
  int k;
    k=svr(n);
  printf("%d",k);
	return 0;
}