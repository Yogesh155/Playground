#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n,m,i;
  std::cin>>n>>m;
  int a[n];
  float sum=0;
  for(i=0;i<n;i++)
  {
  	std::cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
  	 sum=sum+a[i];
  }
  if(n==m)
    std::cout<<m;
  else
  {
  	sum=sum/m;
    std::cout<<ceil(sum);
  }
}