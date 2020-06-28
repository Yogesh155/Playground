#include<iostream>
int main(){
  int a,i,b=1;
  std::cin>>a;
  while(a!=0)
  {
    b=a*b;
    a--;
  }
  std::cout<<b;
}