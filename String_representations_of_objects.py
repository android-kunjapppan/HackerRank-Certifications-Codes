#!/bin/python

import math
import os
import random
import re
import sys



class Car:
    def __init__(self, maxSpeed, unit):
        self.maxSpeed = maxSpeed
        self.unit=unit
    def __str__(self):
        sent1 = "Car with the maximum speed of {} {}".format(self.maxSpeed,self.unit)
        return sent1
    pass

class Boat:
    def __init__(self, max_speed):
        self.max_speed = max_speed

    def __str__(self):
        sent2 = "Boat with the maximum speed of {} knots".format(self.max_speed)
        return sent2
    pass

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    q = int(raw_input())
    queries = []
    for _ in xrange(q):
        args = raw_input().split()
        vehicle_type, params = args[0], args[1:]
        if vehicle_type == "car":
            max_speed, speed_unit = int(params[0]), params[1]
            vehicle = Car(max_speed, speed_unit)
        elif vehicle_type == "boat":
            max_speed = int(params[0])
            vehicle = Boat(max_speed)
        else:
            raise ValueError("invalid vehicle type")
        fptr.write("%s\n" % vehicle)
    fptr.close()
