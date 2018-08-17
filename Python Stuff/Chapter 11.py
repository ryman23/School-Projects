#Dictionaries

""" Dict. contains a collection of indices called keys. the assoc,
key and a value is called a key-value pair(item). In math lang, dict reps mapping
from keys to values, aka, each key maps to a value."""

##end2sp = dict()
##eng2sp = {'one': 'uno', 'two': 'dos', 'three': ' tres'}
##
##print(eng2sp['two'])
##print('one' in eng2sp)
##
##results = 'dos' in eng2sp.values()

##def histogram(s):
##    d = dict()
##    for c in s:             #For each char in s
##        if c not in d:      #If it is not in the result dict
##            d[c] = 1        #Add it and initialize to 1
##        else:               #Otherwise
##            d[c] += 1       #Add one to the entry
##    return d
##
##h = histogram('brontosaurus')
##print(h)
##print(h.get('a', 0))    #Key and value to return if not found

##def print_dict(d):
##    for key in sorted(d):       #Sorted based on key value
##        value = d[key]
##        print(key, value)
##
##my_dict = {'foo':42, 'bar':-44.1, 'baz':'Luhrmann', 'qux':True} 
##print_dict(my_dict)

##def reverse_lookup(d, v):
##    for key in d:
##        if d[key] == v:
##            return key
##    raise LookupError()
##
##my_dict = {'foo':42, 'bar':-44.1, 'baz':'Luhrmann', 'qux':77}
##key = reverse_lookup(my_dict, 77)
##print(key)

"""Lookup"""
##value = my_dict.get(key, False)
##print("The value corresponding to the key,", key, "is", value)

"""Scope"""
def func1():
    n = 10
    print('n in func1 =', n)

def func2():
    n = 20
    print('n in func2 =', n)

func1()
func2()
