# CP Practice
# Problem: https://codeforces.com/problemset/problem/791/A

input = input().split()
weightLimak = int(input[0])
weightBob = int(input[1])

LimakMult = 3
bobMult = 2
year = 0

while weightLimak <= weightBob:
    weightLimak *= LimakMult
    weightBob *= bobMult
    year += 1

print(year)
