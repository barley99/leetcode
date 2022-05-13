s = list("abcde")
print(s)
i = 0
while i < len(s):
    s.pop(i)
    i += 1
    print(i)


def backspaceCompare2(s: str, t: str) -> bool:
    i = 0
    xs = list(s)
    while i < len(xs):
        if xs[i] == '#':
            xs.pop(i)
            if i > 0:
                xs.pop(i - 1)
                i -= 1
        else:
            i += 1

    i = 0
    xt = list(t)
    while i < len(xt):
        if xt[i]  == '#':
            xt.pop(i)
            if i > 0:
                xt.pop(i - 1)
                i -= 1
        else:
            i += 1

    return xs == xt

import itertools
def backspaceCompare(S, T):
    def F(S):
        skip = 0
        for x in reversed(S):
            if x == '#':
                skip += 1
            elif skip:
                skip -= 1
            else:
                yield x

    return all(x == y for x, y in itertools.zip_longest(F(S), F(T)))


print(backspaceCompare("a##c", "#a#c"))