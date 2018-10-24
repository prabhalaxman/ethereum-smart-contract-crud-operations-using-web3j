package com.test.helloworld;


public class CRUDEthereum {
    public static void main(String args[]) throws Exception {
        CRUDEthereum.createContract();
//        CRUDEthereum.createCustomer();
//        CRUDEthereum.getCustomer();
//        CRUDEthereum.updateCustomerAddress();
//        CRUDEthereum.deleteCustomer();
    }

    private static void createContract() throws Exception {
        org.web3j.protocol.Web3j web3j = org.web3j.protocol.Web3j.build(
                new org.web3j.protocol.http.HttpService("Your IP address"));

        System.out.println("Connected to Ethereum client version: "
                + web3j.web3ClientVersion().send().getWeb3ClientVersion());

        org.web3j.crypto.Credentials credentials =
                org.web3j.crypto.WalletUtils.loadCredentials(
                        "Wallet password",
                        "Wallet path");
        System.out.println("Credentials loaded");


        System.out.println("Deploy smart contract");


//        generated.com.test.Customer customer = generated.com.test.Customer.load("0xbe47402a18fea3c4b82bd10f3df7a0b4f8635552",
//                web3j, credentials, org.web3j.tx.Contract.GAS_PRICE, org.web3j.tx.Contract.GAS_LIMIT);
        generated.com.test.Customer customer = generated.com.test.Customer.deploy(
                web3j, credentials, org.web3j.tx.Contract.GAS_PRICE, org.web3j.tx.Contract.GAS_LIMIT).sendAsync().get();

        System.out.println("CONTRACT DEPLOYED RECEIPT::: " + customer.getTransactionReceipt());
        System.out.println("CONTRACT DEPLOYED AT ADDRESS::: " + customer.getContractAddress());

    }

    private static void createCustomer() throws Exception {
        org.web3j.protocol.Web3j web3j = org.web3j.protocol.Web3j.build(
                new org.web3j.protocol.http.HttpService("Your IP address"));

        System.out.println("Connected to Ethereum client version: "
                + web3j.web3ClientVersion().send().getWeb3ClientVersion());

        org.web3j.crypto.Credentials credentials =
                org.web3j.crypto.WalletUtils.loadCredentials(
                        "Wallet password",
                        "Wallet path");
        System.out.println("Credentials loaded");


        System.out.println("Deploy smart contract");

//load  your deployed contract with that address

        generated.com.test.Customer customer = generated.com.test.Customer.load("0xbbb17fecbb4b1b2e72fc1789dc5cb8beba9a0209",
                web3j, credentials, org.web3j.tx.Contract.GAS_PRICE, org.web3j.tx.Contract.GAS_LIMIT);
//        generated.com.test.Customer customer = generated.com.test.Customer.deploy(
//                web3j, credentials, org.web3j.tx.Contract.GAS_PRICE, org.web3j.tx.Contract.GAS_LIMIT).sendAsync().get();

        org.web3j.abi.datatypes.Utf8String id = new org.web3j.abi.datatypes.Utf8String("101");
        org.web3j.abi.datatypes.Utf8String name = new org.web3j.abi.datatypes.Utf8String("PrabhaKaran");
        org.web3j.abi.datatypes.Utf8String address = new org.web3j.abi.datatypes.Utf8String("velacherry,chennai 600032");


        org.web3j.abi.datatypes.generated.Uint256 age = new org.web3j.abi.datatypes.generated.Uint256(23);
        org.web3j.abi.datatypes.generated.Uint256 dob = new org.web3j.abi.datatypes.generated.Uint256(845767863);


        org.web3j.protocol.core.methods.response.TransactionReceipt result = customer.insert(id, name, address, dob, age).sendAsync().get();

        System.out.println("CUSTOMER CREATED HASH::: " + result.getTransactionHash());
        System.out.println("CONTRACT DEPLOYED AT ADDRESS::: " + result.getContractAddress());

        org.web3j.abi.datatypes.Utf8String customerCount = customer.getTotalCustomers().sendAsync().get();

//        Uint256 by=customer.convert(customerCount);

        System.out.println("CUSTOMER COUNT IS:: " + customerCount);


    }


    private static void getCustomer() throws Exception {
        org.web3j.protocol.Web3j web3j = org.web3j.protocol.Web3j.build(
                new org.web3j.protocol.http.HttpService("Your IP address"));

        System.out.println("Connected to Ethereum client version: "
                + web3j.web3ClientVersion().send().getWeb3ClientVersion());

        org.web3j.crypto.Credentials credentials =
                org.web3j.crypto.WalletUtils.loadCredentials(
                        "Wallet password",
                        "Wallet path");
        System.out.println("Credentials loaded");


        System.out.println("Deploy smart contract");

//load  your deployed contract with that address


        generated.com.test.Customer customer = generated.com.test.Customer.load("0xbbb17fecbb4b1b2e72fc1789dc5cb8beba9a0209",
                web3j, credentials, org.web3j.tx.Contract.GAS_PRICE, org.web3j.tx.Contract.GAS_LIMIT);


        org.web3j.abi.datatypes.Utf8String id = new org.web3j.abi.datatypes.Utf8String("101");
        System.out.println("Is deployed contract is valid  " + customer.isValid());

        System.out.println("Hi loaded contract address is " + customer.getContractAddress());

        System.out.println("Value stored in block " + customer.getCustomer(id).send());

//        org.web3j.protocol.core.RemoteCall<org.web3j.tuples.generated.Tuple5<org.web3j.abi.datatypes.Utf8String, org.web3j.abi.datatypes.Utf8String, org.web3j.abi.datatypes.Utf8String, org.web3j.abi.datatypes.generated.Uint256, org.web3j.abi.datatypes.generated.Uint256>> re = customer.getCustomer(id);
        org.web3j.protocol.core.RemoteCall<org.web3j.tuples.generated.Tuple5<org.web3j.abi.datatypes.Utf8String, org.web3j.abi.datatypes.Utf8String, org.web3j.abi.datatypes.Utf8String,org.web3j.abi.datatypes.Utf8String, org.web3j.abi.datatypes.Utf8String>> re = customer.getCustomerDataString(id);

        org.web3j.tuples.generated.Tuple5 getdata = re.sendAsync().get();

//        Type rest=customer.getCustomerData(itemId).sendAsync().get();


        System.out.println("READ FROM SMART CONTRACT ID:: " + getdata.getValue1());
        System.out.println("READ FROM SMART CONTRACT NAME:: " + getdata.getValue2());
        System.out.println("READ FROM SMART CONTRACT ADDRESS:: " + getdata.getValue3());
        System.out.println("READ FROM SMART CONTRACT DOB:: " + getdata.getValue4());
        System.out.println("READ FROM SMART CONTRACT AGE:: " + getdata.getValue5());

        org.web3j.abi.datatypes.Utf8String customerCount = customer.getTotalCustomers().sendAsync().get();

//        Uint256 by=customer.convert(customerCount);

        System.out.println("CUSTOMER COUNT IS:: " + customerCount);

    }


    private static void updateCustomerAddress() throws Exception {
        org.web3j.protocol.Web3j web3j = org.web3j.protocol.Web3j.build(
                new org.web3j.protocol.http.HttpService("Your IP address"));

        System.out.println("Connected to Ethereum client version: "
                + web3j.web3ClientVersion().send().getWeb3ClientVersion());

        org.web3j.crypto.Credentials credentials =
                org.web3j.crypto.WalletUtils.loadCredentials(
                        "Wallet password",
                        "Wallet path");
        System.out.println("Credentials loaded");


        System.out.println("Deploy smart contract");

//load  your deployed contract with that address

        org.web3j.abi.datatypes.Utf8String id = new org.web3j.abi.datatypes.Utf8String("101");
        org.web3j.abi.datatypes.Utf8String updateAddress = new org.web3j.abi.datatypes.Utf8String("Qutub minar,New delhi 110019");

        generated.com.test.Customer customer = generated.com.test.Customer.load("0xbbb17fecbb4b1b2e72fc1789dc5cb8beba9a0209",
                web3j, credentials, org.web3j.tx.Contract.GAS_PRICE, org.web3j.tx.Contract.GAS_LIMIT);

        System.out.println("Is deployed contract is valid  " + customer.isValid());

//        System.out.println("Hi loaded contract address is " + customer.getContractAddress());

        org.web3j.protocol.core.methods.response.TransactionReceipt result = customer.updateAddress(id, updateAddress).sendAsync().get();

        System.out.println("CUSTOMER UPDATED HASH::: " + result.getTransactionHash());
//        System.out.println("CONTRACT DEPLOYED AT ADDRESS::: " + result.getContractAddress());
        org.web3j.abi.datatypes.Utf8String customerCount = customer.getTotalCustomers().sendAsync().get();

//        Uint256 by=customer.convert(customerCount);

        System.out.println("CUSTOMER COUNT IS:: " + customerCount);

    }

    private static void deleteCustomer() throws Exception {
        org.web3j.protocol.Web3j web3j = org.web3j.protocol.Web3j.build(
                new org.web3j.protocol.http.HttpService("Your IP address"));

        System.out.println("Connected to Ethereum client version: "
                + web3j.web3ClientVersion().send().getWeb3ClientVersion());

        org.web3j.crypto.Credentials credentials =
                org.web3j.crypto.WalletUtils.loadCredentials(
                        "Wallet password",
                        "Wallet path");
        System.out.println("Credentials loaded");


        System.out.println("Deploy smart contract");

//load  your deployed contract with that address

        org.web3j.abi.datatypes.Utf8String id = new org.web3j.abi.datatypes.Utf8String("101");
//        org.web3j.abi.datatypes.Utf8String updateAddress = new org.web3j.abi.datatypes.Utf8String("Qutub minar,New delhi 110019");

        generated.com.test.Customer customer = generated.com.test.Customer.load("0xbbb17fecbb4b1b2e72fc1789dc5cb8beba9a0209",
                web3j, credentials, org.web3j.tx.Contract.GAS_PRICE, org.web3j.tx.Contract.GAS_LIMIT);

        System.out.println("Is deployed contract is valid  " + customer.isValid());

        org.web3j.protocol.core.methods.response.TransactionReceipt result = customer.deleteCustomer(id).sendAsync().get();

        System.out.println("CUSTOMER DELETED HASH::: " + result.getTransactionHash());
        org.web3j.abi.datatypes.Utf8String customerCount = customer.getTotalCustomers().sendAsync().get();

//        Uint256 by=customer.convert(customerCount);

        System.out.println("CUSTOMER COUNT IS:: " + customerCount);

    }


}
