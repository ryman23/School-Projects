// This program will allow the user to perform differnt math functions.
// The program will do input validation.

#include <iostream>
#include <iomanip>
using namespace std;

void addNumbers()
{
	double num1, num2, addTotal;
	
	// Display the message.
	cout << "Please enter 2 numbers: ";
	cin >> num1 >> num2;
	addTotal = num1 + num2;
	cout << "The numbers added together is " << addTotal << endl;
	cout << "Thanks for using the program!" << endl;
}

void subtractNumbers()
{
	double num1, num2, subTotal;

	// Display the message.
	cout << "Please enter 2 numbers: ";
	cin >> num1 >> num2;
	subTotal = num1 - num2;
	cout << "The numbers subtracted is " << subTotal << endl;
	cout << "Thanks for using the program!" << endl;
}

void multiplyNumbers()
{
	double num1, num2, multiTotal;

	//Display the message.
	cout << "Please enter 2 numbers: ";
	cin >> num1 >> num2;
	multiTotal = num1 * num2;
	cout << "The numbers multiplied together is " << multiTotal << endl;
	cout << "Thanks for using the program!" << endl;
}

int divideNumbers()
{
	double num1, num2, divideTotal;

	//Display the message.
	cout << "Please enter 2 numbers: ";
	cin >> num1 >> num2;
	divideTotal = num1 / num2;
	cout << "The numbers divided together is " << divideTotal << endl;
	cout << "Thanks for using the program!" << endl;
}

void quit()
{
	return;
}
int main()
{
	int selection;

	// Display the menu.
	cout << "Math Program:" << endl;
	cout << "   1: Add two numbers." << endl;
	cout << "   2: Subtract two numbers." << endl;
	cout << "   3: Multiply two numbers." << endl;
	cout << "   4: Divide two numbers." << endl;
	cout << "   5: Quit." << endl;
	cin >> selection;

	// Determine the users selection
	while (selection > 0 && selection < 6)
	{
		switch (selection)
		{
		case 1: addNumbers();
			break;
		case 2: subtractNumbers();
			break;
		case 3: multiplyNumbers();
			break;
		case 4: divideNumbers();
			break;
		case 5: quit();
			break;
		default: cout << "Please enter a number between 1 and 5!" << endl;
		}
	}
	return 0;
}