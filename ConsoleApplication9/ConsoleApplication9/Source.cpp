#include <iostream>
#include <string>
using namespace std;

struct employeeInfo
{
	string name;
	int hours;
	float payRate;
};

void displayEmployees(employeeInfo employees[3])
{
	cout << "The employee's are: " << endl;

	for (int count = 0; count < 3; count++)
	{
		cout << employees[count].name << " " << endl;
		cout << employees[count].hours << " " << endl;
		cout << employees[count].hours * employees[count].payRate << endl;
	}
}

void calculateWage(employeeInfo E1)
{
	double wages;
	wages = E1.hours * E1.payRate;
	cout << "The wages for " << E1.name << "are " << wages << endl;
}

int main()
{
	employeeInfo employees[3];
		
	for (int count = 0; count < 3; count++)
	{
		cout << "Please enter the name: ";
		getline(cin, employees[count].name);
		cout << "Please enter the number of hours worked: ";
		cin >> employees[count].hours;
		cout << "Please enter the pay rate: ";
		cin >> employees[count].payRate;
		cin.ignore();
	}
	cout << endl;

	displayEmployees(employees);

	for (int count = 0; count < 3; count++)
		calculateWage(employees[count]);

	return 0;
}