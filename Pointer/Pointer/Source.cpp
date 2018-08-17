#include <iostream>
#include <string>
using namespace std;

int main()
{
	int num[4] = { 1, 2, 3, 4 };
	int *ptr;
	ptr = num;

	for (int x = 0; x < 4; x++)
	{
		cout << *(ptr+x) << endl;
	}
	return 0;
}