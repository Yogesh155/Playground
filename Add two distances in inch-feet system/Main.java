#include<iostream>
using namespace std;
struct distance
{
	int f;
  	float i;
};
int main()
{
  struct distance d1,d2;
  std::cin>>d1.f>>d1.i>>d2.f>>d2.i;
  //std::cout<<d1.f<<d1.i<<d2.f<<d2.i;
  int f=d1.f+d2.f;
  float i=d1.i+d2.i;
  if(i>12)
  {
  	i-=12;
    f+=1;
  }
  std::cout<<f<<"\'-"<<i<<"\"";
}