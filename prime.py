def prime(num):
	isprime = True
	for i in range(2, num-1):
		if num%i == 0:
			isprime = False
	if isprime:
		return True
	else:
		return False

while True:
	a = int(input("enter a number..."))
	if prime(a):
		print("hey the number is prime dude!!")
		break
	else:
		print("sorry retry... :(")