#include<iostream>
int main()
{
  int a,b;
  std::cin>>a>>b;
  std::cout<<"Enter first number : ";
  std::cout<<"Enter second number : ";
  std::cout<<"Menu"<<"\n"<<"1.Addition"<<"\n"<<"2.Subtraction"<<"\n"<<"3.Multiplication\n"<<"4.Division\n"<<"5.Remainder\n";
  int ch;
  std::cin>>ch;
  switch(ch)
  {
    case 1:std::cout<<(a+b)<<"\n";
           break;
    case 2:std::cout<<(a-b)<<"\n";
           break;
    case 3:std::cout<<(a*b)<<"\n";
           break;
    case 4:std::cout<<(a/b)<<"\n";
           break;
    case 5:std::cout<<(a%b)<<"\n";
           break;
    default:std::cout<<"Invalid operation";
  }
}
  