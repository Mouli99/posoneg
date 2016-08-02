#include<stdio.h>
int main()
{
double a;
printf("Enter a number: ");
scanf("%lf", &a);
if (a<=0.0)
{
if (a==0.0)
printf("number is 0");
else
printf("negative number");
}
else
printf("positive number.");
return 0;
}