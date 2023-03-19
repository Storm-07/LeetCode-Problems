class ListNode(object):
    # figure out what __init__ does and how it works
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class MergeTwoLists(object):
    def mergeTwoLists(self, list1, list2):
        """
        :type list1: Optional[ListNode]
        :type list2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        # Create a dummy node to serve as the head of the merged list
        dummy = ListNode(0)
        # Create a pointer to keep track of the last element of the merged list
        tail = dummy
        
        # Iterate through the two input lists simultaneously
        while list1 and list2:
            if list1.val < list2.val:
                # Append the current element of list1 to the merged list
                tail.next = list1
                # Update the tail pointer to the last element of the merged list
                tail = list1
                # Move to the next element of list1
                list1 = list1.next
            else:
                # Append the current element of list2 to the merged list
                tail.next = list2
                # Update the tail pointer to the last element of the merged list
                tail = list2
                # Move to the next element of list2
                list2 = list2.next
        
        # Append the remaining elements of list1 or list2, if any
        if list1:
            tail.next = list1
        elif list2:
            tail.next = list2
        
        # Return the head of the merged list
        return dummy.next

# Create two sorted lists
# why does it work like this
list1 = ListNode(1, ListNode(3, ListNode(5)))
list2 = ListNode(2, ListNode(4, ListNode(6)))

# Merge the two lists and print the result
merged_list = MergeTwoLists().mergeTwoLists(list1, list2)

# also why
while merged_list:
    print(merged_list.val, end=" ")
    merged_list = merged_list.next

# Output: 1 2 3 4 5 6
