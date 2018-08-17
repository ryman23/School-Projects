//This program calculates the total price for a meal including tax and tip.
#include <iostream>
using namespace std;

int main()
{
	double mealPrice, tip, tax, total;

	const double taxRate = .0675;
	const double tipRate = .2135;

	//Get the meal price.
	cout << "Meal $";
	cin >> mealPrice;

	//Calculate the tax
	tax = mealPrice * taxRate;
	cout << "Tax $" << tax << endl;

	//Calculate the tip.
	tip = mealPrice * tipRate;
	cout << "Tip $" << tip << endl;

	//Calculate the total price.
	total = mealPrice + tip + tax;
	cout << "Total $" << total << endl;
	return 0;
}