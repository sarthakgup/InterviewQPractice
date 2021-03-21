#!/bin/python3

import math
import os
import random
import re
import sys



#
# Complete the 'efficientJanitor' function below.
#
# The function is expected to return an INTEGER.
# The function accepts FLOAT_ARRAY weight as parameter.
#

import math

def efficientJanitor(weight):
    # Write your code here
    trips = 0  #result will be my output
    weightSum = 0
    x = 0
    for w in weight:
        weightSum += weight[x]
        
        if weightSum >= 3:
            weightSum -= weight[x]
            x -= 1
            trips += 1
            weightSum = 0
            
        x+=1
            
    if weightSum > 0:
        trips += 1
        
    #trips += 1
    return trips

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    weight_count = int(input().strip())

    weight = []

    for _ in range(weight_count):
        weight_item = float(input().strip())
        weight.append(weight_item)

    result = efficientJanitor(weight)

    fptr.write(str(result) + '\n')

    fptr.close()
