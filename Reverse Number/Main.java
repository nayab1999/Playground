#include <iostream>
int main() 
{
	// Type your code here
  int n;
  std::cin>>n;
  int r;
  while(n>0)
  {
    r=n%10;
    std::cout<<r;
    n=n/10;
  }
	return 0;
}