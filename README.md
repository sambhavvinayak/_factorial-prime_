# _factorial-prime_
find whether the factorial of a number is prime or not?
Approach: In order for N to be factorial number, N must be a prime and either N – 1 or N + 1 should be the value of factorial of any number. 
If N is not prime then print No. 
Else set fact = 1 and starting from i = 1 update fact = fact * i, if fact = N – 1 or fact = N + 1 then print Yes.
