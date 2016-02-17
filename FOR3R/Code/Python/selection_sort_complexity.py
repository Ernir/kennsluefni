def selection_sort(A):
    n = len(A) # c_1
    for j in range(0, n): # c_2*n = O(n)
        i_min = j # O(n)*c_3 = O(n)
        for i in range(j + 1, n): 
        # O(n)*sum_{j+1}^n = O(n)*O(n) = O(n^2)
            if A[i] < A[i_min]: #O(n^2)*c_4
                i_min = i # O(n^2)*c_5
            if i_min != j: # O(n^2)*c_6
                A[j], A[i_min] = A[i_min], A[j] 
                # O(n^2)*c_7
    return A