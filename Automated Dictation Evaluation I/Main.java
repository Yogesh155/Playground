#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char s1[50];
  char s2[50];
  std::cin>>s1>>s2;
  int r=strcmp(s1,s2);
  if(r==0)
  {
  	std::cout<<"It is correct";
  }
  else
    std::cout<<"It is wrong";
}