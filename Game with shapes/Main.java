#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int l,r;
  std::cin>>r>>l;
  int d=r*2;
  if(d==l)
  {
    std::cout<<"circle can be inside a square";
  }
  else
  {
    std::cout<<"circle cannot be inside a square";
  }
}