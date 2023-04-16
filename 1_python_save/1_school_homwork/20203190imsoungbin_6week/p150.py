from random import choice
from itertools import product

ls = list(product(('right','left','middle'),('up','down'),repeart = 1))
a = imput('select=> (right,left,middle)+(up,down):	 ' ).split()
b = choice(ls)

if a==b:
	print(a,'\n',b,'\n',a,'win')
else:
	print(a,'\n',b,'\n',a,'lose')
