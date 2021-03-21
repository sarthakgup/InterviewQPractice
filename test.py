#!/bin/python3

import math
import os
import random
import re
import sys



# Complete the maxTickets function below.
def maxTickets(tickets):
    #sorting tickets in ascending order
    tickets.sort()
    
    #variable to hold largest m val
    m = 0
    
    #variable to hold temp m vals
    tempM = int(0)    
    
    for x in range(len(tickets)-2):
        if tickets[x] == tickets [x+1] or tickets[x] == tickets[x+1]+1:
            tempM += 1
        else:
            if tempM > m:
                m = tempM
                tempM = int(0)
            else:
                tempM = int(0)

    return m
    
if __name__ == '__main__':
    #fptr = open(os.environ['OUTPUT_PATH'], 'w')
    tickets = []
    #tickets_count = int(input().strip())

    tickets1 = [5,10,12,1,10,4]

    for i in range(len(tickets1)):
        tickets_item = tickets1[i] #int(input().strip())
        tickets.append(tickets_item)

    res = maxTickets(tickets)
    print('----')
    print(res)
    #fptr.write(str(res) + '\n')

    #fptr.close()
