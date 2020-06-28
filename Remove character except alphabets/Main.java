#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  std::string name,temp="";
  std::getline(std::cin,name);
  for(int i=0;i<name.size();i++)
  {
  	if((name[i]>='a' && name[i]<='z') || (name[i]>='A' && name[i]<'Z'))
    {
    	temp=temp+name[i];
    }
  }
  name=temp;
  std::cout<<name;
}