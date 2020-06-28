#include<iostream>
using namespace std;
int main()
{
  int fs,fd,fc,ss,sd,sc,as,ad,ac,f,s,a;
  std::cin>>fs>>fd>>fc>>ss>>sd>>sc>>as>>ad>>ac;
  f=fs-(fs*fd/100)+fc;
  s=ss-(ss*sd/100)+sc;
  a=as-(as*ad/100)+ac;
  std::cout<<"In Flipkart Rs."<<f<<"\n";
  std::cout<<"In Snapdeal Rs."<<s<<"\n";
  std::cout<<"In Amazon Rs."<<a<<"\n";
  if(f<=s && f<=a)
  {
  	std::cout<<"He will prefer Flipkart";
  }
  else if(s<=f && s<=a)
  {
  	std::cout<<"He will prefer Snapdeal";
  }
  else
  {
  	std::cout<<"He will prefer Amazon";
  }
}