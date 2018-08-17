#1
""" This program will determine which letter is entered and display
a corrisponding word that starts with that letter. """
    
##result = input("Please enter either 'A', 'B', or 'C':\n")
##
##if(result == 'A'):
##    print("Apple")
##elif(result == 'B'):
##    print("Banana")
##elif(result == 'C'):
##    print("Coconut")
##else:
##    print("You do as you're told!")

#2
""" This program will input the users total accumulated credits and determine their status"""

##total_credits = int(input("Please enter the number of college credits you've accumulated:\n"))
##
##if(total_credits > 90):
##    print("Senior Status")
##elif(total_credits > 60 & total_credits < 90):
##    print("Junior Status")
##elif(total_credits > 30 & total_credits < 60):
##    print("Soppomore Status")
##else:
##    print("Freshman Status")

#3
""" This program will determine the number of whole hours, whole minutes, and whole seconds have
gone by since the comet has passed."""

seconds_since = 68412

#Find Hours
test_minutes = seconds_since / 60
test_hours = test_minutes / 60
mod_hours = format(test_hours, '.0f')

#Find mintues remaining
remaining_minutes = (seconds_since - (test_hours * 60 * 60)) / 60
mod_minutes = format(remaining_minutes, '.0f')

#Find seconds remaining
remaining_seconds = (seconds_since - (test_hours * remaining_minutes) * 60)
mod_seconds = format(remaining_seconds, '.0f')

print("Whole hours:", mod_hours )
print("Whole hours:", mod_hours, " and ", mod_minutes, " minutes since the comet passed")
print("Whole hours:", mod_hours, " and ", mod_minutes, " minutes and ", mod_seconds, " seconds since the comet passed")
