# cook your code here
def fib(n): 
    if n == 1 or n==2:
        return 1
        
    else:
        return fib(n-1) + fib(n-2) 

def main():
    print(fib(35))
    print(fib(25))
    print(fib(10))
    
if __name__ == "__main__":
    main()
        