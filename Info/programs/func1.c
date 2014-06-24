/*
 Create a menu driven program which accept choice from user for  addition, sub, mul or div of two numbers.

*/

#include <stdio.h>

void add(double no1,double no2);
void sub(double no1,double no2);
void mul(double no1,double no2);
void div(double no1,double no2);



void add(double no1,double no2)
{
  printf("\nAddition : %lf\n",no1+no2);
}
void sub(double no1,double no2)
{
  double no3 = no1 - no2;
  printf("\nSubtraction: %lf\n",no3);
}
void mul(double no1,double no2)
{
   printf("\nMultiplication: %lf\n",no1*no2);
}
void div(double no1,double no2)
{
 printf("\nDivition: %lf\n",no1/no2);
}


int main()
{
  int choice = -1;
  double no1,no2;

   /* Menu */
   while(choice!=0)
   {
      printf("\n1. Addition");
      printf("\n2. Subtraction");
      printf("\n3. Multilication");
      printf("\n4. Division");
      printf("\n0. Exit");

      printf("\nEnter your choice : ");
      scanf("%i",&choice);

      if(choice!=0)
      {
         printf("\nEnter two numbers : ");
         scanf("%lf%lf",&no1,&no2);
       }   

      switch(choice)
       {
         case 1:
                add(no1,no2);
                break;
         case 2:
                sub(no1,no2);
                break;
         case 3:
                mul(no1,no2);
                break;
         case 4:
                div(no1,no2);
                break;
         case 0:
                 printf("\nBye.");
                 break;
        }
    }
}