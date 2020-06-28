#include<iostream>
using namespace std;
int main()
{
  int n,a,e=0,o=0;
  std::cin>>n;
  while(n!=0)
  {
  	a=n%10;
    if(a%2==0)
    {
    	e=e+a;
    }
    else
    {
    	o=o+a;
    }
    n=n/10;
  }
  if(e==o)
  {
  	std::cout<<"Yes";
  }
  else
    std::cout<<"No";
}