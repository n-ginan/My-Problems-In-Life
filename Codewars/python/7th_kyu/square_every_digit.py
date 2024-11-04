def square_digits(num):
    n_str = ''
    nn = str(num)
    for n in nn:
        n_str += str(int(n)**2)
    return int(n_str)