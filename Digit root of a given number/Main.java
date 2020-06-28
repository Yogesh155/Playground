#include<iostream>
int main()
{
	int n,r,c=2,sum=0;
  	std::cin>>n;
      while(c>1)
      {
        c=0;
        sum=0;
      	while(n!=0)
        {
    		r=n%10;
      		sum=sum+r;
          	n=n/10;
          	c++;
        }
        n=sum;
      }
		std::cout<<n;
}
