def check_exam(arr1,arr2):
    res = 0
    for i in range(len(arr1)):
        if arr1[i] == arr2[i]:
            res += 4
        elif arr2[i] == '':
            continue
        else:
            res -= 1
    if res < 0:
        res = 0
    return res