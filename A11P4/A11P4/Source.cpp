// This program wil determine if the string entered by the user is a palindrome.
#include <iostream>
#include <cstring>
#include <cctype>
using namespace std;

int main()
{
	// Variables.
	const int size = 60;
	char str1[size], str2[size];
	int count1 = 0, count2 = 0;

	// Ask the user to input a string.
	cout << "Please enter a string: " << endl;
	cin.getline(str1, size);
	
	// While loop.
	while (str1[count1] != '\0')
	{
		if (isalpha(str1[count1]))
			str2[count2++] = tolower(str1[count1]);
		count1++;
	}

	str2[count2] = '\0';

	int length;
	length = strlen(str2);
	
	// For loop.
	for (int count1 = 0; count1 < (length / 2); count1++)
	{
		if (str2[count1] != str2[length - count1 - 1])
		{
			cout << "This is not a palindrome." << endl;
			return 0;
		}
	}

	// Display the results.
	cout << "That is a palindrome." << endl;

	return 0;
}