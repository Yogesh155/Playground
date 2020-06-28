#include<iostream>
using namespace std;
int main()
{
  int n,s,i,sum=0;
  std::cin>>n>>s;
  int a[n];
  for(i=0;i<n;i++)
  {
  	std::cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
  	sum=sum+a[i];
  }
  if(sum<=s)
  {
  	std::cout<<"YES";
  }
  else
    std::cout<<"NO";
  
}