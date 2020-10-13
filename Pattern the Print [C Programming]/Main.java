#include<stdio.h>

void patternPrint(int n)
{
    int print=1,i,j;
    for( int i=1;i<=n;i++)
    {
        for(j=1;j<=i;j++)
        {
            printf("%d",print);
            printf("");
        }
      printf("\n");  
    }
}

int main()
{
    int a;
    scanf("%d",&a);
    patternPrint(a);
    return 0;
}
