#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int y;
  std::cin>>y;
  if(y%4==0)
  {
    if(y%100==0)
    {
      if(y%400==0)
      {
        std::cout<<y<<" is a leap year";
      }
      else
      {
        std::cout<<y<<" is not a leap year";
      }
    }
    else
    {
       std::cout<<y<<" is a leap year"; 
    }
  }
  else
  {
      std::cout<<y<<" is not a leap year";
  }
}