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
  for(i=0;i<r;i++)
  {
    int s=0;
  	for(j=0;j<c;j++)
    {
    	if(a[i][j]>s)
        {
        	s=a[i][j];
        }
    }
    cout<<s<<"\n";
  }
}