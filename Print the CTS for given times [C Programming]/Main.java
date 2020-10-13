#include<stdio.h>
int main() 
{  
  int x;
  for(x=-1; x<=10; x++)
  {
    if(x < 5)
      printf("CTS\n");
    else
      break;
  } 
  return 0;  
}

