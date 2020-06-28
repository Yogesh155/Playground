#include<iostream>
using namespace std;
int main()
{
	int w,x,y,s=100;
  	int sell,pay,r;
  	std::cin>>w>>x>>y;
  	sell=w*x;
  	pay=w*y;
  	r=(sell-pay)-s;
  	std::cout<<r;
  	
}