#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum=0,r;
  std::cin>>n;
  int num=n;
  while(n>0)
  {
    r=n%10;
    sum=sum+r;
    n=n/10;
  }
  if(num%sum==0)
  {
    std::cout<<"Harshad Number";
  }
  else
  {
    std::cout<<"Not Harshad Number";
  }
  return 0;
}