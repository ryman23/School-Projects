#1
##""" This function will take in 3 integers and determine if any of them are equal to 0.
##If any of the intergers are equal to zero, the function will display True, if not, false."""
##
##def zeroCheck(a,b,c):
##    if(a == 0):
##        return True
##    elif(b == 0):
##        return True
##    elif(c == 0):
##        return True
##    else:
##        return False
##
##def zeroCheckv2(a,b,c):
##    return a == 0 & b == 0 & c ==0
##
##a = zeroCheck(88,1,43)
##print(a)
##b = zeroCheckv2(0,1,2)
##print(b)

#2
##""" This function will take 3 integers and determine if they are in ordered form from
##smallest to greatest. If order is correct, it will return True, if not, it will return false."""
##
##def ordered3(a,b,c):
##    if(a > b):
##        return False
##    elif(b > c):
##        return False
##    else:
##         return True
##
##def ordered3v2(a,b,c):
##    return a < b < c
##
##a = ordered3(1,2,3)
##print(a)
##b = ordered3v2(2,1,5)
##print(b)

#3
""" This function will display hello world, my name is NAME, NAME is a string passed by the user."""

def helloWorld(name):
    print('Hello World, my name is ', name)

name = 'Bobby'
helloWorld(name)


#4
##""" This function will take a value passed by the user and print out that many asterisks while n < 75."""
##
##def printAsterisks(value):
##    if(value > 75):
##        print("Value greater than 75, please try again.")
##    else:
##        for x in range(value):
##            print('*')
##
##printAsterisks(5)
