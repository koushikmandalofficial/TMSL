class Node:
    def __init__(self, key):
        self.left = None
        self.right = None
        self.data = key
def insert(root, key):
    if (root == None):
        return Node(key)
    else:
        curr=root
        while (curr):
            if (curr.data==key):
                print("Data already present")
                return root
            prev = curr
            if (curr.data > key):
                curr = curr.left
            else:
                curr = curr.right
        temp=Node(key)
        if (prev.data > key):
            prev.left = temp
        else:
            prev.right = temp
        return root
def inorder(root):
    if (root):
        inorder(root.left)
        print(root.data)
        inorder(root.right)
def preorder(root):
    if (root):
        print(root.data)
        preorder(root.left)
        preorder(root.right)
def postorder(root):
    if (root):
        postorder(root.left)
        postorder(root.right)
        print(root.data)
def search(root,key):
    if (root == None):
        print("Empty Tree")
        return
    temp=root
    while(temp):
        if(temp.data==key):
            print("Data Found")
            return
        elif (temp.data > key):
            temp=temp.left
        else:
            temp=temp.right
    print("Data Not Found")

def max(root):
    temp=root
    while(temp.right!=None):
        temp=temp.right
    return temp.data

def min(root):
    temp=root
    while(temp.left!=None):
        temp=temp.left
    return temp.data
rootNode=None
while True:
    print("**** Main Menu **** ")
    print("1. Insertion")
    print("2. Inorder")
    print("3. Preorder")
    print("4. Postorder")
    print("5. Search")
    print("6. Max data")
    print("7. Min data")
    print("0. EXIT")
    ch = int(input("Enter Your Choice:"))
    if (ch == 1):
        n = int(input("Enter data:"))
        rootNode = insert(rootNode, n)
    elif (ch == 2):
        if(rootNode):
            inorder(rootNode)
        else:
            print("Empty Tree")
    elif (ch == 3):
        if(rootNode):
            preorder(rootNode)
        else:
            print("Empty Tree")

    elif (ch == 4):
        if(rootNode):
            postorder(rootNode)
        else:
            print("Empty Tree")
    elif (ch==5):
        n = int(input("Enter data:"))
        search(rootNode,n)
    elif (ch==6):
        if(rootNode):
            n = max(rootNode)
            print("Max. data=",n)
        else:
            print("Empty Tree")
    elif (ch==7):
        if(rootNode):
            n = min(rootNode)
            print("Min. data=",n)
        else:
            print("Empty Tree")
    elif (ch == 0):
        break
    else:
        print("Wrong Input")
    pass