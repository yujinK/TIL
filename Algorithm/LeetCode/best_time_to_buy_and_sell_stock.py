prices = [7, 1, 5, 3, 6, 4]

min_value = prices[0]
benefit = 0

for i in range(1, len(prices)):
    if (prices[i] - min_value) > benefit:
        benefit = prices[i] - min_value
    if prices[i] < min_value:
        min_value = prices[i]

print(benefit)