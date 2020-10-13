#include<iostream>
using namespace std;
class Student{
  public:
  int marks[5],total;
  int calctotal()
  {
    total=0;
    for(int i=0;i<5;i++)
      total+=marks[i];
    return total;
  }
};
int main(){
  int n;int total,count=0;
  cin>>n;
  Student s[n];
  for(int i=0;i<n;i++)
    for(int j=0;j<5;j++)
      cin>>s[i].marks[j];
  total=s[0].calctotal();
  for(int i=1;i<n;i++)
  {
    if(s[i].calctotal()>total)
      count++;
  }
  cout<<count;
  return 0;
}