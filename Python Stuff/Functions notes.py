#str to int
int('55')
#also float to int
int(33.3)
float('98.6')
str(42)
#add math module
import math
print(math.pi)

#make your own functions
def print_x():
  print(3+4)
  print(4+5)

print_x()

def greeting(name):
  print('Welcome, ' + name + '!')

greeting('Greg')

snatch = float(input('Enter your best snatch in pounds: '))
cj = float(input('Enter your best clean and jerk in pounds: '))
print('Converting to kilograms')
total = snatch + cj
lbtokg = (total / 2.2)
total_formatted = format(lbtokg, '.2f')
print(total_formatted)

print('\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/')



