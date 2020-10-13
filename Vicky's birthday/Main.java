#include<iostream>
int main()
{
  int y;
  std::cin>>y;
  if(y%4==0)
  {
    if(y%100==0)
    {
      if(y%400==0)
      {
        std::cout<<"Vicky can celebrate his birthday.";
      }
      else
      {
        std::cout<<"Vicky can't celebrate.";
      }
    }
     else
     {
       std::cout<<"Vicky can celebrate his birthday.";
     }
  }
  else
  {
    std::cout<<"Vicky can't celebrate.";
  }
}