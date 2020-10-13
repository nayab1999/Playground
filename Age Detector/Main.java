#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int b,c,a;
  std::cin>>b>>c;
  if(c==00)
  {
    a=100-b;
  }
  else if(b>c)
  {
    a=(100-b)+c;
  }
  else if(b<c)
  {
    a=(-1)*(b-c);
  }
  std::cout<<a;
}