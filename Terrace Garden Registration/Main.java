#include<iostream>
#include<string>
using namespace std;

class Customer
{
	string name,address,contact,email,proof,id;
  public:
  string getname()
  {return name;}
  string getaddress()
  {return address;}
  string getcontact()
  {return contact;}
  string getemail()
  {return email;}
  string getproof()
  {return proof;}
  string getid()
  {return id;}
  void setname(string s)
  {name=s;}
  void setaddress(string s)
  {address=s;}
  void setcontact(string s)
  {contact=s;}
  void setemail(string s)
  {email=s;}
  void setproof(string s)
  {proof=s;}
  void setid(string s)
  {id=s;}
};
int main()
{string s;
 Customer c;
    cout<<"Registration"<<"\n"<<"Enter your name";
 cin>>s;
 c.setname(s);
 cout<<"\nEnter your address";
 cin>>s;
 c.setaddress(s);
 cout<<"\nContact Number";
 cin>>s;
 c.setcontact(s);
 cout<<"\nE-Mail ID";
 cin>>s;
 c.setemail(s);
 cout<<"\nEnter proof type";
 cin>>s;
 c.setproof(s);
 cout<<"\nEnter proof id";
 cin>>s;
 c.setid(s);
 cout<<"\n"<<"Customer Details";
 cout<<"\n"<<c.getname()<<"\n"<<c.getaddress()<<"\n"<<c.getcontact()<<"\n"<<c.getemail()<<"\n"<<c.getproof()<<"\n"<<c.getid();
 cout<<"\nThank you for registering. Your id is 1...";
    return 0;
}