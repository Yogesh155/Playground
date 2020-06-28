#include<iostream>
using namespace std;
struct college
  {
  	char name[100],city[100];
    int eyear;
    float per;
  }c[100];
int main()
{
  int n,i;
  std::cout<<"Enter the number of colleges";
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
  	std::cout<<"\nEnter the details of college "<<i;
    std::cout<<"\nEnter name";
    std::cin>>c[i].name;
    std::cout<<"\nEnter city";
    std::cin>>c[i].city;
    std::cout<<"\nEnter year of establishment";
    std::cin>>c[i].eyear;
    std::cout<<"\nEnter pass percentage";
    std::cin>>c[i].per;
  }
  std::cout<<"\nDetails of colleges";
  for(i=1;i<=n;i++)
  {
  	std::cout<<"\nCollege:"<<i;
    std::cout<<"\nName:"<<c[i].name;
    std::cout<<"\nCity:"<<c[i].city;
    std::cout<<"\nYear of establishment:"<<c[i].eyear;
    std::cout<<"\nPass percentage:"<<c[i].per;
  }
}