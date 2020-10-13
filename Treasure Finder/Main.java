#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
    int a,b,c,d,e,i;
  std::cin>>a>>b>>c;
  if(a<b && a>c)
  {
    d=a;
  }
  else if(a>b && a<c)
  {
    d=a;
  }
  else if(b<a && b>c)
  {
    d=b;
  }
  else if(b>a && b<c)
  {
    d=b;
  }
  else if(c<a && c>b)
  {
    d=c;
  }
  else if(c>a && c<b)
  {
    d=c;
  }
  std::cout<<"The treasure is in box which has number "<<d<<"\n";
  for(i=9;i>=1;i--)
  {
    if(a%i==0 && b%i==0 && c%i==0)
    {
      e=i; 
      break;
    }
    
  }
      std::cout<<"The code to open the box is "<<i;
}