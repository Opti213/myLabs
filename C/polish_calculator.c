#include "stdio.h"
#include "ctype.h"
#include "stdlib.h"

#define MAX_SIZE 1000000

double stack[MAX_SIZE];
int stack_pos = -1;

double pop()
{
    double number = 0;
    if (stack_pos >= 0)
    {
        number = stack[stack_pos--];
    }
    else
    {
        printf("empty stack");
    }

    return number;
}

void push(double number)
{
    stack[++stack_pos] = number;
}

int main()
{
    int i = 0;
    char *ptr;
    char str[MAX_SIZE];

    fgets(str, MAX_SIZE - 1, stdin);

    while (str[i] != '\0')
    {
        if (isdigit(str[i]))
        {
            double tmp = strtod(str + i, &ptr);
            push(tmp);
            i += (int)(ptr - (str + i));
            continue;
        }
        else if (isspace(str[i]))
        {
            i++;
            continue;
        }
        else
        {

            double a, b;
            b = pop();
            a = pop();

            switch (str[i])
            {
            case '+':
                a += b;
                push(a);
                break;
            case '-':
                a -= b;
                push(a);
                break;
            case '*':
                a *= b;
                push(a);
                break;
            case '/':
                a /= b;
                push(a);
                break;
            default:
                push(a);
                push(b);
                break;
            }
            i++;
        }
    }
    printf("%.0lf\n", pop());
    getchar();
    return 0;
}
