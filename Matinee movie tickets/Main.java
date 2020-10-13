#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  float t;
  float x=10.15,y=13.30,z=18.00,m=22.00;
  std::cin>>a>>t;
  if(a>13)
  {
    if(t==y || t==z)
    {
      std::cout<<"$5.00";
    }
    else
    {
      std::cout<<"$8.00";
    }
  }
  else
  {
    if(t==y || t==z)
    {
      std::cout<<"$2.00";
    }
    else
    {
      std::cout<<"$4.00";
    }
  }
}