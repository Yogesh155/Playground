#include <iostream>
int main() 
{
	int a,r;
  	std::cin>>a;
  	while(a!=0)
    {
    	r=a%10;
      	a=a/10;
      std::cout<<r;
    }
	return 0;
}