#include<iostream>
int main()
{
	int n,a,i,j;
  	std::cin>>n;
  	a=n;
  	for(i=0;i<4;i++)
    {
      	for(j=0;j<=i;j++)
        {
    		std::cout<<a;
        }
      	a++;
      	std::cout<<"\n";
    }
  	for(i=0;i<4;i++)
    {
      	a--;
      	for(j=3;j>=i;j--)
        {
    		std::cout<<a;
        }
      	
      	std::cout<<"\n";
    }
}