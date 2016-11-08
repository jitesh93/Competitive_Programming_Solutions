from bisect import bisect_right
n = int(input(""))
x = []
for i in range(n):
	a = input("")
	b = list(map(int, a.split()))
	x.append(b[0]*b[0] + b[1]*b[1])
x = sorted(x)
q = int(input(""))
for i in range(q):
	r =  int(input(""))
	print(bisect_right(x, r*r))