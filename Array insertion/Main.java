#include<iostream>
#include<set>
using namespace std;
int main()
{
  int n,l,v,i;
  std::cout<<"Enter the number of elements in the array\n";
  std::cin>>n;
  int a[n];
  std::cout<<"Enter the elements in the array\n";
  for(i=1;i<=n;i++)
  {
  	std::cin>>a[i];
  }
  std::cout<<"Enter the location where you wish to insert an element\n";
  std::cin>>l;
  if( l>n)
  {
  	std::cout<<"Invalid Input";
  }
  else
  {
     std::cout<<"Enter the value to insert\n";
  std::cin>>v;
  for(i=1;i<=n+1;i++)
  {
  	if(l==i)
    {
    	for(int j=n+1;j>i;j--)
        {
        	a[j]=a[j-1];
        }
      	a[i]=v;
    }
  }
  std::cout<<"Array after insertion is\n";
  for(i=1;i<=n+1;i++)
  {
  	std::cout<<a[i]<<"\n";
  }  
  }
}