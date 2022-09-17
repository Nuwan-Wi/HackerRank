# create: 2022 09 18
# Owner: Nuwan Wijeweera

#Question is in AppleandOrangeQuest1.jpg

#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'countApplesAndOranges' function below.
#
# The function accepts following parameters:
#  1. INTEGER s
#  2. INTEGER t
#  3. INTEGER a
#  4. INTEGER b
#  5. INTEGER_ARRAY apples
#  6. INTEGER_ARRAY oranges
#

def countApplesAndOranges(s, t, a, b, apples, oranges):
    # Write your code here
    l1 = []
    l2 = []
    for i in range(len(apples)):
        apples[i] += a
        if apples[i]>s-1 and apples[i]<t+1:
           l1.append(apples[i]) 
    for j in range(len(oranges)):
        oranges[j] += b
        if oranges[j]>s-1 and oranges[j]<t+1:
           l2.append(oranges[j])
    print(len(l1))
    print(len(l2))

if __name__ == '__main__':
    first_multiple_input = input().rstrip().split()

    s = int(first_multiple_input[0])

    t = int(first_multiple_input[1])

    second_multiple_input = input().rstrip().split()

    a = int(second_multiple_input[0])

    b = int(second_multiple_input[1])

    third_multiple_input = input().rstrip().split()

    m = int(third_multiple_input[0])

    n = int(third_multiple_input[1])

    apples = list(map(int, input().rstrip().split()))

    oranges = list(map(int, input().rstrip().split()))

    countApplesAndOranges(s, t, a, b, apples, oranges)
