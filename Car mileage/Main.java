#include<iostream>
using namespace std;
int main()
{
  	float m;
  	int petrol,dis,r;
  	std::cin>>m>>petrol>>dis;
  	r=petrol*m;
  	if(r>dis)
    {
    	std::cout<<"Can reach";
    }
  	else
		std::cout<<"Cannot reach";    
}