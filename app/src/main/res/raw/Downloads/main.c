/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>


void even() {
   for (int i=2; i<100; i+=2)
   printf("%d ", i);
}

void odd() {
    for (int i=1; i<100; i+=2)
    printf("%d ", i);
}

bool is_prime(int n) {
    if (n <= 1  )
        return false;
    for (int i = 2; i * i <= n; i++) { // 제곱근 이하 수 중에서 나눠지는지 확인
        if (n % i == 0)
            return flase;
    }
    return true;
}

void list_prime(int m, int n) {
    printf("Enter two nubers");
    scanf("%d%d", &m, &n);
    for (int i = m; i <= n; i++) {
        if (is_prime(i))
            printf("%d ", i);
    }
}

void factorial(int a) {
    int n,fac;
    printf("Enter a number");
    scanf("%d", &n);
    while (n>1) {
        fac *= n;
        n--;
    }
    printf("%d", fac);
    return 0;
}

void list_factorial(int a, int b) {
    int n,m,fac;
    for (i=n; i<m; i++) {
        while(n>1) {
            fac *= n;
            n--;
        }
        printf("%d ", fac);
    }
    return 0;
}

void Fibonacci(int a) {
    int fib;
    if (n == 0 && n ==1){
        return 1;
    } else {
        return fib(n-1) + fib(n-2);
    }
}

int main()
{   
    int opt;
    
    printf("Choose the option");
    printf("#1: Display a list of even numbers.");
    printf("#2: Display a list of odd numbers.");
    printf("#3: For a given number n check if n is a prime number.");
    printf("#4: Display a list of prime numbers between numbers n and m.");
    printf("#5: Display a factorial of a given number n.");
    printf("#6: Find factorial of all numbers between numbers n and m.");
    printf("#7: Generate the Fibonacci sequence up to a number n.");
    printf("#8: Exit");

    while(1) {
        switch(opt) {
            case 1:
            even();
            
            case 2:
            odd();
            
            case 3:
            int n;
            if (is_prime(n))
            printf("\nPrime");
            else
            printf("\nNot Prime");
            
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            
            default: 
                printf("Invalid option");
                break; 
        }
    }






    return 0;
}
