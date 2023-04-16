x = lambda x: print(x + 3)
#y = eval('{}'.format(input()).split())
a,b = input().split()
print(a,b)
eval('{0}({1})' .format(a,b))

#eval('{a} ({b})'.format(input().split()))

