#include<iostream>
using namespace std;
struct emp
{
	char name[20],des[20];
  	int id,age,salary;
}e;
int main()
{
  std::cout<<"Enter name:";
  std::cin>>e.name;
  std::cout<<"\nEnter ID:";
  std::cin>>e.id;
  std::cout<<"\nEnter age:";
  std::cin>>e.age;
  std::cout<<"\nEnter designation:";
  std::cin>>e.des;
  std::cout<<"\nEnter Salary:";
  std::cin>>e.salary;
  std::cout<<"\nEmployee Details";
  std::cout<<"\nName of the Employee : "<<e.name;
  std::cout<<"\nID of the Employee : "<<e.id;
  std::cout<<"\nAge of the Employee : "<<e.age;
  std::cout<<"\nDesignation of the Employee : "<<e.des;
  std::cout<<"\nSalary of the Employee : "<<e.salary;
}