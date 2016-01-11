def slow_reverse(string):
    return_string = ""
    for i in range(len(string)-1, -1, -1):
        return_string.join(string[i])
    return return_string