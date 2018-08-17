#include <iostream>
using namespace std;

void display(int num [], int size)
{
	for (int x = 0; x < size; x++)
		cout << num[x] << endl;
}

int main()
{
	int num[4] = { 1, 2, 3, 4 };
	display(num, 4);
	int num1[6] = { 1, 2, 3, 4, 5, 6 };
	display(num1, 6);
	return 0;
}