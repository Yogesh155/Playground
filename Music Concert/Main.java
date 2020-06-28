#include<iostream>
#include<cstdlib>
int main(){
  int *a,flag=0,flag1=0,n;
  std::cin>>n;
 a=(int*) malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    std::cin>>*(a+1);
    if(*(a+1)%2==0)
    {
    	flag++;
    }
    else
      flag1++;
  }
 
  std::cout<<flag1<<"\n";
  std::cout<<flag;
  return 0;
}