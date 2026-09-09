def is_armstrong_number(number):
    digits = str(number)
    power = len(digits)
    total = 0

    for digit in digits:
        total += pow(int(digit), power)

    if total == number:
        return True
    return False
    
