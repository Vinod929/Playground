#include <stdio.h>
int main() {
	//Type your code
  int n,sum=0,k;
  scanf("%d",&n);
  while(n!=0)
  {
    k=n%10;
    n=n/10;
    sum=sum+k;
  }
  printf("%d",sum);
	return 0;
}