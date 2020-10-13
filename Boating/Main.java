#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,na,nc;
  std::cin>>w>>na>>nc;
  int wa=na*75;
  int wc=nc*30;
  int wb=wa+wc;
  if(wb<=w)
  {
    std::cout<<"Boat is stable";
  }
  else
  {
    std::cout<<"Boat will drow";
  }
}