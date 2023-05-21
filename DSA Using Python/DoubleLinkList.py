class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

def display(head):
    temp = head
    if temp is None:
        print("Empty List")
    else:
        while temp:
            print(temp.data)
            temp = temp.right

def insert_end(head, n):
    temp = head
    if temp is None:
        head = Node(n)
        return head
    else:
        while temp.right:
            temp = temp.right
        newnode = Node(n)
        temp.right = newnode
        newnode.left = temp
        return head

def insert_first(head, n):
    temp = head
    newnode = Node(n)
    newnode.right = temp
    if temp is not None:
        temp.left = newnode
    head = newnode
    return head

def count(head):
    temp = head
    c = 0
    if temp is None:
        print("Empty List")
        return c
    else:
        while temp:
            c += 1
            temp = temp.right
        return c

def search(head, n):
    temp = head
    pos = 0
    if temp is None:
        print("Empty List")
        return 0
    else:
        while temp:
            pos += 1
            if temp.data == n:
                return pos
            temp = temp.right
        return -1

def deletion(head, n):
    temp = head
    if temp is None:
        print("Empty List")
        return head
    elif temp.data == n:
        print("Deleted item:", temp.data)
        if temp.right is None:
            head = None
        else:
            head = temp.right
            head.left = None
        return head
    else:
        prev = temp
        temp = prev.right
        while temp:
            if temp.data == n:
                if temp.right is not None:
                    nitem = temp.right
                    prev.right = nitem
                    nitem.left = prev
                else:
                    prev.right = None
                print("Deleted item =", temp.data)
                return head
            prev = temp
            temp = temp.right
        print("Item not found")
        return head

head = None

while True:
    print("----Main Menu----")
    print("1. Insert End")
    print("2. Display")
    print("3. Insert First")
    print("4. Count")
    print("5. Search")
    print("6. Deletion")
    print("0. Exit")

    ch = int(input("Enter your choice: "))

    if ch == 1:
        n = int(input("Enter data: "))
        head = insert_end(head, n)
    elif ch == 2:
        display(head)
    elif ch == 3:
        n = int(input("Enter data: "))
        head = insert_first(head, n)
    elif ch == 4:
        n = count(head)
        if n > 0:
            print("No of elements =", n)
    elif ch == 5:
        n = int(input("Enter data which you want: "))
        pos = search(head, n)
        if pos > 0:
            print("Item is in", pos, "th position")
        else:
            print("Item not found")
    elif (ch == 6):
        n = int(input("Enter data which you want to delete : "))
        head = deletion(head, n)
    elif(ch == 0):
        break
    else:
        print("Wrong Input")
        pass
