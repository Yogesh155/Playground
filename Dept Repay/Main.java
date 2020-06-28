#include<iostream>
using namespace std;
int main()
{
  int x,y,r;
  float i,a,d,f;
  std::cin>>x>>r>>y;
  i=(x*y*r)/100;
  a=(x+i);
  d=(i*2)/100;
  f=x+i-d;
  std::cout<<i<<"\n"<<a<<"\n"<<d<<"\n"<<f;  
}