#include<iostream>
using namespace std;
class Rectangle{
	double l,w;
  public:
  Rectangle(double l,double w):l(l),w(w)
  {
    if(this->l<0)
      this->l=0;
    if(this->w<0)
      this->w=0;
  }
  double getlength()
  {
    return l;
  }
  double getwidth()
  {
    return w;
  }
  double getarea()
  {
    return l*w;
  }
};
class Cuboid : public Rectangle
{
	double h;
    public:
    Cuboid(double l,double w,double h):Rectangle(l,w),h(h)
    {
    	if(this->h<0)
        this->h=0;
        }
    double getheight()
    {
    	return h;
    }
    double getvolume()
    {
    	return getarea()*h;
        }
};
int main(){
	double l,w,h;
  cin>>w>>l>>h;
  Rectangle r(l,w);
  cout<<"Rectangle width: "<<r.getwidth();
  cout<<"\nRectangle length: "<<r.getlength();
  cout<<"\nRectangle area: "<<r.getarea();
  Cuboid c(l,w,h);
  cout<<"\nCuboid width: "<<c.getwidth();
  cout<<"\nCuboid length: "<<c.getlength();
  cout<<"\nCuboid height: "<<c.getheight();
  cout<<"\nCuboid volume: "<<c.getvolume();
	return 0;
}