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
  for(i=0;i<c;i++)
  {
    int d=0;
  	for(j=0;j<r;j++)
    {
      	if(a[j][i]>d)
        {
        	d=a[j][i];
        }
    }
    std::cout<<d<<"\n";
  }
}