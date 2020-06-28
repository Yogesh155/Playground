#include<iostream>
int main()
{
  int n,i=0;
  std::cin>>n;
  if(n==1)
  {
  	n=1;
  }
  do
  {
  	n=n/10;
    i++;
  }while(n>0);
	std::cout<<i;
}