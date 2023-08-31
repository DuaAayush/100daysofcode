# List comprehension to generate a list of squares
squares = [x ** 2 for x in range(10)]
print(squares)

# List comprehension to filter even numbers
even_numbers = [x for x in range(20) if x % 2 == 0]
print(even_numbers)

# List comprehension with conditional expression
result = ["Even" if x % 2 == 0 else "Odd" for x in range(10)]
print(result)
