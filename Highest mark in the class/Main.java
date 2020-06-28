#include<iostream>
int main()
{
  // Type your code here
  int n;
  std::cin>>n;
  int a[n],greatest=1,i;
  for(i=0;i<n;i++)
  {
  	std::cin>>a[i];
    if(greatest<a[i])
      greatest=a[i];
  }
  std::cout<<greatest;
  

}