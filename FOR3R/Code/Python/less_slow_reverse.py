def less_slow_reverse(string):
    n = len(string)
    char_list = [""]*n
    for i in range(0, n):
        char_list[i] = string[n-i-1]
    return "".join(char_list)