# cook your code here
def factorial(n):
    temp = n
    product = n
    
    for i in range(n):
        product = product*(temp-1)
        temp -= 1
        
        if temp == 1:
            return product
    
def main():
    print(factorial(6))
    print(factorial(4))
    
if __name__ == "__main__":
    main()