def add_length(str_):
    l = str_.split(' ')
    for s in range(len(l)):
        l[s] = f'{l[s]} {len(l[s])}'
        print(s)
    return l