def remove_url_anchor(url):
    for i in range(len(url)):
        if url[i] == '#':
            return url[0:i]
    return url