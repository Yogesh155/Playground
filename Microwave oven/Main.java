#include<iostream>
#include <iomanip>
using namespace std;
int main()
{
  int no;
  double heat,l,k;
  std::cin>>no>>heat;
  std::cout << std::setprecision(2) << std::fixed;
  l=no*heat;
  k=(heat/100)*50;
  if(no==2)
  {
    std::cout<<l-k;
  }
  else if(no==3)
  {
    std::cout<<2*heat;
  }
  else
  {
  	std::cout<<"Number of items is more";
  }
}