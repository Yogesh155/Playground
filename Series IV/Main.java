#include<iostream>
using namespace std;
int main()
{
  int a,c=0,p=2,i=1,j=1;
  std::cin>>a;
  do
  {
  	std::cout<<c<<" ";
    c=c+(p*i);
    j++;
    if(j%2==0 && j>=2)
    	i=i+2;
  }while(j<=a);
}