import random

win = (('rock','paper','scissors'),('scissors','rock','paper'))

a = input('rock paper scissors!!')
b = random.choice(win[0])

if zip(win) == (a,b):
	print(a,b'win')
elif a==b:
	print(a,b,'same')
else:
	print(a,b,'lose')
