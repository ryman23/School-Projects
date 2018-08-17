// This program will calculate the total rainfall per year.
#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
	double year,
		   rain1, rain2, rain3, rain4, rain5, rain6, rain7, rain8, rain9, rain10, rain11, rain12,
		   average,
		   total;

	// Display the heading.
	cout << "This program will calculate average rainfall over a period of given years." << endl;
	cout << "How many years do you wish to average? ";
	cin >> year;

	// Get the rainfall for the years.

	for (year = 1; year >= 3; year++)
	{
		cout << "Year 1" << endl;
		cout << "Number of inched of rain for month 1? ";
		cin >> rain1;
		cout << "Number of inches of rain for month 2? ";
		cin >> rain2;
		cout << "Number of inched of rain for month 3? ";
		cin >> rain3;
		cout << "Number of inches of rain for month 4? ";
		cin >> rain4;

		cout << "Year 2" << endl;
		cout << "Number of inched of rain for month 1? ";
		cin >> rain5;
		cout << "Number of inches of rain for month 2? ";
		cin >> rain6;
		cout << "Number of inched of rain for month 3? ";
		cin >> rain7;
		cout << "Number of inches of rain for month 4? ";
		cin >> rain8;

		cout << "Year 3" << endl;
		cout << "Number of inched of rain for month 1? ";
		cin >> rain9;
		cout << "Number of inches of rain for month 2? ";
		cin >> rain10;
		cout << "Number of inched of rain for month 3? ";
		cin >> rain11;
		cout << "Number of inches of rain for month 4? ";
		cin >> rain12;
	}
	
	// Calculate the total rainfall.
	total = (rain1 + rain2 + rain3 + rain4 + rain5 + rain6 + rain7 + rain8 + rain9 + rain10 + rain11 + rain12);

	// Avergae the rainfall.
	average = total / 12;
	
	// Display the results.
	cout << "Over a period of 12 months, " << total << " inches of rain fell." << endl;
	cout << "Average monthly rainfall for the period was" << average << " inches." << endl;
	return 0;
}