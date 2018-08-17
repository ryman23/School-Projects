fin = open('C:/Users/Riley/Desktop/words.txt')

##for line in fin:
##    word = line.strip()
##    print(word)
##    
##line = fin.readline()
##word = line.strip()
##print(word)

""" 20 or more chars"""

for line in fin:
    word = line.strip()
    if len(word) > 20:
        print(word)

    
