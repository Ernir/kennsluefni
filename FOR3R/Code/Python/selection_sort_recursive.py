def selection_sort(unsorted_sl, sorted_sl=[]):
  num_remaining = len(unsorted_sl)
  if not unsorted_sl:
    return sorted_sl
  
  i_smallest = 0
  for i in range(0, num_remaining):
    if unsorted_sl[i] < unsorted_sl[i_smallest]:
      i_smallest = i
  
  smallest = unsorted_sl.pop(i_smallest)
  sorted_sl.append(smallest)
  return selection_sort(unsorted_sl, sorted_sl)