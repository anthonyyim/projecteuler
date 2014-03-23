a = 1
b = 2
total = 0

while True:
	print b
	if b%2 == 0:
		total += b

	temp = b
	b = a + b

	if b > 4000000:
		print 'Finished, sum is %d.' % total
		break

	a = temp
