#include <stdio.h>
#include <stdlib.h>

int what_day(int day,int month,int year)
{
    int a = (14 - month) / 12;
    int y = year - a;
    int m = month + 12 * a - 2;
    return (7000 + day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
}

int main()
{
    int day;
    int month;
    int year;
    printf("Wwedite day: ");
    scanf("%d", &day);
    printf("Wwedite moth: ");
    scanf("%d", &month);
    printf("Wwedite year: ");
    scanf("%d", &year);
   if (what_day(day, month, year) == 0) printf("woskresenye");
   if (what_day(day, month, year) == 1) printf("ponedelnik");
   if (what_day(day, month, year) == 2) printf("vtornik");
   if (what_day(day, month, year) == 3) printf("sreda");
   if (what_day(day, month, year) == 4) printf("chetverg");
   if (what_day(day, month, year) == 5) printf("pyatnica");
   if (what_day(day, month, year) == 6) printf("subbota");
    return 0;
}
