#include<iostream>
using namespace std;
int main()
{
  int tw,a,c,sum;
  std::cin>>tw>>a>>c;
  a=a*75;
  c=c*30;
  sum=a+c;
  if(tw>=sum)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}