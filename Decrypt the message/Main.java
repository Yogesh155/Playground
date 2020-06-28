#include<iostream>
int main()
{
	int n,m,i=1,sum=0,num;
  	std::cin>>n>>m;
  	num=n+m;
  	do
    {
    	if(num%i==0)
        {
        	sum=sum+i;
        }
      i++;
    }while(i<num);
	if(sum==num)
    {
    	std::cout<<"They can read the message";
    }
  	else
    {
    	std::cout<<"They can't read the message";
    }
}