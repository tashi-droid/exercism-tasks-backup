def steps(number):
    if number <= 0:
        raise ValueError("Only positive integers are allowed")

    storedsteps = []

    while number > 1:
        if number % 2 == 0:
            number = number // 2
        elif number % 2 != 0:
            number = (number * 3) + 1
        storedsteps.append(number)
    return len(storedsteps)
  
        
        
