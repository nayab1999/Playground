#include<iostream>
void swap(int &a, int &b)
{
  int temp;
  temp=a;
  a=b;
  b=temp;
}
int main()
{
  int n1,n2;
  std::cin>>n1>>n2;
  std::cout<<"Before swapping a= "<<n1<<" and b="<<n2<<"\n";
  swap(n1,n2);
  std::cout<<"After swapping a= "<<n1<<" and b="<<n2;
  return 0;
}
