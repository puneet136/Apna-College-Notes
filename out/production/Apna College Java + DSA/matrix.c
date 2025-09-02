#include<stdio.h>
#include<stdlib.h>

int main() {
    int m1[10][10], m2[10][10], m3[10][10];
    int r1, c1, r2, c2, i, j, k;

    // Input matrix dimensions
    printf("Enter number of rows and columns of the first matrix: ");
    scanf("%d%d", &r1, &c1);

    printf("Enter number of rows and columns of the second matrix: ");
    scanf("%d%d", &r2, &c2);

    // Check if matrix multiplication is possible
    if (c1 != r2) {
        printf("Matrix dimensions do not match for multiplication.\n");
        exit(1);
    }

    // Input for matrix m1
    for (i = 0; i < r1; i++) {
        for (j = 0; j < c1; j++) {
            printf("Enter value for [%d,%d] element of the first matrix: ", i + 1, j + 1);
            scanf("%d", &m1[i][j]);
        }
    }

    // Input for matrix m2
    for (i = 0; i < r2; i++) {
        for (j = 0; j < c2; j++) {
            printf("Enter value for [%d,%d] element of the second matrix: ", i + 1, j + 1);
            scanf("%d", &m2[i][j]);
        }
    }

    // Matrix multiplication
    for (i = 0; i < r1; i++) {
        for (j = 0; j < c2; j++) {
            m3[i][j] = 0; // Initialize the result matrix element to 0
            for (k = 0; k < c1; k++) { // Note: k < c1 or k < r2, both are valid since c1 == r2
                m3[i][j] += m1[i][k] * m2[k][j];
            }
        }
    }

    // Output the resulting matrix
    printf("The resulting matrix is:\n");
    for (i = 0; i < r1; i++) {
        for (j = 0; j < c2; j++) {
            printf("%d\t", m3[i][j]);
        }
        printf("\n");
    }

    return 0;
}