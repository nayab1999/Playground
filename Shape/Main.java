#include<iostream>
#include<cmath>
using namespace std;

class Shape
{
	public:
  float carea(int x,int y)
  {
    return float(2*3.14*float(x)*float(y)+2*3.14*float(x*x));
  }
  float sarea(int x)
  {
    return float(4*3.14*float(x*x));
  }
  int rarea(int x,int y,int z)
  {
    return x+y+z;
  }
};
int main()
{
	int a,b,c,choice;
  Shape s;
  cout<<"1.Cylinder\n"<<"2.Sphere\n"<<"3.Rectangular prism\n"<<"Enter the choice";
  cin>>choice;
  switch(choice)
  {
      case 1:cin>>a>>b;
      		cout<<"\nArea of Cylinder is "<<s.carea(a,b);
      		break;
    case 2:cin>>a;
      		cout<<"\nArea of Sphere is "<<s.sarea(a);
      		break;
    case 3:cin>>a>>b>>c;
      		cout<<"\nArea of Rectangular prism is "<<s.rarea(a,b,c);
      		break;
}
}