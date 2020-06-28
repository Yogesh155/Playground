#include<iostream>

void swap(int &a,int b,int &c)
{
	b=a;
  	a=c;
  	c=b;
}
int main()
{
	int x,y;
  	std::cin>>x>>y;
  	std::cout<<"Before swapping a= "<<x<<" and b="<<y<<"\n";
  	swap(x,y,y);
  	std::cout<<"After swapping a= "<<x<<" and b="<<y;
}