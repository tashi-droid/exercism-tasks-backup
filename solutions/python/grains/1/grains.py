def square(number):
    if number < 1 or number > 64:
        raise ValueError("square must be between 1 and 64") 
    return pow(2, number - 1)

def total():
    total = 0
    for square in range(1, 65):
        total += pow(2, square - 1)
    return total
