#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,count=0;
  std::cin>>n;
   
  do
  {
    if(n==1)
    {
      std::cout<<n<<"\n";
      break;
    }
    else if(n%2!=0)
    {
      std::cout<<n<<"\n";
      n=(3*n)+1;
      count++;
    }
    else if(n%2==0)
    {
      std::cout<<n<<"\n";
      n=n/2;
      count++;
    }
    
  }while(n>0);
  
  std::cout<<count;
}