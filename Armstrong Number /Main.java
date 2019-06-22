#include <stdio.h>
int main() {
	//Type your code
  int n,k=0,l;
  scanf("%d",&n);
  int p=n,a=n;
  while(p!=0)
  {
     k++;
    p=p/10;
  }
  int r,s=0;
  while(n!=0)
  {
    r=n%10;
    int h=1;
    l=k;
    while(l!=0)
    {
    h=r*h;
      l--;
    }
    s=s+h;
    n=n/10;
  }
  if(a==s)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
     
 
	return 0;
}