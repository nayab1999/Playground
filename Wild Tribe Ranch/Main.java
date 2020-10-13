#include<iostream>
int main()
{
   int max,wt;
  std::cin>>max>>wt;
  if(wt<max)
    std::cout<<"Yes, you can enter.";
  else if(wt==max)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Sorry, you can't enter";
}