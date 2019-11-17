#include "stdlib.h"
#include "stdio.h"

void CtoF(float t)
{
	t = t * 9 / 5 + 32;
	printf("Farenheit: %.2f\n", t);
}

void CtoK(float t)
{
	t = t + 273;
	printf("Kelvin: %.2f\n", t);
}

void KtoF(float t)
{
	t = (t + 273) * 9 / 5 + 32;
	printf("Farenheit: %.2f\n", t);
}

void KtoC(float t)
{
	t = t - 273;
	printf("Celsius: %.2f\n", t);
}

void FtoC(float t)
{
	t = ((t - 32) * 5) / 9;
	printf("Celsius: %.2f\n", t);
}

void FtoK(float t)
{
	t = (((t - 32) * 5) / 9) + 273;
	printf("Kelvin: %.2f\n", t);
}

int main(int argc, char *argv[])
{

	if (argc <= 1)
	{
		printf("No one argu\n");
		return 0;
	}

	if (argc == 2)
	{
		float temp = atof(argv[1]);
		if (temp >= -273)
		{
			printf("Celsius: %.2f\n", temp);
			CtoK(temp);
			CtoF(temp);
			printf("\n");
		}
		else
			printf("does not exist");

		if (temp >= 0)
		{
			printf("Kelvin: %.2f\n", temp);
			KtoC(temp);
			KtoF(temp);
			printf("\n");
		}
		else
			printf("does not exist");

		if (temp >= -459, 67)
		{
			printf("Farenheit: %.2f\n", temp);
			FtoC(temp);
			FtoK(temp);
			printf("\n");
		}
		else
			printf("does not exist");
	}

	if (argc == 3)
	{
		float t = atof(argv[1]);
		char type_t = towlower(*argv[2]);
		switch (type_t)
		{
		case 'c':
		{
			if (t >= -273)
			{
				printf("Celsius: %.2f\n", t);
				CtoF(t);
				CtoK(t);
			}
			else
				printf("does not exist");
			break;
		}
		case 'k':
		{
			if (t >= 0)
			{
				printf("Kelvin: %.2f\n", t);
				KtoC(t);
				KtoF(t);
			}
			else
				printf("does not exist");
			break;
		}
		case 'f':
		{
			if (t >= -459, 67)
			{
				printf("Farenheit: %.2f\n", t);
				FtoC(t);
				FtoK(t);
			}
			else
				printf("does not exist");
			break;
		}
		}
	}
	return 0;
}
