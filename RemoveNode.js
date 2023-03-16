// Need to include constructor function to run example ListNode
function ListNode(val, next) {
    this.val = (val === undefined ? 0 : val);
    this.next = (next === undefined ? null : next);
}

var removeNthFromEnd = function(head, n) {
    // Create two pointers
    let slow = head;
    let fast = head;
    
    // Move the fast pointer n positions ahead of the slow pointer
    for (let i = 0; i < n; i++) {
        fast = fast.next;
    }
    
    // If the fast pointer reaches the end of the list, remove the head node
    if (fast === null) {
        return head.next;
    }
    
    // Move the slow and fast pointers together until the fast pointer reaches the end of the list
    while (fast.next !== null) {
        slow = slow.next;
        fast = fast.next;
    }
    
    // Remove the nth node from the end of the list
    slow.next = slow.next.next;
    
    return head;
};

// Example List: [1, 2, 3, 4, 5] n = 2
// Expected Output: [1, 2, 3, 5]
// Create the singly-linked list
let head = new ListNode(1);
head.next = new ListNode(2);
head.next.next = new ListNode(3);
head.next.next.next = new ListNode(4);
head.next.next.next.next = new ListNode(5);

// Remove the 2nd node from the end of the list
let newHead = removeNthFromEnd(head, 2);

// Print the modified list
let currentNode = newHead;
while (currentNode !== null) {
    console.log(currentNode.val);
    currentNode = currentNode.next;
}
