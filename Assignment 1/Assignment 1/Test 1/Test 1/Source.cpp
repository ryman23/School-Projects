// This program will calculate the total retail sale.
#include <iostream>
using namespace std;

int main()
{
	double price, taxRate, salesTax, total;

	// Get the retail price.
	cout << "Please enter the retail price: ";
	cin >> price;

	// Get the tax rate.
	cout << "Please enter the tax rate: ";
	cin >> taxRate;

	// Calculate the sales tax.
	salesTax = price * taxRate;

	// Display the tax rate.
	cout << "The sales tax is $" << salesTax << endl;

	// Calculate the total price.
	total = price + salesTax;

	// Display the total price.
	cout << "The total price is $" << total << endl;
	return 0;
}