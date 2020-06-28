#include<iostream>
#include<cstring>
#include<bits/stdc++.h> 
using namespace std;
int main()
{
  std::string s1,s2;
  int i,r;
  std::getline(std::cin,s1);
  std::getline(std::cin,s2);
  reverse(s2.begin(),s2.end());
    if(s1==s2)
      std::cout<<"It is correct";
  	else
      std::cout<<"It is wrong";
}