// This program will ask the user for their name then display it it last, first, middle order.
#include <iostream>
#include <cstring>
#include <string>
using namespace std;

int main()
{
	char fName[15], lName[20], mName[15];
	
	// Get the names.
	cout << "Please enter the first name: ";
	cin.getline(fName, 15);
	cout << "Please etner the middle name: ";
	cin.getline(mName, 15);
	cout << "Please enter the last name: ";
	cin.getline(lName, 20);

	// Attached spaces and commas
	strcat(lName, ", ");
	strcat(fName, " ");
	
	//Disply the results.
	cout << lName << fName << mName << endl;

	return 0;
}