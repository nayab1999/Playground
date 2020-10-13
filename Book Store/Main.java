#include<iostream>
#include <string.h>
using namespace std;
class Customer{
	string custName;char cusType;
  public:
  string getcustName()
  {
    return this->custName;
  }
  char getcusType()
  {
    return this->cusType;
  }
  void setcustName()
  {
    cin>>custName;
  }
  void setcusType()
  {
    cin>>cusType;
  }
};
class Book{
	string bname,isbn,pname; double price=0;int noc;
  public:
  	 string getbname()
  {
    return this->bname;
  }
  string getisbn()
  {
    return this->isbn;
  }
  string getpname()
  {
    return this->pname;
  }
  int getprice()
  {
    return this->price;
  }
  int getnoc()
  {
    return this->noc;
  }
  void setbname()
  {
   cin>>bname;
  }
  void setisbn()
  {
    cin>>isbn;
  }
 void setpname()
  {
    cin>>pname;
  }
  void setprice()
  {
    cin>>price;
  }
  void setnoc()
  {
    cin>>noc;
  }
  double totalAmount(Customer obj)
  {
    if(obj.getcusType()=='S')
     return price-price*0.5;
    else if(obj.getcusType()=='F')
      return price-price*0.75;
    else if(obj.getcusType()=='I')
     return price-price*0.9;
    return price;
  }
};
int main()
{
  Book b;
  double price=0;
  cout<<"Name of the book";
  b.setbname();
  cout<<"\nISBN Number";
  b.setisbn();
  cout<<"\nPublisher name";
  b.setpname();
  cout<<"\nPrice of a book";
  b.setprice();
  cout<<"\nNumber of Customers";
  b.setnoc();
  for(int i=0;i<b.getnoc();i++)
  {
    Customer obj;
    cout<<"\nDetails for Customer "<<i+1;
    cout<<"\nName";
    obj.setcustName();
    cout<<"\nType of Customer (S or I or F)";
    obj.setcusType();
    price+=b.totalAmount(obj);
  }
  cout<<"\nTotal Amount Received :"<<price;
}