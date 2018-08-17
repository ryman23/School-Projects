// This program will be able to calculate the monthly sales tax report.
#include <iostream>;
#include <iomanip>;
#include <string>;
using namespace std;

int main()
{
	string monthName;				// The month you want to look up.
		  
	double year,					// The year you want to look up.
		   amountCollected,			// The amount collected during that month.
		   totalSales,				// The total sales not including sales tax.
		   countyTotal,				// The total sales tax for the county.
		   amountTaxed,				// The total amount of tax.
		   stateTotal;				// The total sales tax for the state.

	double const stateTax = .04,	// The state sales tax rate.
		         countyTax = .02;	// The county sales tax rate.

	// Ask the month.
	cout << "Month: ";
	cin >> monthName;

	// Ask the year.
	cout << "Year: ";
	cin >> year;

	// Ask the ammount collected.
	cout << "Amount collected: ";
	cin >> amountCollected;
	
	cout << endl;
	cout << endl;

	// Calculate the sales taxes.
	totalSales = amountCollected / 1.06;
	countyTotal = totalSales * countyTax;
	stateTotal = totalSales * stateTax;
	amountTaxed = countyTotal + stateTotal;
	
	// Build the report.
	cout << "Month: " << monthName << endl;
	cout << "----------------------" << endl;
	cout << "Total collected: " << setw(5) << "$" << amountCollected << endl;
	cout << "Sales: " << setw(15) << "$" << totalSales << endl;
	cout << "County sales tax: " << setw(4) << "$" << countyTotal << endl;
	cout << "State sales tax: " << setw(5) << "$" << stateTotal << endl; 
	cout << "Total sales tax: " << setw(5) << "$" << amountTaxed << endl;
	return 0;
}