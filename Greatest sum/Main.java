#include<iostream>
using namespace std;
int main()
{
  int r,c;
  std::cin>>r>>c;
  int a[r][c],i,j;
  for(i=0;i<r;i++)
  {
  	for(j=0;j<c;j++)
    {
    	std::cin>>a[i][j];
    }
  }
  int s=0,d=0;
 std::cout<<"Sum of rows is ";
  for(i=0;i<r;i++)
  {
     int sum1=0;
  	for(j=0;j<c;j++)
    {
    	sum1=sum1+a[i][j];
    }
    if(sum1>s)
    {
        	s=sum1;	
          	d++;
    }
    std::cout<<sum1<<" ";
      
  }
  std::cout<<"\nRow "<<d<<" has maximum sum";
  s=0,d=0;
 std::cout<<"\nSum of columns is ";
  for(i=0;i<c;i++)
  {
     int sum1=0;
  	for(j=0;j<r;j++)
    {
    	sum1=sum1+a[j][i];
    }
    if(sum1>s)
    {
        	s=sum1;	
          	d++;
    }
    std::cout<<sum1<<" ";
      
  }
  std::cout<<"\nColumn "<<d<<" has maximum sum";
}