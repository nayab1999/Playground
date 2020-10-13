#include<iostream>
using namespace std;
class Time
{
    public:
 int hr,min,sec;
  Time()
  {
    hr=0;
    min=0;
    sec=0;
  }
  static void sum(Time t1,Time t2)
  {
    Time t;
    if(t1.sec+t2.sec>=60){
      t.sec=(t1.sec+t2.sec)%60;
      t.min+=(t1.sec+t2.sec)/60;
    }
     else
       t.sec=t1.sec+t2.sec;
     if(t1.min+t2.min>=60){
         t.min+=(t1.min+t2.min)%60;
      t.hr+=(t1.min+t2.min)/60;}
    else
      t.min+=t1.min+t2.min;
    t.hr+=t1.hr+t2.hr;
    display(t);
  }
    static void display(Time t)
    {if(t.hr>4)
      cout<<t.hr<<":"<<t.min<<":"<<t.sec;
    }
};
int main()
{
  
 Time t1,t2;
  cin>>t1.hr>>t1.min>>t1.sec>>t2.hr>>t2.min>>t2.sec;
  Time::sum(t1,t2);
  return 0;
}