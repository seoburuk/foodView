#include <stdio.h>

struct books {
    int id;
    char name[20];
    int Pdate;
    char Pname[20];
    char Pnumber[20];
    char Aname[20];
    char AEmail[20];
}

int main() {
    struct books b[50];
    int index = 1;
    int next = 1;
    int opt = 0;
    int flag = 0;
    int tempID, i, del_idx;

    do {
        printf("Choose the option\n");
        printf("#1 Add book information\n");
        printf("#2 Update book information\n");
        printf("#3 Delete book information\n");
        printf("#4 Search book information\n");
        printf("#5 Display a list of book(s) published by an author a\n");
        printf("#6 Display a list of book(s) published by a publisher p\n");
        printf("#7 Display a list of all book\n");
        printf("#8 Exit");
    }
    switch (opt) {
    case 1:
        while (1) {
            system("cls");
            if (index = < 50) {
                printf("Enter book ID");
                scanf("%d", &b[index].id);
                getchar();
                printf("\nEnter book name");
                gets(b[index].name);
                printf("\nEnter publication date");
                scanf("%d", b[index].Pdate);
                getchar();
                printf("\nEnter publisher name");
                gets(b[index].Pname);
                printf("\nEnter publisher phone number");
                gets(b[index].Pnumber);
                printf("\nEnter author name");
                gets(b[index].Aname);
                printf("\nEnter author email");
                gets(b[index].Aemail);

                index++;
                printf("Record saved");
                printf("\nWould you like to add another book informaiton? ");
                printf("\n\n<< Enter 1 to continue and 0 to exit>> ");
                scanf("%d", &next);
                getchar();
                if (next == 0) break;
            } break;
        }


    case 2:
        while (1) {
            system(cls);
            printf("Enter book ID to be updated");
            scanf("%d", &tempID);
            for (i = 0; i < index; i++) {
                if (tempID == b[i].id) {
                    printf("\nEnter book name");
                    gets(b[index].name);
                    printf("\nEnter publication date");
                    scanf("%d", b[index].Pdate);
                    getchar();
                    printf("\nEnter publisher name");
                    gets(b[index].Pname);
                    printf("\nEnter publisher phone number");
                    gets(b[index].Pnumber);
                    printf("\nEnter author name");
                    gets(b[index].Aname);
                    printf("\nEnter author email");
                    gets(b[index].Aemail);
                    printf("Record saved");
                    printf("\nWould you like to add another book informaiton? ");
                    printf("\n\n<< Enter 1 to continue and 0 to exit>> ");
                    scanf("%d", &next);
                    getchar();
                    if (next == 0) break;
                }
                else {
                    printf("not existed")
                        break;
                }
            }
        }


    case 3:
        while (1) {
            system("cls");
            printf("Enter book ID to be deleted");
            scanf("%d", &tempID);
            for (i = 0; i < index; i++) {
                if (tempID == b[i].id) {
                    flag = 1;
                }
            }
            if (flag != 1) {
                printf("ID dose not existed");
                break;
            }
            for (i = del_idx; i < index; i++) {
                std_id[i] = std_id[i + 1];
            }

        }


    case 4:
        system("cls");
        printf("Enter book ID to be searched");
        scanf("%d", &tempID)
            for (i = 0; i < index; i++) {
                if (tempID == b[i].id) {
                    printf("\nEnter book name");
                    gets(b[index].name);
                    printf("\nEnter publication date");
                    scanf("%d", b[index].Pdate);
                    getchar();
                    printf("\nEnter pulbisher name");
                    gets(b[index].Pname);
                    printf("\nEnter publisher phone number");
                    gets(b[index].Pnumber);
                    printf("\nEnter author name");
                    gets(b[index].Aname);
                    pritnf("\nEnter author email");
                    gets(b[index].Pemail);
                    printf("Record saved");
                    printf("\nWould you like to search another book?");
                    printf("\n<<Enter 1 to continue and 0 to exit>> ");
                    scanf("%d", &next);
                    getchar();
                    if (next == 0) break;
                }
            }


    case 5:
        system("cls");
        for (i = 0; i < index; i++) {
            if (b[i].Aname == 'a')
                printf("b[i].name ");
        }
        break;

    case 6:
        system("cls");
        for (i = 0; i < index; i++) {
            if (b[i].Pname == 'p')
                printf("b[i].name ");
        }
        break;

    case 7:
        system("cls");
        for (i = 0; i < index; i++) {
            printf("b[index].name\n");
        }
        break;

    case 8:
        return;

    default:
        printf("invalid choice");
        break;
    }
} while (opt != 8);

return 0;
}