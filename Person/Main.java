#include<iostream>
#include<string.h>
using namespace std;
class Person{
	char fname[100],lname[100];int age;
  public:
  char* getFirstName()
  {
    return this->fname;
  }
  char* getLastName()
  {
    return this->lname;
  }
  int getAge()
  {
    return this->age;
  }
  void setFirstName()
  {
    cin.getline(fname,100);
  }
  void setLastName()
  {
    cin.getline(lname,100);
  }
  void setAge()
  {
    cin>>age;
    if(age<0 || age>100)
      age=0;
  }
  void isTeen()
  {
    if(getAge()>=12 && getAge()<20)
     cout<<"\nisTeen: True";
    else
    cout<<"\nis Teen: False";
  }
  void getFullName()
  {
    cout<<getFirstName()<<" "<<getLastName();
  }
};
int main(){
	Person p;
  p.setFirstName();
  p.setLastName();
  p.setAge();
  cout<<"First Name: "<<p.getLastName();
  cout<<"\nLast Name: "<<p.getFirstName();
  cout<<"\nAge: "<<p.getAge();
  cout<<"\nFull Name: ";p.getFullName();
  p.isTeen();
}