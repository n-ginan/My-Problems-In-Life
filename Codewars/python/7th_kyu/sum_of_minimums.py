def sum_of_minimums(numbers):
    sum = 0
    for i in range(len(numbers)):
        min_value = numbers[i][0]
        for j in numbers[i]:
            if j < min_value:         
                min_value = j
        sum += min_value
    return sum