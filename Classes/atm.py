balance = 50000
pin = 1234
checkpin = input()
if (pin == checkpin) :
    print "Welcome to ATM machine"
    print "Press 1 to check balance \nPress 2 to withdraw"
    opr = input()
    if (opr == 1):
        print "balance is " + balance
    elif (opr == 2):
        print "Enter the amount to withdraw"
        amt = input()
        if (balance>amt && amt<=10000 && amt%100==0):
            balance = balance - amt
            print "remaining balance is " + balance + " Please collect your money"
        else:
            print "This transaction cannot be processed"
            pass
    else: print "Invalid operation"


else :
    print "Wrong pin"
    exit()


