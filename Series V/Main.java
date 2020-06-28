#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n,a=11,i=1,r;
  std::cin>>n;
  do
  {
    r=a*a;
    std::cout<<r<<" ";
    a=a+4;
    i++;
  }while(i<=n);
}