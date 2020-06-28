#include<iostream>
#include<cmath>
int main()
{
	int m,n,req,r;
  	std::cin>>m>>n>>req;
  	r=pow(m,n);
  	if(r<req)
    {
    	std::cout<<"Sorry Doctor! You need more bacteria.";
    }
  	else
    {
    	std::cout<<"Doctor, you can proceed with your experiment.";
    }
}