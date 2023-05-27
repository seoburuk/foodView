/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    char ch = 'a';
    int vowels = 0;
    
    printf("Enter a sentence \n");
    ch = getchar();
    
    while(ch =! '\n') {

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            vowels++;
            
        }
        
    }


    printf("Your sentence contains %d vowels", vowels);
    return 0;
}
