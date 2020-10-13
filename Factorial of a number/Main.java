#include<iostream>
int main(){
  // Type your code here
  int n,f=1;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    f=f*i;
  }
  std::cout<<f;
}