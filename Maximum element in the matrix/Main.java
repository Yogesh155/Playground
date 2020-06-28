#include<iostream>
using namespace std;
int main()
{
  int r,c;
  std::cin>>r>>c;
  int i,j,a[r][c];
  for(i=0;i<r;i++)
  {
  	for(j=0;j<c;j++)
    {
    	std::cin>>a[i][j];
    }
  }
  int d=0;
  for(i=0;i<c;i++)
  {
  	for(j=0;j<r;j++)
    {
    	if(a[j][i]>d)
        {
        	d=a[j][i];
        }
    }
  }
  std::cout<<"The maximum element is "<<d<<"\n";
}