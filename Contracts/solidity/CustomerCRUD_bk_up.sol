pragma solidity ^0.4.23;

contract CustomerCRUD {

   struct customer{
      string id;
      string name;
      string adds;
      uint256 dob;
      uint age;
   }

   customer[] public customers;

   uint256 public totalCustomers;



    constructor() public {
       totalCustomers = 0;
   }

   event CustomerEvent(string id,string name , string adds, uint256 dob,uint age);

   event AddressUpdated(string id , string adds);

   event CustomerDelete(string id);


   function insert( string id,string name , string adds , uint256 dob,uint age) public returns (uint256 total){
        customer memory newCustomer = customer(id,name , adds, dob,age);
        customers.push(newCustomer);
        totalCustomers++;
        //emit event
        emit CustomerEvent ( id, name ,  adds,  dob, age);
        return total;
   }

   function updateAddress(string id, string newAddress) public returns (bool success){
       //This has a problem we need loop
       for(uint256 i =0; i< totalCustomers; i++){
           if(compareStrings(customers[i].id ,id)){
              customers[i].adds = newAddress;
              emit AddressUpdated(id, newAddress);
              return true;
           }
       }
       return false;
   }

   function deleteCustomer(string id) public returns(bool success){
        require(totalCustomers > 0);
        for(uint256 i =0; i< totalCustomers; i++){
           if(compareStrings(customers[i].id , id)){
              customers[i] = customers[totalCustomers-1]; // pushing last into current arrray index which we gonna delete
              delete customers[totalCustomers-1]; // now deleteing last index
              totalCustomers--; //total count decrease
              customers.length--; // array length decrease
              //emit event
              emit CustomerDelete(id);
              return true;
           }
       }
       return false;
   }


   function getCustomer(string id) public view returns(string custId,string name , string adds , uint256 dob,uint age){
        for(uint256 i =0; i< totalCustomers; i++){
           if(compareStrings(customers[i].id, id)){
              //emit event
              return (customers[i].id,customers[i].name,customers[i].adds , customers[i].dob,customers[i].age);
           }
       }
       revert('customer not found');
   }



  function compareStrings (string a, string b)  internal pure returns (bool){
       return keccak256(a) == keccak256(b);
   }


   function getTotalCustomers() public view returns (uint256 length){
      return customers.length;
   }

   function convert(uint256 n) public returns (bytes32) {
       return bytes32(n);
   }

   function bytes32ToString (bytes32 data) returns (string) {
       bytes memory bytesString = new bytes(32);
       for (uint j=0; j<32; j++) {
           byte char = byte(bytes32(uint(data) * 2 ** (8 * j)));
           if (char != 0) {
               bytesString[j] = char;
           }
       }
       return string(bytesString);
   }

}