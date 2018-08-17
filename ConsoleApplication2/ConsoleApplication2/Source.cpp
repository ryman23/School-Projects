#include <iostream>
#include <iomanip>
using namespace std;

void getTestScores(int &t1, int &t2, int &t3, int &t4, int &t5, int &t6)
{
	cout << "Enter first test score: ";
	cin >> t1;
	cout << "Enter second test score: ";
	cin >> t2;
	cout << "Enter third test score: ";
	cin >> t3;
	cout << "Enter fourth test score: ";
	cin >> t4;
	cout << "Enter fifth test score: ";
	cin >> t5;
	cout << "Enter sixth test score: ";
	cin >> t6;
}

int main()
{
	int tst1, tst2, tst3, tst4, tst5, tst6, average;
	getTestScores(tst1, tst2, tst3, tst4, tst5, tst6);
	average = (tst1 + tst2 + tst3 + tst4 + tst5 + tst6) / 6;
	cout << average << endl;
	return 0;
}