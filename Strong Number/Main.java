#include <stdio.h>
int main() {
	
  int n,r,i,s=0;
  scanf("%d",&n);
  int f=n;
  while(n!=0)
  {
     r=n%10;
    int f=1;
    for(i=1;i<=r;i++)
    {
      f=f*i;
    }
    s=s+f;
    n=n/10;
  }
  if(s==f)
  { 
    printf("Yes");
  } 
  else
  {
    printf("No");
   }
  
	return 0;
    }