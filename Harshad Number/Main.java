#include<iostream>
using namespace std;
int main()
{
  int h,r,sum=0,c,a;
  std::cin>>h;
  c=h;
  if(h>0)
  {
  	while(c>0)
  	{
  		a=c%10;
    	sum=sum+a;
    	c=c/10;
  	}
  }
  if(h%sum==0)
  {
  	std::cout<<"Harshad Number";
  }
  else
    std::cout<<"Not Harshad Number";
}