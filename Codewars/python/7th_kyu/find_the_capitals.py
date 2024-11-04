def capitals(word):
    l = []
    for i in range(len(word)):
        if word[i].isupper():
            l.append(i)
    return l