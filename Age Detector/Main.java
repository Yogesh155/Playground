#include<iostream>
using namespace std;
int main()
{
  int a,b,r;
  std::cin>>a>>b;
  if(b>a)
  {
  	r=b-a;
  }
  else
  {
  	a=a+1900;
    b=b+2000;
    r=b-a;
  }
  std::cout<<r;
}