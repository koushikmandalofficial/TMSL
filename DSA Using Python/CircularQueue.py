from array import *
MAX = 5

class Circular_Queue:
    cqueue =  array ('i', [0, 0, 0, 0, 0])
    rear = 0
    front = 0

    def insertion (self, n):
        if ((self.rear+1) % MAX==self.front):
            print ("Queue Overflow")
        else:
            self.cqueue[self.rear] = n
            self.rear = (self.rear + 1)%MAX
            print("One item added")

    def deletion(self):
        if self.rear == self.front:
            print("empty Queue")
        else:
            n = self.cqueue[self.front]
            self.front = (self.front + 1)%MAX
            print("Deleted item: ", n)

    def display(self):
        if self.rear == self.front:
            print("Empty Queue")

        else:
            print("The queue is given below: ")
            i = self.front
            while (i != self.rear):
                print(self.cqueue[i])
                i = (i + 1)%MAX

cq = Circular_Queue()
while True:
    print("****Main Menu****")
    print("1. Insertion")
    print("2. Deletion")
    print("3. Display")
    print("0. Exit")

    ch = int(input("Enter your choice"))

    if ch == 1:
        n = int(input("Enter data: "))
        cq.insertion(n)

    elif ch == 2:
        cq.deletion()

    elif ch == 3:
        cq.display()

    elif ch == 0:
        break

    else:
        print("Wrong input")
        pass