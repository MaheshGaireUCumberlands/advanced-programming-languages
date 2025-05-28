def calculate_sum(arr):
    total = 0
    for num in arr   # ❌ MISSING COLON
        total += num
    return total

numbers = [1, 2, 3, 4, 5]
result = calculate_sum(numbers)
print("Sum in Python:", result)
