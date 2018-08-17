def ifTest(count):
    if(count > 0):
        print('*' + '\t' + '*')
        count = count - 1
        ifTest(count)
    else:
        print('*********')
        print('Done!')

count = 9

print('Size = ' + str(count) + 'x' + str(count))
print('*********')
ifTest(count)

