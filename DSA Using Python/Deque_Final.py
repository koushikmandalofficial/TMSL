from array import*
MAX=5
class deque_array:
    deque=array('i',[0,0,0,0,0])
    rear=-1
    front=-1
    def insertion_rear_end(self,n):
        if(self.rear==MAX-1):
            print("Insertion not possible!")
        else:
            self.rear=self.rear+1
            self.deque[self.rear]=n
            print("One item added.")
    def insertion_front_end(self,n):
        if (self.front==1):
            print("Insertion not possible!")
        else:
            self.deque[self.front]=n
            self.front=self.front-1
            print("One item is added.")
    def deletion_front_end(self):
        if self.rear==self.front:
            print("Empty deque!")
        else:
            self.front=self.front+1
            n=self.deque[self.front]
            print("Deleted item=",n)
    def deletion_rear_end(self):
        if self.rear==self.front:
            print("Empty deque!")
        else:
            n=self.deque[self.rear]
            self.rear=self.rear-1
            print("Deleted item=",n)
    def display(self):
        if self.rear==self.front:
            print("Empty deque!")
        else:
            print("The deque is given below:")
            i=self.front+1
            while(i<=self.rear):
                print(self.deque[i])
                i=i+1
dq=deque_array()
while True:
    print("* Main Menu *")
    print("1. Insertion at Rear End")
    print("2. Insertion at Front End")
    print("3. Deletion at Rear End")
    print("4. Deletion at Front End")
    print("5. Disply")
    print("0. Exit")
    ch=int(input("Enter your choice:"))

    if(ch==1):
        n=int(input("Enter data:"))
        dq.insertion_rear_end(n)
    elif (ch == 2):
        n = int(input("Enter data:"))
        dq.insertion_front_end(n)
    elif (ch == 3):
        dq.deletion_front_end()
    elif (ch == 4):
       dq.deletion_rear_end()
    elif (ch == 5):
       dq.display()
    elif (ch == 0):
        break
    else:
        print("Wrong Input!")
        pass