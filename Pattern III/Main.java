#include<iostream>
int main()
{
	int n,a=1,i,j;
  	std::cin>>n;
  	for(i=1;i<=n;i++)
    {
    	for(j=1;j<=i;j++)
        {
        	std::cout<<a;
          	if(j!=i)
              std::cout<<"*";
        }
      	a++;
      	std::cout<<"\n";
    }
  	for(i=1;i<=n;i++)
    {
      	a--;
    	for(j=n;j>=i;j--)
        {
        	std::cout<<a;
          	if(j!=i)
              std::cout<<"*";
        }
      	std::cout<<"\n";
    }
}