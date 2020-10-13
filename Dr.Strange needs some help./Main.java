#include<iostream>
#include<cmath>

int main()
{
  int m,n,req;
  std::cin>>m>>n>>req;
  int d=pow(m,n);
  if(d>=req)
    std::cout<<"Doctor, you can proceed with your experiment.";
  else if (d<req)
    std::cout<<"Sorry Doctor! You need more bacteria.";
  return 0;
}

    