#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,x,y;
  std::cin>>w>>x>>y;
  int SP=w*x;
  int CP= (w*y)+100;
  int profit=(SP)-(CP);
  std::cout<<profit;
  return 0;
}