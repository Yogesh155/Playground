#include<iostream>
int main()
{
    // Type your code here
  	int r,c;
  	std::cin>>r>>c;
  	int i,j,a[r][c],b[r][c],d[r][c];
  	for(i=0;i<r;i++)
      for(j=0;j<c;j++)
        std::cin>>a[i][j];
  	for(i=0;i<r;i++)
      for(j=0;j<c;j++)
        std::cin>>b[i][j];
  	for(i=0;i<r;i++)
      for(j=0;j<c;j++)
        d[i][j]=a[i][j]+b[i][j];
  	for(i=0;i<r;i++)
    {for(j=0;j<c;j++)
      { std::cout<<d[i][j]<<" ";}
  		std::cout<<"\n";
    }
}