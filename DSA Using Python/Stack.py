from array import *
max = 5
class stack_array :
    stack = array('i',[0,0,0,0,0])
    top = -1
    def push(self,n):
        if (self.top == max-1):
            print("stack overflow")
        else :
            self.top = self.top +1
            self.stack[self.top] = n
            print("one item added")
    def pop(self):
        if (self.top == -1):
            print("empty stack")
        else :
            n = self.stack[self.top]
            self.top = self.top - 1
            print("one item deleted", n)
    def display(self):
        if (self.top == -1):
            print("empty stack")
        else :
            print ("The stack is given below")
            i = self.top
            while (i>=0):
                print(self.stack[i])
                i = i-1
s = stack_array()
while True :
    print("***MAIN MENU***")
    print("1. PUSH")
    print("2. POP")
    print("3. DISPLAY")
    print("0. EXIT")
    ch = int(input("Enter your choice"))
    if (ch == 1) :
        n = int(input("Enter data"))
        s.push(n)
    elif (ch == 2):
        s.pop()
    elif (ch == 3):
        s.display()
    elif (ch == 0):
        break
    else :
        print("Wrong input")
        pass

