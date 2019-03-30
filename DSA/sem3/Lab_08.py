import sys
from pprint import pprint


def main():
    n, m = int(input('n: ')), int(input('m: '))
    f = {
        'type=string': str,
        'type=float': float,
        'type=int': int,
        '': int
    }[sys.argv[1]]
    a = [[f(e) for e in input().split()[:m]] for _ in range(n)]
    for i in range(m):
        col = [a[j][i] for j in range(n)]
        col.sort()
        for j in range(n):
            a[j][i] = col[j]
    pprint(a)


if __name__ == '__main__':
    main()