package generated.com.test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple5;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import rx.Observable;
import rx.functions.Func1;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.5.0.
 */
public class Customer extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50600060015561198d806100256000396000f30060806040526004361061008d5763ffffffff7c0100000000000000000000000000000000000000000000000000000000600035041663087d44e181146100925780631866dcfb14610182578063451efd93146101975780634fbb444c14610221578063518bddd91461048a5780637291cf8e14610635578063c0abda2a146106a2578063ec13eac1146106ba575b600080fd5b34801561009e57600080fd5b506040805160206004803580820135601f810184900484028501840190955284845261017094369492936024939284019190819084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a99988101979196509182019450925082915084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a9998810197919650918201945092508291508401838280828437509497505084359550505060209092013591506107519050565b60408051918252519081900360200190f35b34801561018e57600080fd5b506101706109b3565b3480156101a357600080fd5b506101ac6109b9565b6040805160208082528351818301528351919283929083019185019080838360005b838110156101e65781810151838201526020016101ce565b50505050905090810190601f1680156102135780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34801561022d57600080fd5b506040805160206004803580820135601f810184900484028501840190955284845261027a9436949293602493928401919081908401838280828437509497506109ce9650505050505050565b60405180806020018060200180602001806020018060200186810386528b818151815260200191508051906020019080838360005b838110156102c75781810151838201526020016102af565b50505050905090810190601f1680156102f45780820380516001836020036101000a031916815260200191505b5086810385528a5181528a516020918201918c019080838360005b8381101561032757818101518382015260200161030f565b50505050905090810190601f1680156103545780820380516001836020036101000a031916815260200191505b5086810384528951815289516020918201918b019080838360005b8381101561038757818101518382015260200161036f565b50505050905090810190601f1680156103b45780820380516001836020036101000a031916815260200191505b5086810383528851815288516020918201918a019080838360005b838110156103e75781810151838201526020016103cf565b50505050905090810190601f1680156104145780820380516001836020036101000a031916815260200191505b50868103825287518152875160209182019189019080838360005b8381101561044757818101518382015260200161042f565b50505050905090810190601f1680156104745780820380516001836020036101000a031916815260200191505b509a505050505050505050505060405180910390f35b34801561049657600080fd5b506040805160206004803580820135601f81018490048402850184019095528484526104e3943694929360249392840191908190840183828082843750949750610d789650505050505050565b60405180806020018060200180602001868152602001858152602001848103845289818151815260200191508051906020019080838360005b8381101561053457818101518382015260200161051c565b50505050905090810190601f1680156105615780820380516001836020036101000a031916815260200191505b5084810383528851815288516020918201918a019080838360005b8381101561059457818101518382015260200161057c565b50505050905090810190601f1680156105c15780820380516001836020036101000a031916815260200191505b50848103825287518152875160209182019189019080838360005b838110156105f45781810151838201526020016105dc565b50505050905090810190601f1680156106215780820380516001836020036101000a031916815260200191505b509850505050505050505060405180910390f35b34801561064157600080fd5b506040805160206004803580820135601f810184900484028501840190955284845261068e943694929360249392840191908190840183828082843750949750610ea99650505050505050565b604080519115158252519081900360200190f35b3480156106ae57600080fd5b506104e3600435611174565b3480156106c657600080fd5b506040805160206004803580820135601f810184900484028501840190955284845261068e94369492936024939284019190819084018382808284375050604080516020601f89358b018035918201839004830284018301909452808352979a9998810197919650918201945092508291508401838280828437509497506113619650505050505050565b600061075b61175f565b506040805160a0810182528781526020808201889052918101869052606081018590526080810184905260008054600181018083559180528251805193949293859360059093027f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e56301926107d392849291019061178f565b5060208281015180516107ec926001850192019061178f565b506040820151805161080891600284019160209091019061178f565b5060608201518160030155608082015181600401555050506001600081548092919060010191905055507f43a833eced8680af8200e93e033431c6934fe852fdd795ed411e45da8947c57c878787878760405180806020018060200180602001868152602001858152602001848103845289818151815260200191508051906020019080838360005b838110156108a9578181015183820152602001610891565b50505050905090810190601f1680156108d65780820380516001836020036101000a031916815260200191505b5084810383528851815288516020918201918a019080838360005b838110156109095781810151838201526020016108f1565b50505050905090810190601f1680156109365780820380516001836020036101000a031916815260200191505b50848103825287518152875160209182019189019080838360005b83811015610969578181015183820152602001610951565b50505050905090810190601f1680156109965780820380516001836020036101000a031916815260200191505b509850505050505050505060405180910390a15095945050505050565b60015481565b6000546060906109c890611576565b90505b90565b60608080808060005b600154811015610d0757610a916000828154811015156109f357fe5b6000918252602091829020600590910201805460408051601f6002600019610100600187161502019094169390930492830185900485028101850190915281815292830182828015610a865780601f10610a5b57610100808354040283529160200191610a86565b820191906000526020600020905b815481529060010190602001808311610a6957829003601f168201915b50505050508861169d565b15610cff576000805482908110610aa457fe5b9060005260206000209060050201600001600082815481101515610ac457fe5b9060005260206000209060050201600101600083815481101515610ae457fe5b9060005260206000209060050201600201610b1e600085815481101515610b0757fe5b906000526020600020906005020160030154611576565b610b47600086815481101515610b3057fe5b906000526020600020906005020160040154611576565b8454604080516020601f60026000196101006001881615020190951694909404938401819004810282018101909252828152918791830182828015610bcd5780601f10610ba257610100808354040283529160200191610bcd565b820191906000526020600020905b815481529060010190602001808311610bb057829003601f168201915b5050875460408051602060026001851615610100026000190190941693909304601f8101849004840282018401909252818152959a5089945092508401905082828015610c5b5780601f10610c3057610100808354040283529160200191610c5b565b820191906000526020600020905b815481529060010190602001808311610c3e57829003601f168201915b5050865460408051602060026001851615610100026000190190941693909304601f810184900484028201840190925281815295995088945092508401905082828015610ce95780601f10610cbe57610100808354040283529160200191610ce9565b820191906000526020600020905b815481529060010190602001808311610ccc57829003601f168201915b5050505050925095509550955095509550610d6e565b6001016109d7565b604080517f08c379a000000000000000000000000000000000000000000000000000000000815260206004820152601260248201527f637573746f6d6572206e6f7420666f756e640000000000000000000000000000604482015290519081900360640190fd5b5091939590929450565b60608080600080805b600154811015610d0757610d9d6000828154811015156109f357fe5b15610ea1576000805482908110610db057fe5b9060005260206000209060050201600001600082815481101515610dd057fe5b9060005260206000209060050201600101600083815481101515610df057fe5b9060005260206000209060050201600201600084815481101515610e1057fe5b906000526020600020906005020160030154600085815481101515610e3157fe5b600091825260209182902060046005909202010154855460408051601f600260001961010060018716150201909416939093049283018590048502810185019091528181529192879190830182828015610bcd5780601f10610ba257610100808354040283529160200191610bcd565b600101610d81565b6000806000600154111515610ebd57600080fd5b5060005b60015481101561116957610f7b600082815481101515610edd57fe5b6000918252602091829020600590910201805460408051601f6002600019610100600187161502019094169390930492830185900485028101850190915281815292830182828015610f705780601f10610f4557610100808354040283529160200191610f70565b820191906000526020600020905b815481529060010190602001808311610f5357829003601f168201915b50505050508461169d565b156111615760006001805403815481101515610f9357fe5b9060005260206000209060050201600082815481101515610fb057fe5b906000526020600020906005020160008201816000019080546001816001161561010002031660029004610fe592919061180d565b506001820181600101908054600181600116156101000203166002900461100d92919061180d565b506002828101805461103292848101929160001961010060018316150201160461180d565b50600382810154908201556004918201549101556001546000805490916000190190811061105c57fe5b600091825260208220600590910201906110768282611882565b611084600183016000611882565b611092600283016000611882565b506000600382018190556004909101819055600180546000199081019091558154916110bf9183016118c9565b507ef491adddeeed2ea6276bb226c00685a0cf9f69cb1d1cd9456da324b0107d8c836040518080602001828103825283818151815260200191508051906020019080838360005b8381101561111e578181015183820152602001611106565b50505050905090810190601f16801561114b5780820380516001836020036101000a031916815260200191505b509250505060405180910390a16001915061116e565b600101610ec1565b600091505b50919050565b600080548290811061118257fe5b60009182526020918290206005919091020180546040805160026001841615610100026000190190931692909204601f81018590048502830185019091528082529193509183919083018282801561121b5780601f106111f05761010080835404028352916020019161121b565b820191906000526020600020905b8154815290600101906020018083116111fe57829003601f168201915b505050505090806001018054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156112b95780601f1061128e576101008083540402835291602001916112b9565b820191906000526020600020905b81548152906001019060200180831161129c57829003601f168201915b50505060028085018054604080516020601f600019610100600187161502019094169590950492830185900485028101850190915281815295969594509092509083018282801561134b5780601f106113205761010080835404028352916020019161134b565b820191906000526020600020905b81548152906001019060200180831161132e57829003601f168201915b5050505050908060030154908060040154905085565b6000805b60015481101561156a5761141f60008281548110151561138157fe5b6000918252602091829020600590910201805460408051601f60026000196101006001871615020190941693909304928301859004850281018501909152818152928301828280156114145780601f106113e957610100808354040283529160200191611414565b820191906000526020600020905b8154815290600101906020018083116113f757829003601f168201915b50505050508561169d565b15611562578260008281548110151561143457fe5b9060005260206000209060050201600201908051906020019061145892919061178f565b507f1ef609aa737acd4252958c0b6b716185978a733226b6e52bfd324a727f4e844e8484604051808060200180602001838103835285818151815260200191508051906020019080838360005b838110156114bd5781810151838201526020016114a5565b50505050905090810190601f1680156114ea5780820380516001836020036101000a031916815260200191505b50838103825284518152845160209182019186019080838360005b8381101561151d578181015183820152602001611505565b50505050905090810190601f16801561154a5780820380516001836020036101000a031916815260200191505b5094505050505060405180910390a16001915061156f565b600101611365565b600091505b5092915050565b606060008082818515156115bf5760408051808201909152600181527f300000000000000000000000000000000000000000000000000000000000000060208201529450611694565b8593505b83156115da57600190920191600a840493506115c3565b826040519080825280601f01601f191660200182016040528015611608578160200160208202803883390190505b5091505060001982015b85156116905781516000198201917f01000000000000000000000000000000000000000000000000000000000000006030600a8a06010291849190811061165557fe5b9060200101907effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916908160001a905350600a86049550611612565b8194505b50505050919050565b6000816040518082805190602001908083835b602083106116cf5780518252601f1990920191602091820191016116b0565b51815160209384036101000a6000190180199092169116179052604051919093018190038120885190955088945090928392508401908083835b602083106117285780518252601f199092019160209182019101611709565b5181516020939093036101000a60001901801990911692169190911790526040519201829003909120939093149695505050505050565b60a06040519081016040528060608152602001606081526020016060815260200160008152602001600081525090565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106117d057805160ff19168380011785556117fd565b828001600101855582156117fd579182015b828111156117fd5782518255916020019190600101906117e2565b506118099291506118fa565b5090565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061184657805485556117fd565b828001600101855582156117fd57600052602060002091601f016020900482015b828111156117fd578254825591600101919060010190611867565b50805460018160011615610100020316600290046000825580601f106118a857506118c6565b601f0160209004906000526020600020908101906118c691906118fa565b50565b8154818355818111156118f5576005028160050283600052602060002091820191016118f59190611914565b505050565b6109cb91905b808211156118095760008155600101611900565b6109cb91905b8082111561180957600061192e8282611882565b61193c600183016000611882565b61194a600283016000611882565b50600060038201819055600482015560050161191a5600a165627a7a72305820f51fd61d44b2d888c2e9b62eab85dd4740c0c9639339959a549d5c8604f590960029";

    public static final String FUNC_INSERT = "insert";

    public static final String FUNC_TOTALCUSTOMERS = "totalCustomers";

    public static final String FUNC_GETTOTALCUSTOMERS = "getTotalCustomers";

    public static final String FUNC_GETCUSTOMERDATASTRING = "getCustomerDataString";

    public static final String FUNC_GETCUSTOMER = "getCustomer";

    public static final String FUNC_DELETECUSTOMER = "deleteCustomer";

    public static final String FUNC_CUSTOMERS = "customers";

    public static final String FUNC_UPDATEADDRESS = "updateAddress";

    public static final Event CUSTOMEREVENT_EVENT = new Event("CustomerEvent", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}),
            Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
    ;

    public static final Event ADDRESSUPDATED_EVENT = new Event("AddressUpdated", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}),
            Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
    ;

    public static final Event CUSTOMERDELETE_EVENT = new Event("CustomerDelete", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}),
            Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
    ;

    protected Customer(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Customer(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<TransactionReceipt> insert(Utf8String id, Utf8String name, Utf8String adds, Uint256 dob, Uint256 age) {
        final Function function = new Function(
                FUNC_INSERT, 
                Arrays.<Type>asList(id, name, adds, dob, age), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Uint256> totalCustomers() {
        final Function function = new Function(FUNC_TOTALCUSTOMERS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function);
    }

    public RemoteCall<Utf8String> getTotalCustomers() {
        final Function function = new Function(FUNC_GETTOTALCUSTOMERS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function);
    }

    public RemoteCall<Tuple5<Utf8String, Utf8String, Utf8String, Utf8String, Utf8String>> getCustomerDataString(Utf8String id) {
        final Function function = new Function(FUNC_GETCUSTOMERDATASTRING, 
                Arrays.<Type>asList(id), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}));
        return new RemoteCall<Tuple5<Utf8String, Utf8String, Utf8String, Utf8String, Utf8String>>(
                new Callable<Tuple5<Utf8String, Utf8String, Utf8String, Utf8String, Utf8String>>() {
                    @Override
                    public Tuple5<Utf8String, Utf8String, Utf8String, Utf8String, Utf8String> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple5<Utf8String, Utf8String, Utf8String, Utf8String, Utf8String>(
                                (Utf8String) results.get(0), 
                                (Utf8String) results.get(1), 
                                (Utf8String) results.get(2), 
                                (Utf8String) results.get(3), 
                                (Utf8String) results.get(4));
                    }
                });
    }

    public RemoteCall<Tuple5<Utf8String, Utf8String, Utf8String, Uint256, Uint256>> getCustomer(Utf8String id) {
        final Function function = new Function(FUNC_GETCUSTOMER, 
                Arrays.<Type>asList(id), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteCall<Tuple5<Utf8String, Utf8String, Utf8String, Uint256, Uint256>>(
                new Callable<Tuple5<Utf8String, Utf8String, Utf8String, Uint256, Uint256>>() {
                    @Override
                    public Tuple5<Utf8String, Utf8String, Utf8String, Uint256, Uint256> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple5<Utf8String, Utf8String, Utf8String, Uint256, Uint256>(
                                (Utf8String) results.get(0), 
                                (Utf8String) results.get(1), 
                                (Utf8String) results.get(2), 
                                (Uint256) results.get(3), 
                                (Uint256) results.get(4));
                    }
                });
    }

    public RemoteCall<TransactionReceipt> deleteCustomer(Utf8String id) {
        final Function function = new Function(
                FUNC_DELETECUSTOMER, 
                Arrays.<Type>asList(id), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Tuple5<Utf8String, Utf8String, Utf8String, Uint256, Uint256>> customers(Uint256 param0) {
        final Function function = new Function(FUNC_CUSTOMERS, 
                Arrays.<Type>asList(param0), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteCall<Tuple5<Utf8String, Utf8String, Utf8String, Uint256, Uint256>>(
                new Callable<Tuple5<Utf8String, Utf8String, Utf8String, Uint256, Uint256>>() {
                    @Override
                    public Tuple5<Utf8String, Utf8String, Utf8String, Uint256, Uint256> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple5<Utf8String, Utf8String, Utf8String, Uint256, Uint256>(
                                (Utf8String) results.get(0), 
                                (Utf8String) results.get(1), 
                                (Utf8String) results.get(2), 
                                (Uint256) results.get(3), 
                                (Uint256) results.get(4));
                    }
                });
    }

    public RemoteCall<TransactionReceipt> updateAddress(Utf8String id, Utf8String newAddress) {
        final Function function = new Function(
                FUNC_UPDATEADDRESS, 
                Arrays.<Type>asList(id, newAddress), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<Customer> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Customer.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Customer> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Customer.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public List<CustomerEventEventResponse> getCustomerEventEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(CUSTOMEREVENT_EVENT, transactionReceipt);
        ArrayList<CustomerEventEventResponse> responses = new ArrayList<CustomerEventEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            CustomerEventEventResponse typedResponse = new CustomerEventEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.id = (Utf8String) eventValues.getNonIndexedValues().get(0);
            typedResponse.name = (Utf8String) eventValues.getNonIndexedValues().get(1);
            typedResponse.adds = (Utf8String) eventValues.getNonIndexedValues().get(2);
            typedResponse.dob = (Uint256) eventValues.getNonIndexedValues().get(3);
            typedResponse.age = (Uint256) eventValues.getNonIndexedValues().get(4);
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<CustomerEventEventResponse> customerEventEventObservable(EthFilter filter) {
        return web3j.ethLogObservable(filter).map(new Func1<Log, CustomerEventEventResponse>() {
            @Override
            public CustomerEventEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(CUSTOMEREVENT_EVENT, log);
                CustomerEventEventResponse typedResponse = new CustomerEventEventResponse();
                typedResponse.log = log;
                typedResponse.id = (Utf8String) eventValues.getNonIndexedValues().get(0);
                typedResponse.name = (Utf8String) eventValues.getNonIndexedValues().get(1);
                typedResponse.adds = (Utf8String) eventValues.getNonIndexedValues().get(2);
                typedResponse.dob = (Uint256) eventValues.getNonIndexedValues().get(3);
                typedResponse.age = (Uint256) eventValues.getNonIndexedValues().get(4);
                return typedResponse;
            }
        });
    }

    public Observable<CustomerEventEventResponse> customerEventEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(CUSTOMEREVENT_EVENT));
        return customerEventEventObservable(filter);
    }

    public List<AddressUpdatedEventResponse> getAddressUpdatedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(ADDRESSUPDATED_EVENT, transactionReceipt);
        ArrayList<AddressUpdatedEventResponse> responses = new ArrayList<AddressUpdatedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            AddressUpdatedEventResponse typedResponse = new AddressUpdatedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.id = (Utf8String) eventValues.getNonIndexedValues().get(0);
            typedResponse.adds = (Utf8String) eventValues.getNonIndexedValues().get(1);
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<AddressUpdatedEventResponse> addressUpdatedEventObservable(EthFilter filter) {
        return web3j.ethLogObservable(filter).map(new Func1<Log, AddressUpdatedEventResponse>() {
            @Override
            public AddressUpdatedEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(ADDRESSUPDATED_EVENT, log);
                AddressUpdatedEventResponse typedResponse = new AddressUpdatedEventResponse();
                typedResponse.log = log;
                typedResponse.id = (Utf8String) eventValues.getNonIndexedValues().get(0);
                typedResponse.adds = (Utf8String) eventValues.getNonIndexedValues().get(1);
                return typedResponse;
            }
        });
    }

    public Observable<AddressUpdatedEventResponse> addressUpdatedEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ADDRESSUPDATED_EVENT));
        return addressUpdatedEventObservable(filter);
    }

    public List<CustomerDeleteEventResponse> getCustomerDeleteEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(CUSTOMERDELETE_EVENT, transactionReceipt);
        ArrayList<CustomerDeleteEventResponse> responses = new ArrayList<CustomerDeleteEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            CustomerDeleteEventResponse typedResponse = new CustomerDeleteEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.id = (Utf8String) eventValues.getNonIndexedValues().get(0);
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<CustomerDeleteEventResponse> customerDeleteEventObservable(EthFilter filter) {
        return web3j.ethLogObservable(filter).map(new Func1<Log, CustomerDeleteEventResponse>() {
            @Override
            public CustomerDeleteEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(CUSTOMERDELETE_EVENT, log);
                CustomerDeleteEventResponse typedResponse = new CustomerDeleteEventResponse();
                typedResponse.log = log;
                typedResponse.id = (Utf8String) eventValues.getNonIndexedValues().get(0);
                return typedResponse;
            }
        });
    }

    public Observable<CustomerDeleteEventResponse> customerDeleteEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(CUSTOMERDELETE_EVENT));
        return customerDeleteEventObservable(filter);
    }

    public static Customer load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Customer(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Customer load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Customer(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static class CustomerEventEventResponse {
        public Log log;

        public Utf8String id;

        public Utf8String name;

        public Utf8String adds;

        public Uint256 dob;

        public Uint256 age;
    }

    public static class AddressUpdatedEventResponse {
        public Log log;

        public Utf8String id;

        public Utf8String adds;
    }

    public static class CustomerDeleteEventResponse {
        public Log log;

        public Utf8String id;
    }
}
