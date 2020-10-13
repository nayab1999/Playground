#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,a=3,b=4;
 int D;
  std::cin>>x>>y;
 float d1=((a-x)*(a-x));
 float d2=((b-y)*(b-y));
  D=(int)sqrt(d1+d2);
  std::cout<<D;
  return 0;
}