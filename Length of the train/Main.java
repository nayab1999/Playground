#include <iostream>
using namespace std;
class Calculation
{public:
 double speedconversion(int x)
 {
   return (double)(double(x)*5/18);
 }
 double length_of_train(double y,int z)
 {
   return (y*z);
 }
};
int main() {
  int speed,time;double length;
  cin>>speed>>time;
  Calculation c;
  length=c.length_of_train(c.speedconversion(speed),time);
  cout<<"The length of train is "<<(int)length<<" meter";
  return 0;
}