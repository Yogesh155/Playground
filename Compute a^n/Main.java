#include<iostream>
using namespace std;
int power(int a, int n)
{
	if(n<=1)
    {
    	return a;
    }
  	else
    {
    	while(n>1)
        {
        	return a*power(a,n-1);
        }
    }
}
int main()
{
  int a,n;
  std::cout<<"Enter the value of a"<<endl;
  std::cout<<"Enter the value of n"<<endl;
  std::cin>>a>>n;
  std::cout<<"The value of "<<a<<" power "<<n<<" is "<<power(a,n);
}