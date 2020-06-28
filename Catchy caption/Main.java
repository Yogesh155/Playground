#include <cstring>
#include <iostream>
int main()
{
   char str[100];
  char *r;
  int count=0;
   std::cin.getline(str,100);
  int l=strlen(str);
  for(int i=0;i<l;i++)
  {
  	if(str[i]==' ')
    	count++;
  }
  if(count<=10)
    std::cout<<"Caption eligible for the contest";
  else
    std::cout<<"Caption not eligible for the contest";
  
   
}