#include<iostream>
using namespace std;
struct time
{
	int second;
  	int minute;
  	int hour;
};
void timeperiod(struct time t1,struct time t2, struct time *diff);
int main()
{
 struct time stime,sttime,diff; 
  std::cin>>stime.hour>>stime.minute>>stime.second;
  std::cin>>sttime.hour>>sttime.minute>>sttime.second;
  timeperiod(stime,sttime,&diff);
  std::cout<<diff.hour<<":"<<diff.minute<<":"<<diff.second;
  return 0;
}
void timeperiod(struct time start,struct time stop,struct time *diff)
{
	while(stop.second>start.second)
    {
    	--start.minute;
      	start.second+=60;
    }
  	diff->second=start.second-stop.second;
  	while(stop.minute>start.minute)
    {
    	--start.hour;
      	start.minute+=60;
    }
  	diff->minute=start.minute-stop.minute;
	diff->hour=start.hour-stop.hour;
    
}