#include<iostream>
int main()
{
  // Type your code here
  int n,d=0;
  std::cin>>n;
  do
  {
    int r=n%10;
    n=n/10;
    d++;
  }while(n>0);
  std::cout<<d;
}