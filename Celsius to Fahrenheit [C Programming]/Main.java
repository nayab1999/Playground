#include <stdio.h>
float fahrenheit(float celsius);
float kelvin(float celsius);
int main()
{
    float celsius;
    scanf("%f",&celsius);
    printf("temperature in Fahrenheit %f\n", fahrenheit(celsius));
    printf("temperature in Kelvin %f", kelvin(celsius));
    return 0;
}
float fahrenheit(float celsius)
{
	//type your code here
  float f;
  f=(float)(celsius *1.8)+32;
  return f;
  
}
float kelvin(float celsius)
{
	//type your code here
  float k;
  k=273.15+celsius;
  return k;
}
