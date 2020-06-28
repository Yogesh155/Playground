#include<iostream>
using namespace std;
int main()
{
 	int n,m;
  	cin>>n>>m;
  	int a[n][m],i,j,sum=0;
  	for(i=0;i<n;i++)
    {
    	for(j=0;j<m;j++)
        {
        	cin>>a[i][j];
        }
    }
  	for(i=0;i<n;i++)
    {
    	for(j=0;j<m;j++)
        {
        	if(n>2)
            {
            	if(i==(n/2))
                {
                  		if(i==j==1)
                  			sum=sum+a[i][j];
                }
              	else
                  sum=sum+a[i][j];
            }
          	else
                    sum=sum+a[i][j];
        }
    }
  	cout<<"Sum of Zig-Zag pattern is "<<sum;
}