def is_anagram(test, original):
    if len(test) != len(original):
        return False
    t = test.lower()
    o = original.lower()
    t_hash = {}
    o_hash = {}
    for i in range(len(t)):
        t_hash[t[i]] = t_hash.get(t[i], 0) + 1 
        o_hash[o[i]] = o_hash.get(o[i], 0) + 1
    return True if t_hash == o_hash else False