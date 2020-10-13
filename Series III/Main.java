#include<iostream>
int main()
{
  int n,i,j=1,k=6;

  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    std::cout<<k<<" ";
    j=i*5;
    k=k+j;
  }
  
}
