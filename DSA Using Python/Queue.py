from array import *
MAX = 5

class queue_array:
    queue =  array ('i', [0, 0, 0, 0, 0])
    rear = -1
    front = -1

    def insertion (self, n):
        if (self.rear == MAX - 1):
            print ("Queue Overflow")
        else:
            self.rear = self.rear + 1
            self.queue[self.rear] = n
            print("One item added")

    def deletion(self):
        if self.rear == self.front:
            print("empty Queue")
        else:
            self.front = self.front + 1
            n = self.queue[self.front]
            print("Deleted item: ", n)

    def display(self):
        if self.rear == self.front:
            print("Empty Queue")

        else:
            print("The queue is given below: ")
            i = self.front + 1
            while (i <= self.rear):
                print(self.queue[i])
                i = i + 1

q = queue_array()
while True:
    print("****Main Menu****")
    print("1. Insertion")
    print("2. Deletion")
    print("3. Display")
    print("0. Exit")

    ch = int(input("Enter your choice"))

    if ch == 1:
        n = int(input("Enter data: "))
        q.insertion(n)

    elif ch == 2:
        q.deletion()

    elif ch == 3:
        q.display()

    elif ch == 0:
        break

    else:
        print("Wrong input")
        pass