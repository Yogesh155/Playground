#include<iostream>
#include<cstring>
using namespace std;
int main()
{
	std::string str;
  	int count=0;
  	std::getline(std::cin,str);
  	int l=str.size();
  	for(int i=0;i<l;i++)
  		count++;
	std::cout<<"The number of letters in the name is "<<count;
}