# ethereum-smart-contract-crud-operations-using-web3j

Open the projects in Java IDE

Go to CRUDEthereum class 

Add your Geth server ip address and wallet credentials.

To test Ethereum CRUD operations 

# First need to create contract using first method createContract

Once contract is created you will get the contract address note down that address.That address will be required for the entire CRUD operations.

# createCustomer

This method will create the customer details with the given contract address.

# getCustomer

This method will return the customer details based on the id.

# updateCustomerAddress

This method will update only address for the given id.If you wants to update more fields first needs to update the method in Solidity code and create wrapper class.

To build wrapper refer the below link

First you need to compile the solidity source code and then needs to generate wrapper class

https://web3j.readthedocs.io/en/latest/smart_contracts.html#smart-contract-wrappers

# deleteCustomer

To delete the customer based on the ID.

Note : 

Directly compile and test your Solidity code you can use online compiler if you don't want to install in your machine.

https://remix.ethereum.org/#optimize=false




