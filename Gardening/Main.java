#include<iostream>
using namespace std;
int main()
{
  int r,c,nt;
  std::cin>>r>>c>>nt;
  if((r+c)==nt || (r+c)*2==nt)
    std::cout<<"It is a mango tree";
  else
    std::cout<<"It is not a mango tree";
}