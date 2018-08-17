// This program will tell the user information about two movies with the same name.
#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

struct MovieData
{
	string movieName;
	string director;
	int releaseYear;
	int runningTime;
};

void displayMovie(MovieData movie1, MovieData movie2);

int main()
{
	// Movie 1 data.
	MovieData movie1;
	movie1.movieName = "War of the Worlds";
	movie1.director = "Byron Haskin";
	movie1.releaseYear = 1953;
	movie1.runningTime = 88;

	// Movie 2 data.
	MovieData movie2;
	movie2.movieName = "War of the Worlds";
	movie2.director = "Stephen Spielberg";
	movie2.releaseYear = 2005;
	movie2.runningTime = 118;

	displayMovie(movie1, movie2);

	return 0;
}

void displayMovie(MovieData movie1, MovieData movie2)
{
	// Movie 1.
	cout << "Title" << setw(9) << ": " << movie1.movieName << endl;
	cout << "Director" << setw(6) << ": " << movie1.director << endl;
	cout << "Released" << setw(6) << ": " << movie1.releaseYear << endl;
	cout << "Running Time" << setw(1) << ": " << movie1.runningTime << " Minutes" << endl;		
	cout << endl;
	cout << endl;

	// Movie 2.
	cout << "Title" << setw(9) << ": " << movie2.movieName << endl;
	cout << "Director" << setw(6) << ": " << movie2.director << endl;
	cout << "Released" << setw(6) << ": " << movie2.releaseYear << endl;
	cout << "Running Time" << setw(1) << ": " << movie2.runningTime << " Minutes" << endl;
}