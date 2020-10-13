#include<iostream>
#include<cmath>
int main()
{
  int n,i,j=1;
  float k=0.5;
  std::cin>>n;
  for(i=0;i<n;i++)
  {
 
    std::cout<<k<<" ";
    j=pow(3,i);
    k=k+j;

  }
}