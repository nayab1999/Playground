#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fp,fd,fs;
  int sp,sd,ss;
  int ap,ad,as;
  int ft,st,at,d1,d2,d3;
  std::cin>>fp>>fd>>fs>>sp>>sd>>ss>>ap>>ad>>as;
  d1=(fp*fd)/100;
  d2=(sp*sd)/100;
  d3=(ap*ad)/100;
  ft=fp-d1+fs;
  st=sp-d2+ss;
  at=ap-d3+as;
  std::cout<<"In Flipkart Rs."<<ft<<"\n";
  std::cout<<"In Snapdeal Rs."<<st<<"\n";
  std::cout<<"In Amazon Rs."<<at<<"\n";
  if(ft<=st && ft<=at)
  {
    std::cout<<"He will prefer Flipkart";
  }
  else if(st<=ft && st<=at)
  {
    std::cout<<"He will prefer Snapdeal";
  }
  else 
  {
    std::cout<<"He will prefer Amazon";
  } 
}
