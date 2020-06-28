#include<iostream>
int main()
{
	int a=121,b=15,n,c,i;
  	std::cin>>n;
  	if(n==1)
    {
    	std::cout<<"121"<<" ";
    }
  	else
    {
    	std::cout<<"121"<<" ";
      	for(i=2;i<=n;i++)
        {
        	c=b*b;
          	b=b+4;
          	std::cout<<c<<" ";
        }
    }
}