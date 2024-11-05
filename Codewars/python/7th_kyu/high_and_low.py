def high_and_low(numbers):
    l = [int(num) for num in numbers.split()]
    lowest = l[0]
    highest = l[0]
    for num in l:
        if num < lowest:
            lowest = num
        if num > highest:
            highest = num
    return f'{highest} {lowest}'