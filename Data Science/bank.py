class Bank:
    def __init__(self,accno,name,type,balance):
        self.acc_no = accno
        self.name = name
        self.type = type
        self.balance = balance
        
    def withdraw(self,amount):
        #amount = int(input("Enter the amount to be withdrawn: "))
        if(amount > self.balance):
            print("Amount exceeded. Cant withdraw")
        else:
            self.balance -= amount
            print(amount,"withdrawn. The balance is:  ", self.balance)
    
    def deposit(self,amount):
        #amount = int(input("Enter the amount to be deposited"))
        self.balance += amount
        print(amount,"deposited succefully. The balance is: ", self.balance)
        
    def display(self):
        print("The balance is: ",self.balance)
        
accno = int(input("Enter the account number: "))
name = (input("Enter the name of the user: "))
type = (input("Enter the type of the account: "))
balance = 0
account = Bank(accno, name, type, balance)

while True:
    print("The available operations are: ")
    print("1. Withdrawal")
    print("2. Deposit")
    print("3. Display balance")
    print("4. Exit")
    option = int(input("Enter your choice: "))
    if(option == 1):
        amount = int(input("Enter the amount to be withdrawn: "))
        account.withdraw(amount)
        
    elif(option == 2):
        amount = int(input("Enter the amount to be deposited: "))
        account.deposit(amount)
        
    elif(option == 3):
        account.display()
        
    elif(option == 4):
        print("Exiting from the menu")
        break
        
    else:
        print("Invalid choice. Choose again")
        
