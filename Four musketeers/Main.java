#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x1,y1,x2,y2,x3,y3;
  std::cin>>x1>>y1>>x2>>y2>>x3>>y3;
  double g1,g2;
  g1=(double)(x1+x2+x3)/3;
  g2=(double)(y1+y2+y3)/3;
  std::cout<<g1<<"\n"<<g2;
  return 0;
}