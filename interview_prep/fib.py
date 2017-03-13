# cook your code here
def fib(n): 
    fibList = []
    for i in range(n):
        fibList.append(0)
        
    fibList[0] = 1
    fibList[1] = 1
    
    for i in range(n-2):
        fibList[i+2] = fibList[i] + fibList[i+1]
        
    return fibList[n-1]
    
def main():
    print(fib(6))
    print(fib(4))
    
if __name__ == "__main__":
    main()
        