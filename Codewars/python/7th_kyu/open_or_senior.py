def open_or_senior(data):
    l = []
    for i in data:
        if i[0] >= 55 and i[1] > 7:
            l.append('Senior')
        else:
            l.append('Open')
    return l