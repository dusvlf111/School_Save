


for i in range(int(input())):
	age, name = input().split()
	inx = i+1

lit = list(zip(age, inx, name))
print(lit)
