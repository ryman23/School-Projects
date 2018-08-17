#Palindrome

"""This program will take a function and determine if it's a plaindrome."""

def palindrome(s):
    s.lower()       #Convert all chars to the same case
    s_to_list = list(s)
    
    x = len(s_to_list)
    y = int(x / 2)
    
    l1 = s_to_list[0:y]
    l2 = s_to_list[y+1:]

    l1.sort()
    l2.sort()

    if(l1 == l2):
        return True
    else:
        return False
    
        

#__main__

done = 'y'      #Initalize done(default 'y')

while(done == 'y'):
    word = input("Please enter a word to test: ")
    result = palindrome(word)
    print("Is", word, "a palindrome?", result)
    done = input("Done? Enter 'y' or 'n': ")
