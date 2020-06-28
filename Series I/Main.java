#include<iostream>
int main()
{
	int n,i;
  	double c=0.5;
  	std::cin>>n;
  	for(i=0;i<n;i++)
    {
      	if(i==0)
        {	
          std::cout<<c<<" ";
      		continue;
        }
      	else
        {
          	c=c+c+c;
          	std::cout<<c<<" ";
        }
    }
}