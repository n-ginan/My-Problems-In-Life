def find_short(s):
    new_s = s.split(' ')
    length = 100
    for s in new_s:
        if len(s) < length:
            length = len(s)
    return length