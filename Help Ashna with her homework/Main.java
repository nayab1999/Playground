#include<iostream>
int main()
{
   int a,b,sum=0,diff=0,prod,quo,rem;
   std::cin>>a>>b;
   sum=a+b;
  diff=a-b;
  prod=a*b;
  quo=a/b;
  rem=a%b;
  std::cout<<"a+b="<<sum<<"\n";
  std::cout<<"a-b="<<diff<<"\n";
  std::cout<<"a*b="<<prod<<"\n";
  std::cout<<"a/b="<<quo<<"\n";
  std::cout<<"a%b="<<rem<<"\n";
  
}