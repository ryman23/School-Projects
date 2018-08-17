#include <iostream>
using namespace std;

int main()
{
	int x;
	int num[10];
	for (x = 0; x < 10; x++)
	{
		cout << "Please enter an integer: ";
		cin >> num[x];
	}

	int total = 0;
	
	int lowest = num[0];
	for (x = 1; x < 10; x++)
		if (num[x] < lowest)
			lowest = num[x];
	cout << "Lowest is " << lowest << endl;

	return 0;
}