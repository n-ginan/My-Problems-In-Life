l1 = []
l2 = []

for _ in range(int(input())):
    x, y = map(int, input().split())
    l1.append(x)
    l2.append(y)

sum = 0

for num in l1:
    sum += l2.count(num)

print(sum)
