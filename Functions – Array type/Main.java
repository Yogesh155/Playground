#include<iostream>
using namespace std;
int array(int n,int a[])
{
	int i,flag=0;
  	for(i=0;i<n;i++)
    {
    	if(a[i]%2==0)
          flag++;
      	else
          break;
      	if(flag==n)
          return 1;
    }
  flag=0;
  	for(i=0;i<n;i++)
    {
    	if(a[i]%2!=0)
          flag++;
      	else
          break;
      	if(flag==n)
          return 2;
    }
  	return 3;
}
int main()
{
  int n;
  std::cout<<"Enter the number of elements in the array";
  std::cin>>n;
  int a[n],i;
  std::cout<<"\nEnter the elements in the array";
  for(i=0;i<n;i++)
  {
  	std::cin>>a[i];
  }
  int r=array(n,a);
  if(r==1)
   std::cout<<"\nThe array is Even"; 
  else if(r==2)
    std::cout<<"\nThe array is Odd";
  else
    std::cout<<"\nThe array is Mixed";
}