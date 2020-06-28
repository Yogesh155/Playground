#include<iostream>
int main()
{
	int n,a=6,b,i,j=1;
  	std::cin>>n;
  	std::cout<<a<<" ";
  	
  	for(i=2;i<=n;i++)
    {
    	a=a+(5*j);
      	std::cout<<a<<" ";
      	j++;
    }
}