
#include<iostream>

int gcd(int x,int y,int a)

{

if(y==1)

return 1;

if(x%y==0 && a%y==0)

return y;

return gcd(x,y-1,a);

}

int main()

{

int n1,n2,s,l;

std::cin>>n1>>n2;

if(n1<n2)

{

s=n1;

l=n2;

}

else

{

s=n2;

l=n1;

}

std::cout<<"G.C.D of "<<n1<<" and "<<n2<<" = "<<gcd(l,s,s);

}
