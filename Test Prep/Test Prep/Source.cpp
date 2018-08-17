#include <iostream>
#include <cctype>
#include <cstring>
#include <string>
using namespace std;

int main()
{
	const int SIZE = 60;
	char A[SIZE] = { "Hello " };
	char B[SIZE] = { "It's " };
	char C[SIZE] = { "Wednesday!" };
	char D[SIZE] = { 0 };

	strcat(D, A);
	strcat(D, B);
	strcat(D, C);
	cout << D << endl;

	char a[SIZE] = { "Z " };
	char z[SIZE] = { "Z " };

	if (strcmp(a, z) == 0)
		cout << "Same" << endl;
	if (strcmp(a, z) > 0)
		cout << a << z << endl;
	if (strcmp(a, z) < 0)
		cout << z << a << endl;

	char word1[SIZE] = { "Words " };
	char word2[SIZE] = { "Gone" };
	strcpy(word2, word1);
	cout << word2 << endl;
	return 0; 
}