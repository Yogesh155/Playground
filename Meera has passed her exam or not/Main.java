#include<iostream>
int main()
{
  // Type your code here
  int n;
  std::cin>>n;
  int a[n],m,i,flag=0;
  for(i=0;i<n;i++)
  {
  	std::cin>>a[i];
  }
  std::cin>>m;
  for(i=0;i<n;i++)
  {
  	if(a[i]==m)
    {
      	flag=1;
    }
  }
  if(flag==1)
    std::cout<<"She passed her exam";
  else
    std::cout<<"She failed";
}