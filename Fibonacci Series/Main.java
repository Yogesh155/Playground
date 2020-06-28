#include<iostream>
int a=0,b=1;
int fibo(int n)
{
	if(n==1 || n==0)
    {
    	return n;
    }
  	else
  		return fibo(n-1)+fibo(n-2);
  	
}
int main()
{
  int n;
  std::cin>>n;
  std::cout<<"The term "<<n<<" in the fibonacci series is "<<fibo(n-1);
}