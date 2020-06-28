#include<iostream>
using namespace std;
int main()
{
  int unit,r;
  std::cin>>unit;
  if(unit<=200)
  {
    r=unit*0.5;
  	std::cout<<"Rs."<<r;
  }
  else if(unit<=400)
  {
    r=(unit*0.65)+100;
  	std::cout<<"Rs."<<r;
  }
  else if(unit<=600)
  {
    r=(unit*0.80)+200;
  	std::cout<<"Rs."<<r;
  }
  else if(unit>600)
  {
    r=(unit*1.25)+425;
  	std::cout<<"Rs."<<r;
  }
}