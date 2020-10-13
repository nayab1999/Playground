#include<iostream>
using namespace std;
int main()
{
  int p,r,t;
  float SI,A,D,F;
  std::cin>>p>>r>>t;
  SI=(p*r*t)/100;
  A=p+SI;
  D=(SI*0.02);
  F=A-D;
  std::cout<<SI<<"\n"<<A<<"\n"<<D<<"\n"<<F;
  return 0;
  
}