
###Input string(s)
##name = input("What is your name?\n")
##print(name, "\n")
##
###Input number(s)
##num = int(input("Enter a number:\n"))
##num = num + 5
##print(num)

##x = 5
##if x > 0:
##    print("x equals = ", x)

##for x in range(5):
##    print("x is: ", x)

##x = 5   
##while x > 0:
##    print("X is: ", x)
##    x = x - 1

#Recursion
def countdown(sec):
    if(sec <= 0):
        print("Lift off!")

    else:
        print(sec)
        sec = sec - 1
        countdown(sec)

countdown(5)    
