#include<iostream>
#include<string>
using namespace std;
int main()
{
  std::string str;
  std::getline(std::cin,str);
  size_t id=str.find("the");
  while(id!=string::npos)
  {
  	str.erase(id,4);
    id=str.find("the");
  }
  std::cout<<str;
}