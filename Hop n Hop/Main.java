#include<iostream>
#include <bits/stdc++.h>
using namespace std;
int main()
{
  int x1=3,y1=4,x2,y2;
  double s,p,power1,power2;
  std::cin>>x2>>y2;
  power1=pow((x2-x1),2);
  power2=pow((y2-y1),2);
  p=power1+power2;
  s=sqrt(p);
  std::cout<<int(s);
}