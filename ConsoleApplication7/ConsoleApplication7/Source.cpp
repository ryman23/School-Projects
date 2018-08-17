// This program will capitalized the letters in the beginning of each sentence for the user.
#include <iostream>
#include <cctype>
#include <cstring>
using namespace std;

int main()
{
	// Variables.
	const int SIZE = 80;
	char str[SIZE];

	cout << "Enter atleast two sentences, but do not use capital letters";
	cout << endl;
	cin.getline(str, SIZE);

	int count = 0;

	// Loop to find the periods and spaces.
	while (str[count] != 0)
	{
		if (count == 0 && isalpha(str[count]))
			str[count] = toupper(str[count]);
		else if (str[count] == '.')
			str[count + 2] = toupper(str[count + 2]);
		count++;
	}

	// Display the results.
	cout << endl;
	cout << "Here are your sentences with beginning leters capitalized: " << endl;
	cout << str << endl;
	cout << endl; 

	return 0;
}