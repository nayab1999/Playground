#include<iostream>
#include<cmath>
int main()
{
  int n,i,j=11,k;
 
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
     k=pow(j,2);
     j=j+4;
    std::cout<<k<<" ";
    
  }
  
}