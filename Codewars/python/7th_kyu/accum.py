def accum(st):
    s = ''
    for i in range(len(st)):
        for j in range(-1, i):
            if j == -1:
                s += st[i].upper()
            else:
                s += st[i].lower()
        if i == len(st) - 1:
            break
        s += '-'
    return s