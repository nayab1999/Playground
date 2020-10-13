#include<iostream>
int main()
{
  int en,tn,sum=0;
  std::cin>>en>>tn;
  int p=en+tn;
 for(int i=1;i<p;i++)
  {
    if(p%i==0)
    {
      sum+=i;
    }
 }
  if(sum==p)
  {
    std::cout<<"They can read the message";
  }
  else
  {
    std::cout<<"They can't read the message";
  }
}
  