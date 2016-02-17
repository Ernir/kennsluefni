def selection_sort(A):
    n = len(A)
    for j in range(0, n):
        i_min = j
        for i in range(j + 1, n):
			
            if A[i] < A[i_min]:
                i_min = i
            if i_min != j:
                A[j], A[i_min] = A[i_min], A[j]
                
    return A