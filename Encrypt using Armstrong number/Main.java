#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  	int p=0,a,d,sum=0,j;
  	d=n;
  	while(d!=0)
    {
    	a=d%10;
      	p++;
      	d=d/10;
    }
  d=n;
  	for(int i=0;i<p;i++)
    {
    	a=d%10;
      	j=power(a,p);
      	d=d/10;
      	sum=sum+j;
    }
  	if(n==sum)
      return 1;
  	else
      return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}